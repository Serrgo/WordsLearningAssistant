import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class HelperFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HelperFrame() {
		setLayout(null);
		
		Font font = new Font("Verdana", Font.PLAIN, 14);
		JLabel labelWord = new JLabel("Word:");
		JLabel labelCounter = new JLabel("Current word:");
		JLabel labelTranslate = new JLabel("Translate:");
		JButton nextWord = new JButton("Next Word");
		JButton checkWord = new JButton("Check Word");
		JButton preWord = new JButton("Pre Word");
		JTextArea firstWord = new JTextArea();
		JTextArea secondWord = new JTextArea();
		JTextArea currentWord = new JTextArea();
		JRadioButton changeOutRand = new JRadioButton("Random",true);
		JRadioButton changeOutSerial = new JRadioButton("Serial");
		
		ButtonGroup group = new ButtonGroup();
		group.add(changeOutRand);
		group.add(changeOutSerial);
	
		add(labelWord,BorderLayout.WEST);
		labelWord.setSize(60, 15);
		labelWord.setLocation(10,10);
    
		add(labelTranslate,BorderLayout.WEST);
		labelTranslate.setSize(60, 15);
		labelTranslate.setLocation(10,35);
		
		add(labelCounter,BorderLayout.WEST);
		labelCounter.setSize(120,20);
		labelCounter.setLocation(235,65);
		
		add(changeOutRand,BorderLayout.WEST);
		changeOutRand.setSize(72, 15);
		changeOutRand.setLocation(10,65);
		
		add(changeOutSerial,BorderLayout.WEST);
		changeOutSerial.setSize(58, 15);
		changeOutSerial.setLocation(10,90);
    
		add(firstWord,BorderLayout.NORTH);
		firstWord.setSize(280,20);
		firstWord.setLocation(75, 10);
		firstWord.setEditable(false);
		firstWord.setFont(font);
		
		add(secondWord,BorderLayout.NORTH);
		secondWord.setSize(280,20);
		secondWord.setLocation(75, 35);
		secondWord.setEditable(false);
		secondWord.setFont(font);
		
		add(currentWord,BorderLayout.NORTH);
		currentWord.setSize(30,20);
		currentWord.setLocation(315,65);
		currentWord.setEditable(false);
		currentWord.setFont(font);
    
		add(checkWord,BorderLayout.SOUTH);
		checkWord.setSize(120,20);
		checkWord.setLocation(95,65);
    
		add(nextWord,BorderLayout.SOUTH);
		nextWord.setSize(100,20);
		nextWord.setLocation(105, 90);
		
		add(preWord,BorderLayout.SOUTH);
		preWord.setSize(100,20);
		preWord.setLocation(105, 115);
		
		//Buttons
		
		checkWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondWord.setText(HelperBase.Returner.wordTwo());
            }
        });		
		
		nextWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	boolean radioState;
            	if (changeOutRand.isSelected()) radioState=true;
            		else  radioState=false;
            	HelperBase.Returner.retNextWord(radioState);
            	firstWord.setText(HelperBase.Returner.wordOne());
            	secondWord.setText("");
            	currentWord.setText(HelperBase.Returner.wordCounter());
            }
        });
		
		preWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	boolean radioState;
            	if (changeOutRand.isSelected()) radioState=true;
            		else  radioState=false;
            	HelperBase.Returner.retPreWord(radioState);
            	firstWord.setText(HelperBase.Returner.wordOne());
            	secondWord.setText("");
            	currentWord.setText(HelperBase.Returner.wordCounter());
            }
        });
	}
}
