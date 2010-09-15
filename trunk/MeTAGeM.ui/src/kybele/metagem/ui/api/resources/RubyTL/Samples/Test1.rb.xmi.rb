transformation  'class2table'
input 'ClassM'  =>  'http://classM.es'
output 'TableM'  =>  'http://tableM.es'

decorator  ClassM::classA do
	 def  decorator_name
		 decorator_body
	 end
end

decorator  ClassM::classA do
	 def  d2
		 b2
	 end
end

top_rule 'r1' do
	 from ClassM::classA
	 to TableM::classB

	 filter do |   |
		 hola
	 end

	 mapping do |   |
		 classB_Name.name  =  classA_name.name
	 end
end

copy_rule 'copy_RULE' do
	 from ClassM::c_A
	 to TableM::c_b

	 mapping do |   |
		 to_c  =  from_c
	 end
end