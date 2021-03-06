/**
 * Implementation of the Cube class which extends ThreeDimensionalShape
 * 
 * @author Kevin
 *
 */
public class Cube extends ThreeDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Cube(int numberOfDimensions) {
		super(numberOfDimensions);
	}
	/**
	 * Calculate the area
	 */
	public void calculateArea() {
		area = 6 * Math.pow(dimensions[0], 2);
	}
	/**
	 * Calculate the volume
	 */
	public void calculateVolume() {
		volume = Math.pow(dimensions[0], 3);
	}

	@Override
	public String toString() {
		return String.format("%sEdge: %.2f", super.toString(), dimensions[0]);
	}

}
