package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;
public class ownAdventure {

	public static void main(String[] args) {
		int x=JOptionPane.showConfirmDialog(null, "You found somebody laying on the ground, not breathing, would you save him?", "title", JOptionPane.YES_NO_OPTION);
         if(x==1) {
        	    JOptionPane.showMessageDialog(null, "He was not breathing and you left him dead");
     	    JOptionPane.showMessageDialog(null, "Story ended");
        	    
         }
         else {
        	 JOptionPane.showMessageDialog(null, "Turns out he wasn't breathing and you saved his life!");
        	 int x2=JOptionPane.showConfirmDialog(null,"The mayor awarded you with a huge prize. would you accept it?", "title", JOptionPane.YES_NO_OPTION);
        	 if(x2==1) {
        		 JOptionPane.showMessageDialog(null,"The prize is blown away and you suffered from poverty");
        		 JOptionPane.showMessageDialog(null, "Story ended");
        	 }
        	 else {
        		 JOptionPane.showMessageDialog(null, "You became a billionaire");
        		 JOptionPane.showMessageDialog(null, "Story completed");
        	 }
         }
	}

}
