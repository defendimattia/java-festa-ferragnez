package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.println("Come ti chiami?");
        Scanner input = new Scanner(System.in);
        String guestName = input.nextLine();
        input.close();

        // pulizia nome
        guestName = guestName.trim().replaceAll("\\s+", " ");

        // for (int i = 0; i < guests.length; i++) {
        // if (guests[i].equalsIgnoreCase(guestName)) {
        // System.out.println("Sei in lista! Benvenuto alla festa!");
        // break;
        // } else if (i == guests.length - 1 && !guests[i].equalsIgnoreCase(guestName))
        // {
        // System.out.println("Il tuo nome non è presente nella lista!");
        // }
        // }

        boolean find = false;
        int i = 0;

        while (!find && i < guests.length) {

            if (guests[i].equalsIgnoreCase(guestName)) {
                System.out.println("Sei in lista! Benvenuto alla festa!");
                find = true;
            }
            i++;
        }
        if (!find)
            System.out.println("Il tuo nome non è presente nella lista!");
    }
}