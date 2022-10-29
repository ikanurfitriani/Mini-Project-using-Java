import java.util.Scanner;
public class kalkulator
{
	public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
         int bil1, bil2, pil ,hasil = 0;
         System.out.println("====================");
         System.out.println("KALKULATOR SEDERHANA");
         System.out.println("--------------------");
         System.out.println("1. Perkalian");
         System.out.println("2. Pembagian");
         System.out.println("3. Penjumlahan");
         System.out.println("4. Pengurangan");
         System.out.println("====================");
         System.out.print("\nPilihan Operasi : ");
         pil=input.nextInt();
         System.out.print("Masukan bilangan pertama : ");
         bil1=input.nextInt();
         System.out.print("Masukan bilangan kedua   : ");
         bil2=input.nextInt();

         switch (pil){
             case 1 : hasil=bil1*bil2;break;
             case 2 : hasil=bil1/bil2;break;
             case 3 : hasil=bil1+bil2;break;
             case 4 : hasil=bil1-bil2;break;
             default : System.out.println("Salah memasukan pilihan");
         }
         System.out.println("\nHasil : "+hasil);
         System.out.println("");
    }
}