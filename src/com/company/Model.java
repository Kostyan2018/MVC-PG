package com.company;

import java.util.Scanner;

import static com.company.Controller.RNDM;

public class Model {
    private int value;
    private boolean i;

    //The Program Logic

    //public int addIntOurValue(int valueInt){
      //  return value = valueInt;
    //}

    public boolean compareInt() {
        if ( RNDM == value ) {
            return i = true;
        }else{
            return i= false;
        }
    }




    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
 }
