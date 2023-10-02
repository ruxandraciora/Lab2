package Problema1;

import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String jud[]=new String[3];
        String nume_fisier="judete_in.txt";
        Scanner read = new Scanner(new File(nume_fisier));
        int j=0;
        while(read.hasNext())
        {
            jud[j]=read.nextLine();
            j++;
        }
        Arrays.sort(jud);
        for(int i=0;i<j;i++)
            System.out.println(jud[i]);
        System.out.println("Introduceti judetul: ");
        Scanner judet = new Scanner(System.in);
        String nume_judet = judet.nextLine();
        int pozitie = binarySearch(jud,nume_judet);
        System.out.println("Judetul este pe pozitia: "+(pozitie+1));
    }
}
