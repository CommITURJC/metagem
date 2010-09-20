transformation 'class2table'
input 'ClassM'  =>  'http://classM.es'
output 'TableM'  =>  'http://tableM.es'

top_rule 'r1' do
	 from ClassM::classA
	 to TableM::classB
	 filter do | classA_name |
	 	 hola
	 end

	 mapping do | classA_name, classB_Name |
	 	 classB_Name.name  =  classA_name.name
	 end
end

rule 'r2' do
	 from ClassM::table
	 to TableM::table
	 mapping do | in, out |
	 	 out  =  in.reference
	 end
end

top_rule 'rDecorator' do
	 from ClassM::datatype
	 to TableM::element
	 mapping do | d, ele |
	 	 ele  =  Calldecorator
	 end
end