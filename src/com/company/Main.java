package com.company;

import com.company.View.View;
import com.company.controller.ProduktController;

public class Main {

    public static void main(String[] args) {
        ProduktController produktController = new ProduktController();
	View view = new View();
    view.run();
    }
}
