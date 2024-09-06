// 12S24029 - Adithya Philip Jona Putra Silaban
// 12S24048 - Olivia Tambunan

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, tT, penerbit, fBE, hP, mM, stok, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tT = input.nextLine();
        penerbit = input.nextLine();
        fBE = input.nextLine();
        hP = input.nextLine();
        mM = input.nextLine();
        stok = input.nextLine();
        rating = input.nextLine();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tT + "|" + penerbit + "|" + fBE + "|" + hP + "|" + mM + "|" + stok + "|" + rating);
    }
}
