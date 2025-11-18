package src.Task3;

import javax.swing.*;

public class Registration {
    String Username;
    String Password;
    String Email;
    String PhoneNumber;

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getUsername() {
        return Username;
    }

public void setRegistration(JTextField User,JPasswordField Password,JTextField Email,JTextField Phone){
        this.Username = User.getText();
        this.Password = Password.getText();
        this.Email = Email.getText();
        this.PhoneNumber = Phone.getText();
}
}
