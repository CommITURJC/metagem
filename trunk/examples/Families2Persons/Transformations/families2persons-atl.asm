<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm name="0">
	<cp>
		<constant value="families2persons"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
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
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
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
		<constant value="__matcher__"/>
		<constant value="A.__matchfather2male():V"/>
		<constant value="A.__matchmother2female():V"/>
		<constant value="A.__matchson2male():V"/>
		<constant value="A.__matchdaughter2female():V"/>
		<constant value="__exec__"/>
		<constant value="father2male"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyfather2male(NTransientLink;):V"/>
		<constant value="mother2female"/>
		<constant value="A.__applymother2female(NTransientLink;):V"/>
		<constant value="son2male"/>
		<constant value="A.__applyson2male(NTransientLink;):V"/>
		<constant value="daughter2female"/>
		<constant value="A.__applydaughter2female(NTransientLink;):V"/>
		<constant value="__matchfather2male"/>
		<constant value="Father"/>
		<constant value="families"/>
		<constant value="families_model"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="father_in"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="male_out"/>
		<constant value="Male"/>
		<constant value="persons"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="10:16-10:28"/>
		<constant value="10:5-12:6"/>
		<constant value="__applyfather2male"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="J.getFatherName():J"/>
		<constant value="fullName"/>
		<constant value="11:19-11:28"/>
		<constant value="11:19-11:44"/>
		<constant value="11:7-11:44"/>
		<constant value="link"/>
		<constant value="__matchmother2female"/>
		<constant value="Mother"/>
		<constant value="mother_in"/>
		<constant value="female_out"/>
		<constant value="Female"/>
		<constant value="20:18-20:32"/>
		<constant value="20:5-22:6"/>
		<constant value="__applymother2female"/>
		<constant value="firstName"/>
		<constant value="familyMother"/>
		<constant value="lastName"/>
		<constant value="J.+(J):J"/>
		<constant value="21:19-21:28"/>
		<constant value="21:19-21:38"/>
		<constant value="21:41-21:50"/>
		<constant value="21:41-21:63"/>
		<constant value="21:41-21:72"/>
		<constant value="21:19-21:72"/>
		<constant value="21:7-21:72"/>
		<constant value="__matchson2male"/>
		<constant value="Son"/>
		<constant value="son_in"/>
		<constant value="30:16-30:28"/>
		<constant value="30:5-32:6"/>
		<constant value="__applyson2male"/>
		<constant value="familySon"/>
		<constant value="31:19-31:25"/>
		<constant value="31:19-31:35"/>
		<constant value="31:38-31:44"/>
		<constant value="31:38-31:54"/>
		<constant value="31:38-31:63"/>
		<constant value="31:19-31:63"/>
		<constant value="31:7-31:63"/>
		<constant value="__matchdaughter2female"/>
		<constant value="Daughter"/>
		<constant value="daughter_in"/>
		<constant value="40:18-40:32"/>
		<constant value="40:5-42:6"/>
		<constant value="__applydaughter2female"/>
		<constant value="familyDaughter"/>
		<constant value="41:19-41:30"/>
		<constant value="41:19-41:40"/>
		<constant value="41:43-41:54"/>
		<constant value="41:43-41:69"/>
		<constant value="41:43-41:78"/>
		<constant value="41:19-41:78"/>
		<constant value="41:7-41:78"/>
		<constant value="getFatherName"/>
		<constant value="Mfamilies!Father;"/>
		<constant value="0"/>
		<constant value=" "/>
		<constant value="familyFather"/>
		<constant value="47:4-47:8"/>
		<constant value="47:4-47:18"/>
		<constant value="47:21-47:24"/>
		<constant value="47:4-47:24"/>
		<constant value="47:27-47:31"/>
		<constant value="47:27-47:44"/>
		<constant value="47:27-47:53"/>
		<constant value="47:4-47:53"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<call arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<call arg="10"/>
			<call arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<call arg="15"/>
			<getasm/>
			<call arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<call arg="40"/>
			<getasm/>
			<call arg="41"/>
			<getasm/>
			<call arg="42"/>
			<getasm/>
			<call arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<call arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<call arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="64"/>
			<push arg="65"/>
			<new/>
			<call arg="66"/>
			<pusht/>
			<call arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="68" begin="21" end="23"/>
			<lne id="69" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="70">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="72"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="73"/>
			<store arg="74"/>
			<load arg="74"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<call arg="75"/>
			<call arg="30"/>
			<set arg="76"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="77" begin="11" end="11"/>
			<lne id="78" begin="11" end="12"/>
			<lne id="79" begin="9" end="14"/>
			<lne id="69" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="15"/>
			<lve slot="2" name="61" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="80" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="81">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="82"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<call arg="60"/>
			<dup/>
			<push arg="83"/>
			<load arg="19"/>
			<call arg="62"/>
			<dup/>
			<push arg="84"/>
			<push arg="85"/>
			<push arg="65"/>
			<new/>
			<call arg="66"/>
			<pusht/>
			<call arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="86" begin="21" end="23"/>
			<lne id="87" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="83" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="88">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="83"/>
			<call arg="72"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="84"/>
			<call arg="73"/>
			<store arg="74"/>
			<load arg="74"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="89"/>
			<load arg="29"/>
			<get arg="90"/>
			<get arg="91"/>
			<call arg="92"/>
			<call arg="30"/>
			<set arg="76"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="93" begin="11" end="11"/>
			<lne id="94" begin="11" end="12"/>
			<lne id="95" begin="13" end="13"/>
			<lne id="96" begin="13" end="14"/>
			<lne id="97" begin="13" end="15"/>
			<lne id="98" begin="11" end="16"/>
			<lne id="99" begin="9" end="18"/>
			<lne id="87" begin="8" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="84" begin="7" end="19"/>
			<lve slot="2" name="83" begin="3" end="19"/>
			<lve slot="0" name="17" begin="0" end="19"/>
			<lve slot="1" name="80" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="100">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="101"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<call arg="60"/>
			<dup/>
			<push arg="102"/>
			<load arg="19"/>
			<call arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="64"/>
			<push arg="65"/>
			<new/>
			<call arg="66"/>
			<pusht/>
			<call arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="103" begin="21" end="23"/>
			<lne id="104" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="102" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="105">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="102"/>
			<call arg="72"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="73"/>
			<store arg="74"/>
			<load arg="74"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="89"/>
			<load arg="29"/>
			<get arg="106"/>
			<get arg="91"/>
			<call arg="92"/>
			<call arg="30"/>
			<set arg="76"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="107" begin="11" end="11"/>
			<lne id="108" begin="11" end="12"/>
			<lne id="109" begin="13" end="13"/>
			<lne id="110" begin="13" end="14"/>
			<lne id="111" begin="13" end="15"/>
			<lne id="112" begin="11" end="16"/>
			<lne id="113" begin="9" end="18"/>
			<lne id="104" begin="8" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="19"/>
			<lve slot="2" name="102" begin="3" end="19"/>
			<lve slot="0" name="17" begin="0" end="19"/>
			<lve slot="1" name="80" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="114">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="115"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<call arg="60"/>
			<dup/>
			<push arg="116"/>
			<load arg="19"/>
			<call arg="62"/>
			<dup/>
			<push arg="84"/>
			<push arg="85"/>
			<push arg="65"/>
			<new/>
			<call arg="66"/>
			<pusht/>
			<call arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="117" begin="21" end="23"/>
			<lne id="118" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="116" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="119">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="116"/>
			<call arg="72"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="84"/>
			<call arg="73"/>
			<store arg="74"/>
			<load arg="74"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="89"/>
			<load arg="29"/>
			<get arg="120"/>
			<get arg="91"/>
			<call arg="92"/>
			<call arg="30"/>
			<set arg="76"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="121" begin="11" end="11"/>
			<lne id="122" begin="11" end="12"/>
			<lne id="123" begin="13" end="13"/>
			<lne id="124" begin="13" end="14"/>
			<lne id="125" begin="13" end="15"/>
			<lne id="126" begin="11" end="16"/>
			<lne id="127" begin="9" end="18"/>
			<lne id="118" begin="8" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="84" begin="7" end="19"/>
			<lve slot="2" name="116" begin="3" end="19"/>
			<lve slot="0" name="17" begin="0" end="19"/>
			<lve slot="1" name="80" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="128">
		<context type="129"/>
		<parameters>
		</parameters>
		<code>
			<load arg="130"/>
			<get arg="89"/>
			<push arg="131"/>
			<call arg="92"/>
			<load arg="130"/>
			<get arg="132"/>
			<get arg="91"/>
			<call arg="92"/>
		</code>
		<linenumbertable>
			<lne id="133" begin="0" end="0"/>
			<lne id="134" begin="0" end="1"/>
			<lne id="135" begin="2" end="2"/>
			<lne id="136" begin="0" end="3"/>
			<lne id="137" begin="4" end="4"/>
			<lne id="138" begin="4" end="5"/>
			<lne id="139" begin="4" end="6"/>
			<lne id="140" begin="0" end="7"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
</asm>
