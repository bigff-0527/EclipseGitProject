package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		//照片
		Picture pic = new Picture(800,900);
		//圆
		Circle c1 = new Circle(200,350,80);
		Circle c2 = new Circle(500,350,80);
		Circle c3 = new Circle(350,400,300);
		//长方形
		Rectangle r1 = new Rectangle(250, 550, 200, 50);
		//三角
		Triangle t1 = new Triangle(300, 100, 400, 100, 350, 20);
		Triangle t2 = new Triangle(300, 100, 400, 100, 350, 200);
		//路线
		work w = new work();
		w.s();
		
		pic.add(c1);
		pic.add(c3);
		pic.add(r1);
		pic.add(t1);
		pic.add(t2);
		pic.add(c2);
		pic.draw();	
	}
}
class work{
	void s() {
		System.out.println("s");
	}
}
