////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab12
//  File:     HelloWorldApp.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Creates a window for the GUI program HelloWorldFrame
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import javax.swing.JFrame;

public class HelloWorldApp
{

	public static void main(String[] args)
	{
		JFrame helloWorld = new HelloWorldFrame();
		helloWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		helloWorld.setVisible(true);
	}
}
