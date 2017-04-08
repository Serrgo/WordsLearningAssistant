import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
		add(labelWord,BorderLayout.NORTH);
		labelWord.setSize(40, 15);
		labelWord.setLocation(10,10);
    
		add(labelTranslate,BorderLayout.NORTH);
		labelTranslate.setSize(60, 15);
		labelTranslate.setLocation(10,35);
    
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
		checkWord.setLocation(95,65);
    
		add(nextWord,BorderLayout.SOUTH);
		nextWord.setSize(100,20);
		nextWord.setLocation(105, 90);
		
		checkWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondWord.setText(HelperBase.Returner.wordTwo());
            }
        });		
		
		nextWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	HelperBase.Returner.retWord();
            	firstWord.setText(HelperBase.Returner.wordOne());
            	secondWord.setText("");
            }
        });		
		
	}
}