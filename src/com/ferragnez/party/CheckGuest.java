package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Come ti chiami?");
        Scanner input = new Scanner(System.in);
        String guestName = input.nextLine();

        // pulizia nome
        guestName = guestName.toLowerCase().trim().replaceAll("\\s+", " ");


        

    }
}