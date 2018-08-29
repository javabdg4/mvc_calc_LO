package com.sda.calculator;

import com.sda.calculator.controller.Controller;
import com.sda.calculator.model.Model;
import com.sda.calculator.view.View;


public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(
                view, model
        );

        view.setVisible(true);

    }
}
