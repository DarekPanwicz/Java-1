package se.webbfox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {





        double bmi;
        double liczbaMin = 18.5;
        double liczbaMax = 24.9;

        System.out.println("Podaj swoja wage ");

        Scanner in = new Scanner(System.in);


        double waga = in.nextInt();

        System.out.println("Podaj swoj wzrost ");
        double wzrost = in.nextInt();


        double liczba0 = Math.pow(wzrost, 2);

        double liczba = waga / liczba0;




        if(liczba<liczbaMin && liczba>liczbaMax)

        {

            System.out.println(" Waga jest prawidlowa");
        }


        else if(liczba<liczba0)

        {

            System.out.println(" nadwaga");


        } else if(liczba<liczba0)

        {

            System.out.println("niedowaga");


        }



    }
}
