transformation  'ModuleRubyTL'
input 'InMetamodel'  => 
output 'OutMetamodel'  => 

decorator  InMetamodel::Src1 do
	 def  OP1
		 "Cuerpo del decorator - Return Type: Boolean"
	 end
end

top_rule RuleTest1 do
	 from InMetamodel::Src1
	 to OutMetamodel::Trg1

	 mapping do |   |
		 trg1.ElcIncTrg1  =  src1.ElcIncSrc1
	 end
end

top_rule RuleTest2 do
	 from InMetamodel::Src2
	 to OutMetamodel::Trg2

	 mapping do |   |
		 trg2.ElcIncTrg2  =  src2.ElcIncSrc2
	 end
end