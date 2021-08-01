package paint;

public class Rectangle {
	public final int left;	
	public final int right;
	public final int top;
	public final int bottom;
	public final int height;
	public final int width;


	Rectangle(Point start, Point end) {
		this.left = start.x;		
		this.right = end.x;
		this.top = start.y;
		this.bottom = end.y;
		this.height = this.bottom - this.top;
		this.width = this.right - this.left;
	}
	
	
	public boolean isIn(Point point) {
		if ((point.x > left) && (point.x<right) && (point.y>top) && (point.y<bottom)) {
			return true;
		}
		return false;
	}
	
}


