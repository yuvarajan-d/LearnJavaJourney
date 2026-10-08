package collection;

public class Studentinfo {

	private String sname;
	
	private int age;
	
	private String clg;	

	public Studentinfo(String sname, int age, String clg) {
		this.sname = sname;
		this.age = age;
		this.clg = clg;
	}

	public Studentinfo() {
		
	}
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}
	
	
	

	
	
	
}
