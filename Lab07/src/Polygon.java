////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab07
//  File:     Polygon.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that creates a polygon from four points an returns the polygon
 * and the coordinates of the polygon.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Polygon
{
	List<CartesianPoint> points = new ArrayList<CartesianPoint>();
	
	public void addPoint(CartesianPoint p)
	{
		points.add(p);
	}

	public String toString()
	{
		String value = "[";
		for (int i = 0; i < points.size(); i++)
		{
			value += points.get(i).toString();
			if(i != (points.size()-1))value += ", ";
		}
		value += "]";
		return value;
	}

	public double perimeter()
	{
		double value = 0;
		for (int i = 0; i < points.size(); i++)
		{
			if(i != (points.size()-1))value += points.get(i).distance(points.get(i+1));
			else value += points.get(i).distance(points.get(0));
		}
		return value;
	}
}
