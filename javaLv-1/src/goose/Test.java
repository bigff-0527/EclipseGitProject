package goose;

public class Test {
	public static void main(String[] args) {
		teacher t = new teacher();
		t.name="���";
		t.age=30;
		t.job="��ʦ";
		//false = Ů��
		t.sex=false;
		t.eat();
		t.speak();
		t.walk();
	}
}
