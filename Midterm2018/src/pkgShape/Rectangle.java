package pkgShape;

public class Rectangle extends Shape implements Comparable<Object> {
	private int iWidth;
	private int iLength;

	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	@Override
	public int compareTo(Object o) {
		return (int) (this.area() - ((Rectangle) o).area());
	}

	@Override
	public double perimeter() {
		return (2 * iWidth + 2 * iLength);
	}
	
	@Override
	public double area() {
		return iWidth * iLength;
	}
}
