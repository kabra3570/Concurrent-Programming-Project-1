/**File: ShapeTest.java
 * Author: Kevin Abrahams
 * Date: 26-01-2021
 * Purpose: Implement the ShapeTest class which functions as a tester program for the shapes. This is the starting point of the program which launches
 * a selection menu for the shapes.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Test class for shapes
 * 
 * @author Kevin
 *
 */
public class ShapeTest {

	/**
	 * Main method of the application.
	 * 
	 * @param args - Array of command line argument
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		System.out.println("*********Welcome to the Java OO Shapes Program **********");
		do {
			printMenu();
			ch = getChoice(sc);
			if (ch != 10)
				processChoice(ch, sc);
			else
				break;
		} while (wantToContinue(sc));
		SimpleDateFormat df = new SimpleDateFormat("MMM dd 'at' H:m a");
		System.out.println("Thanks for using the program. Today is " + df.format(new Date()));
	}

	/**
	 * Do you want to continue
	 * 
	 * @param sc - Scanner to get the user input
	 * @return True/False
	 */
	private static boolean wantToContinue(Scanner sc) {
		System.out.println("Would you like to continue? (Y or N)");
		boolean choice = false;
		char ch = '\0';
		while (ch == '\0') {
			String str = sc.next();
			if (str != null && !str.trim().isEmpty() && str.length() == 1
					&& (str.toUpperCase().charAt(0) == 'Y' || str.toUpperCase().charAt(0) == 'N')) {
				choice = str.toUpperCase().charAt(0) == 'Y' ? true : false;
				ch = str.toUpperCase().charAt(0);
			} else {
				ch = '\0';
				System.out.println("Sorry I do not understand. Enter Y or N");
			}
		}
		return choice;
	}

	/**
	 * Process the choice entered by user
	 * 
	 * @param ch - Choice entered by user
	 * @param sc - Scanner to get user input
	 */
	private static void processChoice(int ch, Scanner sc) {
		switch (ch) {
		case 1: {
			double radius = getDimension(sc, "Enter the radius of circle");
			Circle c = new Circle(1);
			c.addDimension(radius);
			c.calculateArea();
			System.out.println(c.toString() + ". Area of circle is " + String.format("%.2f", c.getArea()));
			break;
		}
		case 2: {
			double width = getDimension(sc, "Enter the width of rectangle");
			double height = getDimension(sc, "Enter the height of rectangle");
			Rectangle r = new Rectangle(2);
			r.addDimension(width);
			r.addDimension(height);
			r.calculateArea();
			System.out.println(r.toString() + ". Area of rectangle is " + String.format("%.2f", r.getArea()));
			break;
		}
		case 3: {
			double height = getDimension(sc, "Enter the length of square");
			Square s = new Square(1);
			s.addDimension(height);
			s.calculateArea();
			System.out.println(s.toString() + ". Area of square is " + String.format("%.2f", s.getArea()));
			break;
		}
		case 4: {
			double base = getDimension(sc, "Enter the base of triangle");
			double height = getDimension(sc, "Enter the height of triangle");
			Triangle t = new Triangle(2);
			t.addDimension(base);
			t.addDimension(height);
			t.calculateArea();
			System.out.println(t.toString() + ". Area of triangle is " + String.format("%.2f", t.getArea()));
			break;
		}
		case 5: {
			double radius = getDimension(sc, "Enter the radius of sphare");
			Sphere s = new Sphere(1);
			s.addDimension(radius);
			s.calculateArea();
			s.calculateVolume();
			System.out.println(s.toString() + ". Area of sphere is " + String.format("%.2f", s.getArea())
					+ ". Volume of sphere is " + String.format("%.2f", s.getVolume()));
			break;
		}
		case 6: {
			double edge = getDimension(sc, "Enter the edge of cube");
			Cube c = new Cube(1);
			c.addDimension(edge);
			c.calculateArea();
			c.calculateVolume();
			System.out.println(c.toString() + ". Area of cube is " + String.format("%.2f", c.getArea())
					+ ". Volume of cube is " + String.format("%.2f", c.getVolume()));
			break;
		}
		case 7: {
			double radius = getDimension(sc, "Enter the radius of cone");
			double height = getDimension(sc, "Enter the height of cone");
			Cone c = new Cone(2);
			c.addDimension(radius);
			c.addDimension(height);
			c.calculateArea();
			c.calculateVolume();
			System.out.println(c.toString() + ". Area of cone is " + String.format("%.2f", c.getArea())
					+ ". Volume of cone is " + String.format("%.2f", c.getVolume()));

			break;
		}

		case 8: {
			double radius = getDimension(sc, "Enter the radius of cylinder");
			double height = getDimension(sc, "Enter the height of cylinder");
			Cylinder c = new Cylinder(2);
			c.addDimension(radius);
			c.addDimension(height);
			c.calculateArea();
			c.calculateVolume();
			System.out.println(c.toString() + ". Area of cylinder is " + String.format("%.2f", c.getArea())
					+ ". Volume of cylinder is " + String.format("%.2f", c.getVolume()));

			break;
		}
		case 9: {
			double minorRadius = getDimension(sc, "Enter the minor radius of torus");
			double majorRadius = getDimension(sc, "Enter the major radius of torus");
			Torus c = new Torus(2);
			c.addDimension(minorRadius);
			c.addDimension(majorRadius);
			c.calculateArea();
			c.calculateVolume();
			System.out.println(c.toString() + ". Area of torus is " + String.format("%.2f", c.getArea())
					+ ". Volume of torus is " + String.format("%.2f", c.getVolume()));

			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
	}

	/**
	 * Get the choice
	 * 
	 * @param sc - Scanner to get the choice
	 * @return Choice entered by user.
	 */
	private static double getDimension(Scanner sc, String prompt) {
		System.out.println(prompt);
		double val = 0;
		while (Double.compare(val, 0.0) == 0) {
			val = Double.valueOf(sc.next());
			if (Double.compare(val, 0.0) > 0) {
				break;
			} else {
				val = 0;
				System.out.println("Invalid input.");
			}
		}
		return val;
	}

	/**
	 * Get the choice
	 * 
	 * @param sc - Scanner to get the choice
	 * @return Choice entered by user.
	 */
	private static int getChoice(Scanner sc) {
		int ch = 0;
		while (ch == 0) {
			ch = Integer.valueOf(sc.next());
			if (ch < 1 || ch > 10) {
				ch = 0;
			}
			if (ch == 0) {
				System.out.println("Invalid choice. Choose again.");
			}
		}
		return ch;
	}

	/**
	 * Print the menu
	 */
	public static void printMenu() {
		System.out.println("Select from the menu below:");
		System.out.println("1.Construct a Circle");
		System.out.println("2.Construct a Rectangle");
		System.out.println("3.Construct a Square");
		System.out.println("4.Construct a Triangle");
		System.out.println("5.Construct a Sphere");
		System.out.println("6.Construct a Cube");
		System.out.println("7.Construct a Cone");
		System.out.println("8.Construct a Cylinder");
		System.out.println("9.Construct a Torus");
		System.out.println("10.Exit the program");
	}
}
