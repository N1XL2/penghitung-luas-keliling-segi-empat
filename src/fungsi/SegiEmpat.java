package fungsi;

import com.main.Halo;
import java.util.Scanner;

class SegiEmpat {
    private int panjang;
    private int lebar;


    public SegiEmpat(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }


    public int menghitungLuas() {
        return panjang * lebar;
    }


    public int menghitungKeliling() {
        return 2 * (panjang + lebar);
    }


    public void resize(int faktor) {
        panjang *= faktor;
        lebar *= faktor;
    }


    public void resize(double faktor) {
        panjang *= faktor;
        lebar *= faktor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();


        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();


        SegiEmpat segiEmpat = new SegiEmpat(panjang, lebar);


        System.out.println("Luas: " + segiEmpat.menghitungLuas());
        System.out.println("Keliling: " + segiEmpat.menghitungKeliling());


        System.out.print("Masukkan faktor pembesaran/perkecil: ");
        double faktor = scanner.nextDouble();


        segiEmpat.resize(faktor);


        System.out.println("Luas setelah resize: " + segiEmpat.menghitungLuas());
        System.out.println("Keliling setelah resize: " + segiEmpat.menghitungKeliling());

        Halo halo = new Halo();

        scanner.close();
    }
}
