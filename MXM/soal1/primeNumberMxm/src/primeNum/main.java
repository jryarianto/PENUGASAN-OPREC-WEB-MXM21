package primeNum;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int limit = 20210, ctr=0, prime=0;

        while (prime != limit) {                //looping terus hingga mencapai bilangan prima ke-20210

            boolean flag = true;
            for (int x = 2; x <= ctr/2; x++) {
                if (ctr % x == 0) {             //if untuk mengecek apakah angka adalah bukan bilangan prima

                    flag = false;
                    break;
                }
            }
            if (flag && ctr != 0 && ctr != 1) {  //untuk mengecek apakah angka adalah bilangan prima dan bukan angka 0
                // maupun 1
                prime++;
            }
            ctr++;
        }
        System.out.println("bilangan prima ke "+prime+" adalah "+ctr);
    }
}