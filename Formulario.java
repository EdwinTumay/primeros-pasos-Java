import javax.swing.*;
import java.awt.Label;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    private JButton boton1;
    private JLabel label1;

    public Formulario(){
        setLayout(null);
        label1 = new JLabel("Puto el que lo lea");
        label1.setBounds(170,20,200,200);
        add(label1);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300,230,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() ==  boton1){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,450,300);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}