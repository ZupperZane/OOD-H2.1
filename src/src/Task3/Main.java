package src.Task3;

import javax.swing.*;

public class Main {
    JFrame screen;
    public static void main(String[] args) {


        // Intialize Validators
        EmailVal EmailVal = new EmailVal();
        PhoneVal PhoneVal = new PhoneVal();
        UsernameVal UsernameVal = new UsernameVal();
        PasswordVal PasswordVal = new PasswordVal();
        // Set The chain of responsiblity
        UsernameVal.NextVal(PasswordVal);
        PasswordVal.NextVal(EmailVal);
        EmailVal.NextVal(PhoneVal);
        //
        Main2 screen = new Main2();


    }
}
