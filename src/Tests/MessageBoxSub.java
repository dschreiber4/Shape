package Tests;

import javax.swing.*;

public class MessageBoxSub {

    public int show(String message, String title) {

        // JOptionPane method
        JOptionPane.showMessageDialog(null, message, title, 1);

        return JOptionPane.OK_OPTION;
    }
}
