package view;

import java.awt.*;
import model.*;

import javax.swing.*;

import controler.controler;

public class GUI extends JFrame {


    JLabel solde;
    JTextField text = new JTextField("");
    JButton debit = new JButton("Debit");
    JButton credit = new JButton("Credit");

    model.Compte cpt;// referce vers le compte qui va etre gerer

    public GUI(Compte c) {
        cpt = c;
        solde = new JLabel(cpt.value + "");
        JPanel op = new JPanel();
        op.setLayout(new GridLayout(1, 2));
        op.add(debit);
        op.add(credit);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(BorderLayout.NORTH,solde);
       
        JPanel centre=new JPanel();
       
        centre.setLayout(new BorderLayout());
        centre.add(BorderLayout.NORTH,text);
        centre.add(BorderLayout.SOUTH,op);
        this.getContentPane().add(BorderLayout.CENTER,centre);
        controler coco=new controler(solde, text, cpt);
        credit.addActionListener(coco);
        debit.addActionListener(coco);

    }

    public static void main(String[] args) {
       Compte c = new Compte(2300000);
       GUI g=new GUI(c);
       g.setVisible(true);
       g.pack();
    }
}
