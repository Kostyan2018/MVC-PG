package com.company;

public class View {
//Text's constance
    public  static final String INPUT_INT_DATA = "Input INT value = ";
    public static final  String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "Resut of comparation is ";

    public void printMassage(String massage){
        System.out.println(massage);
    }
    public void printMassageAddInt(String massage, boolean value){
        System.out.println(massage + value);
    }
}
