/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people? ");
        int peopleCount = scanner.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzaCount = scanner.nextInt();

        System.out.print("How many slices per pizza? ");
        int pizzaSliceCount = scanner.nextInt();

        int totalSliceCount = pizzaSliceCount  * pizzaCount;
        String pizzaStatusMessage = MessageFormat.format(
            "{0} people with {1} pizzas ({2} slices)",
            peopleCount, pizzaCount, totalSliceCount
        );
        System.out.println(pizzaStatusMessage);

        int sliceCountPerPerson = totalSliceCount/peopleCount;
        System.out.println(MessageFormat.format("Each person gets {0} pieces of pizza", sliceCountPerPerson));

        int leftOverSliceCount = totalSliceCount % peopleCount;
        System.out.println(MessageFormat.format("There are {0} leftover pieces.", leftOverSliceCount));
    }
}
