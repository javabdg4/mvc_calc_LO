package com.sda.calculator.view;

import com.sda.calculator.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private static final String INTIAL = "1";


    private JTextField userInput = new JTextField(5);
    private JTextField total = new JTextField(20);
    private JButton multiply = new JButton("MNOŻENIE");
    private JButton clear = new JButton("Resetuj");

    private Model model;


    public View(Model model){

        this.model = model;
        draw();
    }

    public void reset() {
        total.setText(INTIAL);
    }

    public void setTotal(String newTotal) {
        total.setText(newTotal);
    }

    public void draw(){
        JPanel content = new JPanel();
        content.add(new JLabel("Podaj liczbe"));
        content.add(userInput);
        content.add(multiply);
        content.add(new Label("Wynik"));
        content.add(total);
        content.add(clear);

        this.setContentPane(content);
        this.pack();
    }

    public String getUserInput(){
        return userInput.getText();
    }

    public void addMultiplyListener(ActionListener multiply){
        this.multiply.addActionListener(multiply);
    }

    public void addClearListener(ActionListener cal) {
        clear.addActionListener(cal);
    }

}
