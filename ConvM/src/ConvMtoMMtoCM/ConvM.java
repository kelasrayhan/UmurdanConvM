package ConvMtoMMtoCM;

import java.util.Scanner;

public class ConvM {

    Scanner input = new Scanner(System.in);
    int CM,MM,M,hasilCM,hasilMM;

    public void ConvMtoCm(){

        hasilCM = M * 100;
        System.out.printf("Hasil CM : " + hasilCM);
    }

    public void ConvMtoMM(){

        hasilMM = M * 1000;
        System.out.println("\nHasil MM : " + hasilMM);
    }

    public void Cetak(){

        System.out.println("Masukan M :");
        M = input.nextInt();

        ConvMtoCm();
        ConvMtoMM();

    }




}
