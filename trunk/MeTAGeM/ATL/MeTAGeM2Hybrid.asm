<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm name="0">
	<cp>
		<constant value="MeTAGeM2Hybrid"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J;"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="0"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchModule():V"/>
		<constant value="__matchModule"/>
		<constant value="ModelRoot"/>
		<constant value="AMW"/>
		<constant value="Sequence"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="CJ.union(CJ):CJ"/>
		<constant value="left"/>
		<constant value="right"/>
		<constant value="1"/>
		<constant value="B.not():B"/>
		<constant value="47"/>
		<constant value="TransientLink"/>
		<constant value="Module"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="amw"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="hybrid"/>
		<constant value="MM_Hybrid"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink(NTransientLink;):V"/>
		<constant value="8:12-8:28"/>
		<constant value="__resolve__"/>
		<constant value="J"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__exec__"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyModule(NTransientLink;):V"/>
		<constant value="__applyModule"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="nombremodulo: "/>
		<constant value="J.debug(J):J"/>
		<constant value="name_module"/>
		<constant value="inputModel"/>
		<constant value="inMM"/>
		<constant value="outputModel"/>
		<constant value="outMM"/>
		<constant value="9:19-9:22"/>
		<constant value="9:19-9:27"/>
		<constant value="9:34-9:50"/>
		<constant value="9:19-9:51"/>
		<constant value="9:4-9:51"/>
		<constant value="10:15-10:18"/>
		<constant value="10:15-10:29"/>
		<constant value="10:7-10:29"/>
		<constant value="11:13-11:16"/>
		<constant value="11:13-11:28"/>
		<constant value="11:4-11:28"/>
		<constant value="link"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<load arg="7"/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="10"/>
			<call arg="11"/>
			<dup/>
			<push arg="12"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="13"/>
			<call arg="11"/>
			<call arg="14"/>
			<set arg="3"/>
			<load arg="7"/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<load arg="7"/>
			<call arg="16"/>
			<load arg="7"/>
			<call arg="17"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="19">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<load arg="7"/>
			<call arg="20"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="21">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="22"/>
			<push arg="23"/>
			<findme/>
			<push arg="24"/>
			<push arg="9"/>
			<new/>
			<swap/>
			<dup_x1/>
			<push arg="25"/>
			<call arg="26"/>
			<call arg="27"/>
			<swap/>
			<dup_x1/>
			<push arg="28"/>
			<call arg="26"/>
			<call arg="27"/>
			<swap/>
			<dup_x1/>
			<push arg="29"/>
			<call arg="26"/>
			<call arg="27"/>
			<swap/>
			<pop/>
			<iterate/>
			<store arg="30"/>
			<pusht/>
			<call arg="31"/>
			<if arg="32"/>
			<load arg="7"/>
			<get arg="1"/>
			<push arg="33"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="34"/>
			<call arg="35"/>
			<dup/>
			<push arg="36"/>
			<load arg="30"/>
			<call arg="37"/>
			<dup/>
			<push arg="38"/>
			<push arg="34"/>
			<push arg="39"/>
			<new/>
			<call arg="40"/>
			<call arg="41"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="42" begin="42" end="44"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="36" begin="24" end="46"/>
			<lve slot="0" name="18" begin="0" end="47"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
			<parameter name="30" type="44"/>
		</parameters>
		<code>
			<load arg="30"/>
			<load arg="7"/>
			<get arg="3"/>
			<call arg="45"/>
			<if arg="46"/>
			<load arg="7"/>
			<get arg="1"/>
			<load arg="30"/>
			<call arg="47"/>
			<dup/>
			<call arg="48"/>
			<if arg="49"/>
			<load arg="30"/>
			<call arg="50"/>
			<goto arg="51"/>
			<pop/>
			<load arg="30"/>
			<goto arg="52"/>
			<push arg="24"/>
			<push arg="9"/>
			<new/>
			<load arg="30"/>
			<iterate/>
			<store arg="53"/>
			<load arg="7"/>
			<load arg="53"/>
			<call arg="54"/>
			<call arg="55"/>
			<enditerate/>
			<call arg="56"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="57" begin="23" end="27"/>
			<lve slot="0" name="18" begin="0" end="29"/>
			<lve slot="1" name="58" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="59">
		<context type="6"/>
		<parameters>
			<parameter name="30" type="44"/>
			<parameter name="53" type="60"/>
		</parameters>
		<code>
			<load arg="7"/>
			<get arg="1"/>
			<load arg="30"/>
			<call arg="47"/>
			<load arg="30"/>
			<load arg="53"/>
			<call arg="61"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="6"/>
			<lve slot="1" name="58" begin="0" end="6"/>
			<lve slot="2" name="62" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<load arg="7"/>
			<get arg="1"/>
			<push arg="34"/>
			<call arg="64"/>
			<iterate/>
			<store arg="30"/>
			<load arg="7"/>
			<load arg="30"/>
			<call arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="57" begin="5" end="8"/>
			<lve slot="0" name="18" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="66">
		<context type="6"/>
		<parameters>
			<parameter name="30" type="67"/>
		</parameters>
		<code>
			<load arg="30"/>
			<push arg="36"/>
			<call arg="68"/>
			<store arg="53"/>
			<load arg="30"/>
			<push arg="38"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<load arg="7"/>
			<load arg="53"/>
			<get arg="62"/>
			<push arg="71"/>
			<call arg="72"/>
			<call arg="54"/>
			<set arg="73"/>
			<dup/>
			<load arg="7"/>
			<load arg="53"/>
			<get arg="74"/>
			<call arg="54"/>
			<set arg="75"/>
			<dup/>
			<load arg="7"/>
			<load arg="53"/>
			<get arg="76"/>
			<call arg="54"/>
			<set arg="77"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="78" begin="11" end="11"/>
			<lne id="79" begin="11" end="12"/>
			<lne id="80" begin="13" end="13"/>
			<lne id="81" begin="11" end="14"/>
			<lne id="82" begin="9" end="16"/>
			<lne id="83" begin="19" end="19"/>
			<lne id="84" begin="19" end="20"/>
			<lne id="85" begin="17" end="22"/>
			<lne id="86" begin="25" end="25"/>
			<lne id="87" begin="25" end="26"/>
			<lne id="88" begin="23" end="28"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="36" begin="3" end="29"/>
			<lve slot="3" name="38" begin="7" end="29"/>
			<lve slot="0" name="18" begin="0" end="29"/>
			<lve slot="1" name="89" begin="0" end="29"/>
		</localvariabletable>
	</operation>
</asm>
