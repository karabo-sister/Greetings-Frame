/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Gaming
 */
public class GreetingsGui extends JFrame{
    
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndsurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    private JLabel headingLbl;
    private JLabel nameLb1;
    private JLabel surnameLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtfld;
    
    private  JTextArea greetingsTxtArea;
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    public GreetingsGui(){
        
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700,750);
        setBackground(Color.YELLOW);
        
        namePnl=new JPanel(new FlowLayout());
        surnamePnl=new JPanel(new FlowLayout());
        
        nameAndsurnamePnl=new JPanel(new GridLayout(2,1));
        
        greetingsAreaPnl=new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"greetings"));
        
        btnsPnl=new JPanel(new FlowLayout());
        mainPnl=new JPanel(new BorderLayout());
        
        headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingLbl=new JLabel("Greetings App");
        nameLb1=new JLabel("Clear");
        surnameLbl=new JLabel("Surname: ");
        
        nameTxtFld=new JTextField(20);
        surnameTxtfld=new JTextField(20);
        
        greetingsTxtArea=new JTextArea(40,50);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name] [surname] ");
        
        greetBtn=new JButton("Greet");
        clearBtn=new JButton("clear");
        exitBtn=new JButton("Exit");
        
        namePnl.add(nameLb1);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(nameTxtFld);
        
        nameAndsurnamePnl.add(namePnl);
        nameAndsurnamePnl.add(surnamePnl);
        
        greetingsAreaPnl.add(greetingsTxtArea);
        
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(nameAndsurnamePnl,BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl,BorderLayout.CENTER);
        mainPnl.add(btnsPnl,BorderLayout.SOUTH);
        
        add(headingPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        
        setVisible(true);
        
    }
}
