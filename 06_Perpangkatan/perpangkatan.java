import java.util.Scanner;
public class perpangkatan
{
	public static void main(String [] args)
 	{
  		int bil, pangkat, hasil=1;
  		Scanner input = new Scanner(System.in);

		System.out.println("=======================");
		System.out.println("MENGHITUNG PERPANGKATAN");
        System.out.println("=======================");
  		System.out.print("\nMasukan Bilangan = ");
  		bil = input.nextInt();

  		System.out.print("Masukan Pangkat = ");
  		pangkat = input.nextInt();

  		for(int i=1;i<=pangkat;i++){
			hasil=hasil*bil;
		}
		System.out.print("\nHasil dari "+bil+" pangkat "+pangkat+" = "+hasil);
   		System.out.println("\n");
   	}
}