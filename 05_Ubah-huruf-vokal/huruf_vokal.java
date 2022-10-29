import java.util.Scanner;
public class huruf_vokal
{
	public static void main(String[]args)
 	{
  		String teks, ganti, hasil;
  		Scanner input = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("MENGUBAH HURUF VOKAL & KONSONAN");
        System.out.println("===============================");
  		System.out.print("\nMasukan Teks : ");
  		teks = input.nextLine();

  		System.out.print("Huruf yang akan diganti : ");
  		ganti = input.nextLine();

  		System.out.print("Diganti dengan : ");
  		hasil = input.nextLine();

  		System.out.print("\nHasil Teks : "+teks.replace(ganti, hasil));
   		System.out.println("\n");
   	}
}