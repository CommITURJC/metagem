transformation  'class2table'
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
		 classB_Name  =  classA_name
	 end
end

rule do
	 from ClassM::table
	 to TableM::table
	 mapping do | in, out |
		 in.name  =  out.name
	 end
end