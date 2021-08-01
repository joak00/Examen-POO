package paint;

public class Main {

	public static void main(String[] args) {
		
		Canvas canvas = new Canvas();
		
		try {
			
		Shape heart1 = Service.buildShape("HEART");
		Shape star1 = Service.buildShape("STAR");
		Shape lightning1 = Service.buildShape("LIGHTNING");
		
		canvas.addShape(heart1, new Rectangle(new Point(0,0), new Point(10,20)));
		canvas.addShape(star1, new Rectangle(new Point(10,20), new Point(30,40)));
		canvas.addShape(lightning1, new Rectangle(new Point(30,40), new Point(60,70)));
		
		
		Point point = new Point(35,59);
		System.out.println("\nLa figura que se encuentra en el punto "+point.x+" "+point.y+" es: " + canvas.getSelected(point).toString().substring(6));
		
		
		System.out.println("\nCambiamos los colores de Heart y Star ->");
		heart1.setBackGroundColor("red");
		star1.setBorderColor("yellow");
		star1.setBackGroundColor("white");
		
		canvas.toString();
		
		} catch (Exception e) {
			System.out.println("Alguna de las figuras introducidas no es válida.");
		}
		
	}

}
