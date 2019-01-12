package doubles_and_booleans;

import javax.swing.JOptionPane;

public class Test_Scores {

	public static void main(String[] args) {
		String y = JOptionPane.showInputDialog("What was your score?");
		double score = Double.parseDouble(y);
		if (score >= 75) {
			JOptionPane.showMessageDialog(null, "You did pretty good!");

		} else if (score > 50 && score < 75) {
			JOptionPane.showMessageDialog(null, "Do better next time~");
		} else if (score < 50) {
			JOptionPane.showMessageDialog(null, "Your score is pretty messed up");
		} else if (score < 0) {
			JOptionPane.showMessageDialog(null, "Impossible");
		}
	}

}
