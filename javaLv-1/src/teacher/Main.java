package teacher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Visitor visitor = new Visitor();
		for (;;) {
			System.out.println("请输入姓名:");
			String name = in.next();
			if (name.equals("n")) {
				System.out.println("退出程序");
				return;
			}
			visitor.name = name;
			System.out.println("请输入年龄:");
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
			System.out.println(name + "的年龄为:" + age + ",门票价格为:" + money + "元");
		} else {
			System.out.println(name + "的年龄为:" + age + ",门票免费");
		}

	}

}
