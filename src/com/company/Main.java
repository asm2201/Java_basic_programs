package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your stream (PCM/PCB/PCMB/COMMERCE/ARTS): ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.equals("PCM")) {
            System.out.println("Enter board marks in Physics: ");
            float a = sc.nextFloat();
            if (a>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Chemistry: ");
            float b = sc.nextFloat();
            if (b>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Mathematics: ");
            float c = sc.nextFloat();
            if (c>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in English: ");
            float d = sc.nextFloat();
            if (d>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in (CS/PE/ECO): ");
            float e = sc.nextFloat();
            if (e>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            float sum = (a+b+c+d+e);
            float percentage = (sum/500)*100;
            System.out.println("The CBSE board percentage is ");
            System.out.println(percentage);
        }

        else if (str.equals("PCB")) {
            System.out.println("Enter board marks in Physics: ");
            float a = sc.nextFloat();
            if (a>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Chemistry: ");
            float b = sc.nextFloat();
            if (b>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Biology: ");
            float c = sc.nextFloat();
            if (c>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in English: ");
            float d = sc.nextFloat();
            if (d>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in (CS/PE/ECO): ");
            float e = sc.nextFloat();
            if (e>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            float sum = (a+b+c+d+e);
            float percentage = (sum/500)*100;
            System.out.println("The CBSE board percentage is ");
            System.out.println(percentage);
        }

        else if (str.equals("PCMB")) {
            System.out.println("Enter board marks in Physics: ");
            float a = sc.nextFloat();
            if (a>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Chemistry: ");
            float b = sc.nextFloat();
            if (b>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Mathematics: ");
            float c = sc.nextFloat();
            if (c>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in English: ");
            float d = sc.nextFloat();
            if (d>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Biology: ");
            float e = sc.nextFloat();
            if (e>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            float sum = (a+b+c+d+e);
            float percentage = (sum/500)*100;
            System.out.println("The CBSE board percentage is ");
            System.out.println(percentage);
        }

        else if (str.equals("COMMERCE")) {
            System.out.println("Enter board marks in Economics: ");
            float a = sc.nextFloat();
            if (a>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in BST: ");
            float b = sc.nextFloat();
            if (b>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Accounts: ");
            float c = sc.nextFloat();
            if (c>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in English: ");
            float d = sc.nextFloat();
            if (d>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Maths: ");
            float e = sc.nextFloat();
            if (e>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            float sum = (a+b+c+d+e);
            float percentage = (sum/500)*100;
            System.out.println("The CBSE board percentage is ");
            System.out.println(percentage);
        }

        else if (str.equals("ARTS")) {
            System.out.println("Enter board marks in Pol Science: ");
            float a = sc.nextFloat();
            if (a>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Geography: ");
            float b = sc.nextFloat();
            if (b>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in History: ");
            float c = sc.nextFloat();
            if (c>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in English: ");
            float d = sc.nextFloat();
            if (d>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            System.out.println("Enter board marks in Sociology: ");
            float e = sc.nextFloat();
            if (e>100){
                System.out.println("Invalid Score entered...");
                main(null);
            }

            float sum = (a+b+c+d+e);
            float percentage = (sum/500)*100;
            System.out.println("The CBSE board percentage is ");
            System.out.println(percentage);
        }

        else{
            System.out.println("Invalid Input...");
            main(null);
        }

    }
}

