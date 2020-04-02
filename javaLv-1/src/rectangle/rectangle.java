package rectangle;

 class a {
	private int height;
	private int width;
	public a() {
		
	}
	public a(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public int  perimeter() {
		int C = height*2+width*2;
		return C ;
	}
	public int area() {
		return height*width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

}
public class rectangle{
	public static void main(String[] args) {

		
	}
}