package goose;

public class Test {
	public static void main(String[] args) {
		teacher t = new teacher();
		t.name="Àîºì";
		t.age=20;
		t.job="½ÌÊ¦";
		//false = Å®£»
		t.sex=false;
		t.eat();
		t.speak();
		t.walk();
	}
}
