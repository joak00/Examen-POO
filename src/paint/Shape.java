package paint;

public abstract class Shape implements IShapes, Service, IDraw {
	
	private String backGroundColor;
	private String borderColor;
	private Rectangle rectangle;
	
	
	@Override
	public void setBackGroundColor(String backGroundColor) {
		this.backGroundColor = backGroundColor;
	}


	@Override
	public String getBackGroundColor() {
		return this.backGroundColor;
	}


	@Override
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}


	@Override
	public String getBorderColor() {
		return this.borderColor;
	}


	@Override
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}


	@Override
	public Rectangle getRectangle() {
		return this.rectangle;
	}
	
	

}