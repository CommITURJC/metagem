package Traceability.presentation;

public class ModelData{
	private String name;
	private String path;
	private String metamodel;
	private boolean isMetamodel;
	
	public ModelData(String name, String path, String metamodel,
			boolean isMetamodel) {
		this.name = name;
		this.path = path;
		this.metamodel = metamodel;
		this.isMetamodel = isMetamodel;
	}

	public ModelData() {
		this.name = new String();
		this.path = new String();
		this.metamodel = new String();
		this.isMetamodel = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMetamodel() {
		return metamodel;
	}

	public void setMetamodel(String metamodel) {
		this.metamodel = metamodel;
	}

	public boolean isMetamodel() {
		return isMetamodel;
	}

	public void setIsMetamodel(boolean isMetamodel) {
		this.isMetamodel = isMetamodel;
	}
	
}