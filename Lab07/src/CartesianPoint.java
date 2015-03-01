
/**
 * A single point on a Cartesian plane
 * 
 * @author parks
 *
 */
public class CartesianPoint {
	
	private double x;
	private double y;
	
	/**
	 * Constructor given the coordinates of the point
	 * 
	 * @param xVal
	 * @param yVal
	 */
	public CartesianPoint(double xVal, double yVal) {
		x = xVal;
		y = yVal;
	}

	/**
	 * Accessor to return the x value
	 * 
	 * @return x value of this point
	 */
	public double getX() {
		return x;
	}

	/**
	 * Accessor to return the y value
	 * @return y value of this point
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Accessor to calculate the distance to another point
	 * 
	 * @param other point for distance calculation
	 * @return distance to other
	 */
	public double distance(CartesianPoint other) {
		double d = 0;
		double xDiff = other.getX() - getX();
		double yDiff = other.getY() - getY();
		d = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
		return d;
	}
	
	/**
	 * Accessor to return this point in a String format
	 * 
	 * @return String representation of this point
	 */
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}

}
