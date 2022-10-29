import java.util.Scanner;
public class faktorial
{
	public static void main(String [] args)
 	{
  		int n, i, hasil=1;
  		Scanner input = new Scanner(System.in);

		System.out.println("====================");
		System.out.println("MENGHITUNG FAKTORIAL");
        System.out.println("====================");
  		System.out.print("\nMasukan Bilangan = ");
  		n = input.nextInt();

  		if(n>0){
			for(i=1;i<n;i++)
				hasil=hasil*(n-i);
				hasil=hasil*n;
		}
		else{
			hasil=1;
		}
		System.out.print("\nHasil dari "+n+ "! = "+hasil);
   		System.out.println("\n");
   	}
}