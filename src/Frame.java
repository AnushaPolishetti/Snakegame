import javax.swing.*;

public class Frame extends JFrame {
    Frame() {
        this.add(new Panel());
        this.setTitle("Snake Game");
        //setting the closing action to close all instances of jframe
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ensuring uniformty of the panel
        this.setResizable(false);
        //ensuring system preferred size is set
        this.pack();
        //displaying the panel to the user
        this.setVisible(true);
    }

}
