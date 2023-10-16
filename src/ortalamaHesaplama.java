import java.util.Scanner;

public class ortalamaHesaplama {
    public static void main(String[] args) {
        // Değişkenler
        int sayi, i, k = 0, j = 0, u, d, sum = 0, sonuc;
        Scanner input;

        // Kullanıcıdan Veri Girişi
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        input = new Scanner(System.in);
        sayi = input.nextInt();

        //Hesaplama Bloğu
        for (i = 1; i <= sayi; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                System.out.println(i + " -> 3'e Tam Bölünür.");
                k++;
            } else if (i % 4 == 0) {
                sum = sum + i;
                System.out.println(i + " -> 4'e Tam Bölünür.");
                j++;
            }
        }
        sonuc = sum / (k + j);
        System.out.println("Sonuc = " + sonuc);
    }
}
