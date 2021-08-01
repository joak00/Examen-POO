package paint;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	private final List<Shape> shapesList = new ArrayList<Shape>();

	public List<Shape> addShape(Shape shape, Rectangle rectangle) {
		shape.setBackGroundColor("white");
		shape.setBorderColor("black");
		shape.setRectangle(rectangle);
		shapesList.add(shape);
		shape.draw(shape);

		return shapesList;
	}
	

	public Shape getSelected(Point point) {
		for (Shape shapes : shapesList) {
			if (shapes.getRectangle().isIn(point)) {
				return shapes;
			}
		}
		return null;
	}

	
	@Override
	public String toString() {
		System.out.println("\nEl lienzo contiene las siguientes figuras: ");
		for (int i = 0; i < shapesList.size(); i++) {
			System.out.println(shapesList.get(i).getClass().getName().substring(6) + " con borde de color: "
					+ shapesList.get(i).getBorderColor() + " y fondo de color: "
					+ shapesList.get(i).getBackGroundColor());
		}
		return "";
	}

}
