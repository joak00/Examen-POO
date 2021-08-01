package paint;

public interface Service {
	
	static Shape buildShape(String shape) {
		if (shape == EnumShapes.STAR.name()) {
			return new Star();
		} else if (shape == EnumShapes.HEART.name()) {
			return new Heart();
		} else if (shape == EnumShapes.LIGHTNING.name()) {
			return new Lightning();
		}
		return null;
	}
	
}
