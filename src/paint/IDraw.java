package paint;

public interface IDraw {
	
	default void draw(Shape shape) {
		System.out.println("La siguiente figura ha sido pintada: "+shape.getClass().getName().substring(6) 
				+ " con borde de color: "+ shape.getBorderColor() 
				+ " y fondo de color: "+ shape.getBackGroundColor());
	}
}
