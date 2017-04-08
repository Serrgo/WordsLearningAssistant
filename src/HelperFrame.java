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
		JLabel labelTranslate = new JLabel("Translate:");
		JButton nextWord = new JButton("Next Word");
		JButton checkWord = new JButton("Check Word");
		JTextArea firstWord = new JTextArea(5, 30);
		JTextArea secondWord = new JTextArea(5, 30);
		JRadioButton changeOutRand = new JRadioButton("Random",true);
		JRadioButton changeOutSerial = new JRadioButton("Serial");
		
		ButtonGroup group = new ButtonGroup();
		group.add(changeOutRand);
		group.add(changeOutSerial);
	
		add(labelWord,BorderLayout.WEST);
		labelWord.setSize(40, 15);
		labelWord.setLocation(10,10);
    
		add(labelTranslate,BorderLayout.WEST);
		labelTranslate.setSize(60, 15);
		labelTranslate.setLocation(10,35);
		
		add(changeOutRand,BorderLayout.WEST);
		changeOutRand.setSize(72, 15);
		changeOutRand.setLocation(10,60);
		
		add(changeOutSerial,BorderLayout.WEST);
		changeOutSerial.setSize(58, 15);
		changeOutSerial.setLocation(10,85);
    
		add(firstWord,BorderLayout.NORTH);
		firstWord.setSize(220,20);
		firstWord.setLocation(75, 10);
		firstWord.setEditable(false);
		firstWord.setFont(font);
		
		add(secondWord,BorderLayout.NORTH);
		secondWord.setSize(220,20);
		secondWord.setLocation(75, 35);
		secondWord.setEditable(false);
		secondWord.setFont(font);
    
		add(checkWord,BorderLayout.SOUTH);
		checkWord.setSize(120,20);
		checkWord.setLocation(135,65);
    
		add(nextWord,BorderLayout.SOUTH);
		nextWord.setSize(100,20);
		nextWord.setLocation(145, 90);
		
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
            	HelperBase.Returner.retWord(radioState);
            	firstWord.setText(HelperBase.Returner.wordOne());
            	secondWord.setText("");
            }
        });		  	
	}
}
