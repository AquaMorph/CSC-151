////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab07
//  File:     Quadrangle.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that creates a quadrangle from four points an returns the perimeter
 * and the coordinates of the quadrangle.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */
public class Quadrangle
{
	CartesianPoint p1, p2, p3, p4;

	Quadrangle(CartesianPoint point1, CartesianPoint point2,
			CartesianPoint point3, CartesianPoint point4)
	{
		p1 = point1;
		p2 = point2;
		p3 = point3;
		p4 = point4;
	}

	public String toString()
	{
		return "[" + p1.toString() + ", " + p2.toString() + ", "
				+ p3.toString() + ", " + p4.toString() + "]";
	}

	public double perimeter()
	{
		return p1.distance(p2) + p2.distance(p3) + p3.distance(p4)
				+ p4.distance(p1);
	}
}
