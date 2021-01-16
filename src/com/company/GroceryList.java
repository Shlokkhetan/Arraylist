package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){

        groceryList.add(item);
    }
    public void printGroceryList(){

        for(int i =0; i<groceryList.size();i++){

            System.out.println("index  " + i + " Value  " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String Value){


        groceryList.set(position,Value);

    }

    public void removeGroceryItem(int position){



        groceryList.remove(position);
    }

    public  String findItem(String item){

        int index = groceryList.indexOf(item);
        if(index>0){
            return groceryList.get(index);
        }
        return null;
    }
}
