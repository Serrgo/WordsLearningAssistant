import javax.swing.*;
import java.awt.*;

public class Helper{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				HelperBase.reader();
				HelperFrame frame = new HelperFrame();
				//HelperBase base = new HelperBase();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setBounds(320, 320, 320, 320);
				//frame.setResizable(false);
				frame.setTitle("Words learning helper");
			}
		});
	}
}
