package teacher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Visitor visitor = new Visitor();
		for (;;) {
			System.out.println("����������:");
			String name = in.next();
			if (name.equals("n")) {
				System.out.println("�˳�����");
				return;
			}
			visitor.name = name;
			System.out.println("����������:");
			int age = in.nextInt();
			visitor.age = age;
			visitor.output();
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println();
		}
	}
}
class Visitor {
	String name;
	int age;
	public void output() {
		int money = 0;
		if (age > 5) {
			money = 20;
			System.out.println(name + "������Ϊ:" + age + ",��Ʊ�۸�Ϊ:" + money + "Ԫ");
		} else {
			System.out.println(name + "������Ϊ:" + age + ",��Ʊ���");
		}

	}

}
