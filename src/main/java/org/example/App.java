package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in= new Scanner(System.in);
    public static void main( String[] args )
    {
        App ask = new App();
        App math = new App();
        int p = ask.people();
        int pizza = ask.pizza();
        int s= ask.slices();
        int totalS = math.totalSlices(pizza,s);
        int SpP = math.slicesPerPerson(totalS,s,p);
        int left = math.leftover(totalS,SpP,p);

        String outp = String.format("%d people with %d pizzas (%d slices)\n" +
                "Each person gets %d pieces of pizza.\n" +
                "There are %d leftover pieces.",p,pizza,totalS,SpP,left);

       System.out.println( outp );
    }

    private int people(){
        out.print("How many people? ");
        return in.nextInt();
    }
    private int pizza(){
        out.print("How many pizzas do you have? ");
        return in.nextInt();}
    private int slices(){
        out.print("How many slices per pizza? ");
        return in.nextInt();}

    private int totalSlices(int pizza,int s){
        return pizza*s;
    }
    private int slicesPerPerson(int totalS,int s,int p){
        return totalS/p;
    }
    private int leftover(int totalS,int SpP,int p){
        return totalS-(SpP * p);
    }
}
