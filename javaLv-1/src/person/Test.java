package person;
public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("4300","史小静",88);
		p1.output();
		Person p2 = new Person();
		p2.setId("4400");
		p2.setName("刘小虎");
		p2.setScore(90);
		p2.output();
	}
}
class Person{
	private String id;
	private String name;
	private double score;
	public Person() {
	}
	public Person(String id,String name,double score) {
		this.id=id;
		this.name=name;
		this.score=score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public void output() {
		System.out.println("姓名:"+name+",学号:"+id+",成绩:"+score+"分");
	}
}