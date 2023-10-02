package Problema2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Vers {
    protected String vers;

    public Vers() {
        this.vers = vers;
    }

    public String afisare_vers()
    {
        return vers;
    }
    public int numar_cuvinte() {
        int nr_cuv = 0;
        for (int i = 0; i < vers.length(); i++) {
            if (vers.charAt(i) == ' ' || i == (vers.length() - 1)) {
                nr_cuv++;
            }
        }
        return nr_cuv;
    }

    public int numar_vocale()
    {
        int nr_voc=0;
        for(int i=0;i<vers.length();i++) {
            if (vers.charAt(i) == 'a' || vers.charAt(i) == 'e' || vers.charAt(i) == 'i' || vers.charAt(i) == 'o' || vers.charAt(i) == 'u' ||
                    vers.charAt(i) == 'A' || vers.charAt(i) == 'E' || vers.charAt(i) == 'I' || vers.charAt(i) == 'O' || vers.charAt(i) == 'U') {
                nr_voc++;
            }
        }
        return nr_voc;
    }

    public int grupare_litere(String vers)
    {
        String grup = "ou";
        for(int i=0;i<vers.length();i++)
        {
            if(vers.charAt((vers.length()-2)) == grup.charAt(0) &&
                    vers.charAt((vers.length())-1) == grup.charAt(1))
            {
                return 1;
            }
        }
        return 0;
    }

    public float random()
    {
        Random r = new Random(1);
        float rand = r.nextFloat();
        return rand;
    }

    public String litere(String vers)
    {
        vers.toUpperCase();
        return vers;
    }

}
