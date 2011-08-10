package metagem.presentation;

public class ModelData{
	private String name;
	private String path;

	
	public ModelData(String name, String path) {
		this.name = name;
		this.path = path;
	}

	public ModelData() {
		this.name = new String();
		this.path = new String();
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

	
}