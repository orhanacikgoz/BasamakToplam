import java.util.Scanner;

public class Saysay {
    public static void main(String[] args) {
        int sayi, toplam=0, basamak=0;
        System.out.println("Bir sayi giriniz: ");
        Scanner inp = new Scanner(System.in);
        sayi=inp.nextInt();


        while (sayi!=0){
            basamak=sayi%10;
            sayi=sayi/10;
            toplam=toplam+basamak;
            System.out.println(basamak);
            

        }
        System.out.println("basamak toplamlari: " + toplam);











    }
}
