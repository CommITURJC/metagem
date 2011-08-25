package hybrid.presentation;

public class ModelData{
	private String name;
	private String type;
	private String path;

	
	public ModelData(String name, String type, String path) {
		this.name = name;
		this.type = type;
		this.path = path;
	}

	public ModelData() {
		this.name = new String();
		this.type = new String();
		this.path = new String();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	
}