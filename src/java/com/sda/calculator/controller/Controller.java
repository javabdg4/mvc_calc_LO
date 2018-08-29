package com.sda.calculator.controller;

import com.sda.calculator.model.Model;
import com.sda.calculator.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        view.addMultiplyListener(new MultiplyListener());
    }

    class MultiplyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput = "";

            userInput = view.getUserInput();
            System.out.println(userInput);
            model.multiply(userInput);
            view.setTotal(model.getValue());

        }
    }
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.reset();
            view.reset();
        }
    }
}
