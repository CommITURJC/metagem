model_to_model :class2table do |t|
  t.sources :package   => 'Class_model',
            :model     => 'models/class-source.ecore.xmi',            
            :metamodel => 'metamodels/ClassM.ecore'
            
  t.targets :package   => 'Table_model',
            :model     => 'models/relational.ecore.xmi',
            :metamodel => 'metamodels/TableM.ecore'

  t.transformation 'transformations/class2table.rb'
end