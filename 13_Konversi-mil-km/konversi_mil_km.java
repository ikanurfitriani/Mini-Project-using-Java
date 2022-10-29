import java.util.Scanner;
public class konversi_mil_km
{
	public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
         int pil, mil, km;
         double hasil_mil, hasil_km;
         System.out.println("=============================");
		 System.out.println("KONVERSI MIL --><-- KILOMETER");
		 System.out.println("-----------------------------");
		 System.out.println("[1] Konversi Mil ke Kilometer");
		 System.out.println("[2] Konversi Kilometer ke Mil");
		 System.out.println("=============================");
         System.out.print("\nMasukan pilihan Anda : ");
         pil = input.nextInt();

         if (pil == 1) {
			 System.out.print("Masukan satuan jarak (Mil) = ");
			 mil = input.nextInt();
			 hasil_km = mil/0.621371;
			 System.out.println("\nJadi "+mil+" Mil = "+hasil_km+" Kilometer");
		 } else if (pil == 2) {
			 System.out.print("Masukan satuan jarak (KM) = ");
			 km = input.nextInt();
			 hasil_mil = km*0.621371;
			 System.out.println("\nJadi "+km+" Kilometer = "+hasil_mil+" Mil");
		 } else {
			 System.out.println("Pilih input yang Benar [1 / 2]");
		 }
	 }
}