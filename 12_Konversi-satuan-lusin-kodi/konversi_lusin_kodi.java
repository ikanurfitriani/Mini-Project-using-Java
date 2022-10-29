import java.util.Scanner;
public class konversi_lusin_kodi
{
	public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
         int jumlah, lusin, kodi;
         System.out.println("==============================");
		 System.out.println("KONVERSI SATUAN LUSIN DAN KODI");
		 System.out.println("==============================");
         System.out.print("Masukan jumlah barang : ");
         jumlah=input.nextInt();

         lusin = (jumlah/12);
         kodi = (jumlah/20);

		 System.out.println("\nJadi "+jumlah+" barang = "+lusin+" lusin");
		 System.out.println("Jadi "+jumlah+" barang = "+kodi+" kodi");
         System.out.println("");
    }
}