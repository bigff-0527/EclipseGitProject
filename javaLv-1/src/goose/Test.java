package goose;

public class Test {
	public static void main(String[] args) {
		teacher t = new teacher();
		t.name="李红";
		t.age=30;
		t.job="教师";
		//false = 女；
		t.sex=false;
		t.eat();
		t.speak();
		t.walk();
	}
}
