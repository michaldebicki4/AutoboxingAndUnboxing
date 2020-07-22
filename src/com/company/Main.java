package com.company;

import java.util.ArrayList;

class IntClass {
    //WRAPPER
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
	String [] strArray = new String[10];
	int [] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Michal");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doublevalue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i=0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));
            //autoboxing
        }
        for(int i=0; i <= 10; i++){
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
            //unboxing
        }


        //dodatkowe możliwości
        //shortcut do linijki 32 tylko to ważne --->
        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue;  // myInt.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl <=10.0;  dbl += 0.5){
            myDoubleValues.add(dbl);
        }
        for (int i=0; i<myDoubleValues.size();i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " ----> " + value);
        }
    }
}
