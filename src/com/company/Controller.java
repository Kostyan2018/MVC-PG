package com.company;

import java.util.Scanner;

public class Controller {
    //Constatns
    public static final int RNDM = (int)(Math.random()*101);

    //Constructor
    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    //The Work methods
    public void processUser(){
        System.out.println(RNDM);
        Scanner sc = new Scanner(System.in);

        while (model.compareInt()){
            inputIntValueWithScanner(new Scanner(String.valueOf(sc)));
        };
    model.setValue(inputIntValueWithScanner(sc));
    //model.addIntOurValue(RNDM);
        model.compareInt();

    view.printMassageAddInt(view.OUR_INT, model.compareInt());

    }

    //The Utility methods
    public int inputIntValueWithScanner(Scanner sc){
        view.printMassage(view.INPUT_INT_DATA);
        while (! sc.hasNextInt()){
            view.printMassage(view.WRONG_INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

}
