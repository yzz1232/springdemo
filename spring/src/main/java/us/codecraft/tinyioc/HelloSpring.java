package us.codecraft.tinyioc;

public class HelloSpring {
	
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void println(){
		System.out.println(name);
	}
}
