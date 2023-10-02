package Problema2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {
        String fisier_in = "cantec_in.txt";
        Scanner readFile = new Scanner(new File(fisier_in));
        FileWriter fisier_out = new FileWriter("cantec_out.txt");
        PrintWriter write = new PrintWriter(fisier_out);
        Vers v = new Vers();

        while(readFile.hasNext())
        {
            v.vers = readFile.nextLine();
            if(Float.compare(v.random(),0.5f) < 0)
                v.litere(v.vers);
            write.printf("%s, %d, %d", v.afisare_vers(), v.numar_cuvinte(), v.numar_vocale());
            if(v.grupare_litere(v.vers) == 1)
                write.printf(" *");
            write.printf("\n");
        }
        write.close();






        /*int nr_cuv=0, nr_voc=0;
        String grup = "ou";
        Random r = new Random(1);
        float rand = r.nextFloat();
        //String vers = new String;
        while(readFile.hasNext())
        {
            String vers = readFile.nextLine();

            for(int i=0;i<vers.length();i++)
            {
                if(rand < 0.5)
                {
                    vers.toUpperCase();
                }
                if(vers.charAt(i)=='a' || vers.charAt(i)=='e' || vers.charAt(i)=='i' || vers.charAt(i)=='o' || vers.charAt(i)=='u' ||
                vers.charAt(i)=='A' || vers.charAt(i)=='E' || vers.charAt(i)=='I' || vers.charAt(i)=='O' || vers.charAt(i)=='U')
                {
                    nr_voc++;
                }
                if(vers.charAt(i)==' ' || i==(vers.length()-1))
                {
                    nr_cuv++;
                }
            }
            write.printf("%s, %d, %d, %f",vers,nr_cuv,nr_voc,rand);
            if(vers.charAt((vers.length()-2)) == grup.charAt(0) &&
                    vers.charAt((vers.length())-1) == grup.charAt(1))
            {
                write.printf(" *");
            }
            write.printf("\n");
            nr_cuv=0;
            nr_voc=0;
            rand= r.nextFloat();
        }
        */

    }


}
