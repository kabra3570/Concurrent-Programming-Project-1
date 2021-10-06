/**File: ThreeDimensionalShape.java
 * Author: Kevin Abrahams
 * Date: 26-01-2021
 * Purpose: Implement the ThreeDimensionalShape class which extends Shape. This is a general class which shall serve as the parent
 * class for future, more specific kinds of three dimensional shapes in the class hierarchy.
 */
/**
 * Implementation of the ThreeDimensionalShape class which extends Shape
 * 
 * @author Kevin
 *
 */
public abstract class ThreeDimensionalShape extends Shape {
	protected double volume;// Volume of three dimensional shape

	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public ThreeDimensionalShape(int numberOfDimentions) {
		super(numberOfDimentions);
	}

	/**
	 * Get the volume three dimensional shape
	 * 
	 * @return Volume of three dimensional shape
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * Calculate volume
	 */
	public abstract void calculateVolume();
}
