transformation 'ModuleRubyTL'
input 'InMetamodel'  =>  'http://in'
output 'OutMetamodel'

decorator InMetamodel::class do
	 def  OP1
	 	 "Cuerpo del decorator - Return Type: Boolean"
	 end
end

top_rule 'r1' do
	 from InMetamodel::class
	 to OutMetamodel::table
	 filter do | class_name |
	 	 "class_name.name=Main"
	 end

	 mapping do | class_name, table_name |
	 	 table_name.name  =  class_name.name
	 end
end