// 12S24029 - Adithya Philip Jona Putra Silaban
// 12S24048 - Olivia Tambunan

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis;
        int tT;
        String penerbit, fBE;
        double hP, mM;
        int stok;
        double rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tT = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        fBE = input.nextLine();
        hP = Double.parseDouble(input.nextLine());
        mM = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tT + "|" + penerbit + "|" + fBE + "|" + hP + "|" + mM + "|" + stok + "|" + rating);
    }
}

