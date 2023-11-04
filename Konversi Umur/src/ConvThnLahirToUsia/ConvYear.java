package ConvThnLahirToUsia;

import java.util.Scanner;

public class ConvYear {

    int umur,hasil;
    Scanner input = new Scanner(System.in);
    public void Umur(){
        System.out.println("Masukan Tahun Lahir : ");
        umur = input.nextInt();

        hasil = 2023 - umur;

        System.out.println("Usia anda sekarang : " + hasil);
    }


}
