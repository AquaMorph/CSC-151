////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab12
//  File:     HelloWorldFrame.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * User selects and language and hello translated into the selected language
 * will be displayed
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class HelloWorldFrame extends JFrame implements ActionListener
{
	private static final int MAX_WIDTH = 300;
	private static final int MAX_HEIGHT = 200;

	private JLabel greeting;

	public HelloWorldFrame()
	{
		setSize(MAX_WIDTH, MAX_HEIGHT);

		// Adds input area in the center of the window
		JPanel inputArea = createInputArea();
		add(inputArea, BorderLayout.CENTER);

		// Adds text area to the bottom of the window
		JPanel greetingArea = createGreetingArea();
		add(greetingArea, BorderLayout.SOUTH);

	}

	private JPanel createGreetingArea()
	{
		JPanel greetingPanel = new JPanel();

		// Titled borders
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Greeting");
		greetingPanel.setBorder(title);

		// Handles text
		greeting = new JLabel("");
		greetingPanel.add(greeting);

		return greetingPanel;
	}

	private JPanel createInputArea()
	{
		JPanel inputPanel = new JPanel();

		// Titled borders
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Langauge");
		inputPanel.setBorder(title);

		// English button
		JRadioButton radio1 = new JRadioButton();
		radio1.setText("English");
		inputPanel.add(radio1);

		// French button
		JRadioButton radio2 = new JRadioButton();
		radio2.setText("French");
		inputPanel.add(radio2);

		// Spanish button
		JRadioButton radio3 = new JRadioButton();
		radio3.setText("Spanish");
		inputPanel.add(radio3);

		// Adds radio buttons to a group
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);

		// Checks for change of selected radio button
		radio1.addActionListener(this);
		radio2.addActionListener(this);
		radio3.addActionListener(this);

		return inputPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		switch (e.getActionCommand())
		{
		case "English":
			greeting.setText("Hello!");
			break;
		case "French":
			greeting.setText("Bonjour!");
			break;
		case "Spanish":
			greeting.setText("Hola!");
			break;
		}
	}
}