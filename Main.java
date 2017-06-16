package se.webbfox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//                    Napisać program, który oblicza wartość współczynnika BMI (ang. body mass
//                    index) wg. wzoru: waga podzielona przez
//                    wzrost do potegi 2 . Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
//                    ”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.



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

        // ciagle pokazuje mi zly wynik :(



    }
}
