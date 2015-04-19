////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab12
//  File:     InvestmentApp.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Creates a window for the GUI program InvestmentFrame
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import javax.swing.JFrame;

public class InvestmentApp
{

	public static void main(String[] args)
	{
		InvestmentFrame investment = new InvestmentFrame();
		investment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		investment.setTitle("Investment Calculator");
		investment.setVisible(true);
	}
}
