transformation 'class2table'
input 'Class_model'
output 'Table_model'

top_rule 'Class_2_Table' do
	 from Class_model::Class
	 to Table_model::Table
	 mapping do | class_in, table_out |
	 	 table_out.name  =  class_in.name
	 	 table_out.cols  =  class_in.attrs
	 end
end

rule 'Attribute_2_Column' do
	 from Class_model::Attribute
	 to Table_model::Column
	 mapping do | attribute_in, column_out |
	 	 column_out.name  =  attribute_in.name
	 	 column_out.type  =  attribute_in.type.name
	 end
end

top_rule 'Attribute_2_FKey' do
	 from Class_model::Attribute
	 to Table_model::FKey
	 filter do | attribute_in |
	 	 attribute_in.type.kind_of? Class_model::Class
	 end

	 mapping do | attribute_in, fkey_out |
	 	 fkey_out.references  =  attribute_in.type
	 	 fkey_out.owner  =  attribute_in.owner
	 	 fkey_out.cols  =  attribute_in.type.attrs.select { |a| a.is_primary }
	 end
end