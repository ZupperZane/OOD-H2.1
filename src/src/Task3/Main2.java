package src.Task3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2  extends JFrame{
    private JTextField UserField;
    private JPasswordField passwordField1;
    private JTextField EmailField;
    private JTextField PhoneField;
    private JButton confirmValidateButton;
    private JPanel registerScreen;

    public Main2(){
        // https://github.com/JetBrains/build-UI-using-Swing-sample-project/blob/main/src/com/example/library/forms/BookEditorExample.java
        //this resource was used for guidance for the set up of the Frame
        setTitle("UserRegistration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(registerScreen);
        pack();
        Registration register = new Registration();
        setVisible(true);

        confirmValidateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    register.setRegistration(UserField,passwordField1,EmailField,PhoneField);
                }
        });


    }

    private void createUIComponents() {

        // TODO: place custom component creation code here
    }
}
