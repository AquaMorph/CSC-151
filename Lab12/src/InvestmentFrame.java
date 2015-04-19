////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab12
//  File:     InvestmentFrame.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Calculates the amount of money in an account after a set time of investing
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class InvestmentFrame extends JFrame implements ActionListener
{
	private static final int MAX_WIDTH = 400;
	private static final int MAX_HEIGHT = 200;

	private JTextField amount, rate, value;
	private JComboBox years;

	public InvestmentFrame()
	{
		setSize(MAX_WIDTH, MAX_HEIGHT);

		// Adds input area in the center of the window
		JPanel inputArea = createInputArea();
		add(inputArea, BorderLayout.CENTER);

		// Adds text area to the bottom of the window
		JPanel calculationButton = createCalculationButton();
		add(calculationButton, BorderLayout.SOUTH);

	}

	private JPanel createCalculationButton()
	{
		JPanel calculatePanel = new JPanel();
		calculatePanel.setLayout(new GridLayout(0, 1));
		calculatePanel.setBorder(new EmptyBorder(0, 5, 5, 5));
		
		JButton calculate = new JButton();
		calculate.setText("Calculate");
		calculatePanel.add(calculate);
		
		calculate.addActionListener(this);

		return calculatePanel;
	}

	private JPanel createInputArea()
	{
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(0, 2));
		inputPanel.setBorder(new EmptyBorder(5, 5, 0, 5));
		
		// Row 1
		JLabel amountLabel = new JLabel("Investment Amount:");
		inputPanel.add(amountLabel);
		amount = new JTextField();
		inputPanel.add(amount);
		
		// Row 2
		JLabel yearsLabel = new JLabel("Investment Amount:");
		inputPanel.add(yearsLabel);
		String[] yearChoice = {"5","10","15"};
		years = new JComboBox(yearChoice);
		years.setSelectedItem(yearChoice.length);
		inputPanel.add(years);
		
		// Row 3
		JLabel rateLabel = new JLabel("Annual Interest Rate:");
		inputPanel.add(rateLabel);
		rate = new JTextField();
		inputPanel.add(rate);
		
		// Row 4
		JLabel valueLabel = new JLabel("Future Value:");
		inputPanel.add(valueLabel);
		value = new JTextField();
		value.setEditable(false);
		inputPanel.add(value);

		return inputPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		double dollars = Double.parseDouble(amount.getText()) * Math.pow((1 + Double.parseDouble(rate.getText()) * .01 / 12), Integer.parseInt((String) years.getSelectedItem())*12);
		DecimalFormat df = new DecimalFormat("#.##"); 
		dollars = Double.valueOf(df.format(dollars));
		value.setText("$" + dollars);
	}
}