package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Compte;
import javax.swing.*;

public class controler implements ActionListener {
    JLabel value;
    JTextField sum;
    Compte c;

    public controler(JLabel l, JTextField t, Compte cc) {
        value = l;
        sum = t;
        c = cc;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

     int somme=Integer.parseInt(sum.getText());
    if(((JButton)e.getSource()).getText().equals("Credit")){
     c.cred(somme);
    }
    if(((JButton)e.getSource()).getText().equals("Debit")){
        c.deb(somme);
    }
    value.setText(c.value+"");
    }

}
