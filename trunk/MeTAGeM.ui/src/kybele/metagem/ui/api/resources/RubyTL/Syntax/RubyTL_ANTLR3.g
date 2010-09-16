grammar RubyTL_ANTLR3;@header {package org.eclipse.gmt.tcs.injector;}@lexer::header {package org.eclipse.gmt.tcs.injector;}@lexer::members {

	private void newline() {}

	public org.eclipse.gmt.tcs.injector.TCSRuntime ei = null;

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		ei.reportError((Exception)e);
	}

	public Token emit() {
		org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken ret = null;

		ret = new org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken(input, type, channel, tokenStartCharIndex, getCharIndex()-1);
		ret.setLine(tokenStartLine);
		ret.setText(text);
	  	ret.setCharPositionInLine(tokenStartCharPositionInLine);
		ret.setEndLine(getLine());
		ret.setEndColumn(getCharPositionInLine());
		emit(ret);

		return ret;
	}

} @members {
    public org.eclipse.gmt.tcs.injector.TCSRuntime ei = null;
    
//	public void reportError(RecognitionException ex) {
//		ei.reportError((Exception)ex);
//	}
	
//	public void emitErrorMessage(String s) {
//		ei.reportError(s);
//	}

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		ei.reportError((Exception)e);
	}

	//TODO: what about warnings?
//	public void reportWarning(String s) {
//		ei.reportWarning(s);
//	}
	
    public static void main(String[] args) throws Exception {
						CharStream input = new ANTLRFileStream(args[0]);
    RubyTL_ANTLR3Lexer lex = new 
    RubyTL_ANTLR3Lexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lex);
						tokens.discardTokenType(WS);
						tokens.discardTokenType(COMMENT);
						tokens.discardTokenType(NL);
						
    RubyTL_ANTLR3Parser parser = new 
    RubyTL_ANTLR3Parser(tokens);
						parser.main();
					}
}

main returns[Object ret2] @init {}
	:	((ret=transformation) EOF)
        {
            ret2=ret;
        }

	;

identifier returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=NAME {ret = ast.getText(); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

stringSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=STRING {ret = ei.unescapeString(ast.getText(), 1); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

integerSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=INT {ret = Integer.valueOf(ast.getText()); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

floatSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=FLOAT {ret = Double.valueOf(ast.getText()); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

transformation returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Transformation", true, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('transformation ' temp=stringSymbol {ei.set(ret, "name", temp);} 'input' ((temp=metamodel {ei.set(ret, "sourceMetamodels", temp);} ((temp=metamodel {ei.set(ret, "sourceMetamodels", temp);}))*))? 'output' ((temp=metamodel {ei.set(ret, "targetMetamodels", temp);} ((temp=metamodel {ei.set(ret, "targetMetamodels", temp);}))*))? (() {}| () {}) ((temp=decorator {ei.set(ret, "decorators", temp);} ((() temp=decorator {ei.set(ret, "decorators", temp);}))*))? (() {}| () {}) ((temp=rule {ei.set(ret, "rules", temp);} ((() temp=rule {ei.set(ret, "rules", temp);}))*))?)
        {
            ei.leaveContext(true);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

metamodel returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Metamodel", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=stringSymbol {ei.set(ret, "name", temp);} ' => ' temp=stringSymbol {ei.set(ret, "uri", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

rule returns[Object ret2] @init {}
	:	((ret=copyRule| ret=topRule))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

copyRule returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("CopyRule", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('copy_rule' temp=stringSymbol {ei.set(ret, "name", temp);} 'do' '	' 'from' ((temp=fromElement {ei.set(ret, "from", temp);} ((temp=fromElement {ei.set(ret, "from", temp);}))*))? '	' 'to' ((temp=toElement {ei.set(ret, "to", temp);} ((temp=toElement {ei.set(ret, "to", temp);}))*))? (('	' 'filter do | ' ((temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);} (((', ') temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);}))*))? ' |' '		' temp=filter {ei.set(ret, "filter", temp);} '	' 'end') {}| () {}) (('	' 'mapping do | ' ((temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);} (((', ') temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);}))*))? ((', ') {}| () {}) ((temp=identifier {ei.setRef(ret, "to", "ToElement", "name", temp, null, "never", null, false, null);} (((', ') temp=identifier {ei.setRef(ret, "to", "ToElement", "name", temp, null, "never", null, false, null);}))*))? ' |' temp=mapping {ei.set(ret, "mapping", temp);} '	' 'end') {}| () {}) 'end')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

topRule returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("TopRule", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('top_rule' temp=stringSymbol {ei.set(ret, "name", temp);} 'do' '	' 'from' ((temp=fromElement {ei.set(ret, "from", temp);} ((temp=fromElement {ei.set(ret, "from", temp);}))*))? '	' 'to' ((temp=toElement {ei.set(ret, "to", temp);} ((temp=toElement {ei.set(ret, "to", temp);}))*))? (('	' 'filter do | ' ((temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);} (((', ') temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);}))*))? ' |' '		' temp=filter {ei.set(ret, "filter", temp);} '	' 'end') {}| () {}) (('	' 'mapping do | ' ((temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);} (((', ') temp=identifier {ei.setRef(ret, "from", "FromElement", "name", temp, null, "never", null, false, null);}))*))? ((', ') {}| () {}) ((temp=identifier {ei.setRef(ret, "to", "ToElement", "name", temp, null, "never", null, false, null);} (((', ') temp=identifier {ei.setRef(ret, "to", "ToElement", "name", temp, null, "never", null, false, null);}))*))? ' |' temp=mapping {ei.set(ret, "mapping", temp);} '	' 'end') {}| () {}) 'end')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

filter returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Filter", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.set(ret, "expression", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

mapping returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Mapping", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('		' ((temp=binding {ei.set(ret, "bindings", temp);} ((('		') temp=binding {ei.set(ret, "bindings", temp);}))*))?)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

binding returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Binding", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=expression {ei.set(ret, "target", temp);} ' = ' temp=expression {ei.set(ret, "source", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

expression returns[Object ret2] @init {}
	:	((ret=expVariable| ret=expGet))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

expVariable returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("ExpVariable", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.setRef(ret, "variable", "Variable", "name", temp, null, "never", null, false, null);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

expGet returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("ExpGet", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=expression {ei.set(ret, "source", temp);} (((() {ei.set(ret, "property", "");}| (POINT) {})) {}| () {}) (() {ei.set(ret, "property", "");}| (temp=identifier {ei.set(ret, "property", temp);}) {}))
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

variable returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Variable", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.set(ret, "name", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

fromElement returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("FromElement", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.setRef(ret, "metamodel", "Metamodel", "name", temp, null, "never", null, false, null);} COLONCOLON temp=identifier {ei.set(ret, "classname", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

toElement returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("ToElement", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.setRef(ret, "metamodel", "Metamodel", "name", temp, null, "never", null, false, null);} COLONCOLON temp=identifier {ei.set(ret, "classname", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

decorator returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Decorator", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('decorator ' temp=fromElement {ei.set(ret, "context", temp);} 'do' '	' 'def ' temp=identifier {ei.set(ret, "name", temp);} '		' temp=identifier {ei.set(ret, "body", temp);} '	' 'end' 'end')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

	
// testLiterals = false;

NL
	:	(	'\r' '\n'
		|	'\n' '\r'	//Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;

WS
	:	(	' '
		|	'\t'
		)
	;

fragment
DIGIT
	:	'0'..'9'
	;

fragment
ALPHA
	:	'a'..'z'
	|	'A'..'Z'
	|	'_'
	//For Unicode compatibility (from 0000 to 00ff)
	|	'\u00C0' .. '\u00D6'
	|	'\u00D8' .. '\u00F6'
	|	'\u00F8' .. '\u00FF'
	;

fragment
SNAME
//	options {
//		testLiterals = true;
//	}
	:	(ALPHA) (ALPHA | DIGIT)*
;

NAME
	:	(
			SNAME
//			s:SNAME {if(s.getType() != SNAME) $setType(s.getType());}
		|	'"'!
			(	ESC
			|	'\n' {newline();}
			|	~('\\'|'\"'|'\n')
			)*
			'"'!
			{setText(ei.unescapeString(getText(), 1));}
		)
	;

INT
	:	(DIGIT)+
//		(('.' DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
	;

	FLOAT	:	DIGIT+ '.' DIGIT*	;

fragment
ESC
	:	'\\'!
		(	'n' //{setText("\n");}
		|	'r' //{setText("\r");}
		|	't' //{setText("\t");}
		|	'b' //{setText("\b");}
		|	'f' //{setText("\f");}
		|	'"' //{setText("\"");}
		|	'\'' //{setText("\'");}
		|	'\\' //{setText("\\");}
		|	(
				('0'..'3')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
					(
//						options {
//							warnWhenFollowAmbig = false;
//						}
					:	'0'..'7'
					)?
				)?
			|	('4'..'7')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
				)?
			)
				{
//					String s = getText();
//					int i;
//					int ret = 0;
//					String ans;
//					for (i=0; i<s.length(); ++i)
//						ret = ret*8 + s.charAt(i) - '0';
//					ans = String.valueOf((char) ret);
//					setText(ans);
				}
		)
	;
	

LSQUARE @init {}
	:	'['
        {
            
        }

	;

RSQUARE @init {}
	:	']'
        {
            
        }

	;

EXCL @init {}
	:	'!'
        {
            
        }

	;

COMA @init {}
	:	','
        {
            
        }

	;

LPAREN @init {}
	:	'('
        {
            
        }

	;

RPAREN @init {}
	:	')'
        {
            
        }

	;

LCURLY @init {}
	:	'{'
        {
            
        }

	;

RCURLY @init {}
	:	'}'
        {
            
        }

	;

SEMI @init {}
	:	';'
        {
            
        }

	;

COLON @init {}
	:	':'
        {
            
        }

	;

PIPE @init {}
	:	'|'
        {
            
        }

	;

SHARP @init {}
	:	'#'
        {
            
        }

	;

QMARK @init {}
	:	'?'
        {
            
        }

	;

COLONCOLON @init {}
	:	'::'
        {
            
        }

	;

POINT @init {}
	:	'.'
        {
            
        }

	;

RARROW @init {}
	:	'->'
        {
            
        }

	;

MINUS @init {}
	:	'-'
        {
            
        }

	;

STAR @init {}
	:	'*'
        {
            
        }

	;

SLASH @init {}
	:	'/'
        {
            
        }

	;

PLUS @init {}
	:	'+'
        {
            
        }

	;

EQ @init {}
	:	'='
        {
            
        }

	;

GT @init {}
	:	'>'
        {
            
        }

	;

LT @init {}
	:	'<'
        {
            
        }

	;

GE @init {}
	:	'>='
        {
            
        }

	;

LE @init {}
	:	'<='
        {
            
        }

	;

NE @init {}
	:	'<>'
        {
            
        }

	;

LARROW @init {}
	:	'<-'
        {
            
        }

	;

COMMENT @init {}
	:	(('--' (~('\r'| '\n'))*))
        {
            
        }

	;

STRING @init {}
	:	(('\'' (options {greedy = false;} : (('\\'! ~ '\n')| '\n'| ~('\\'| '\n')))* '\''))
        {
            
        }

	;
