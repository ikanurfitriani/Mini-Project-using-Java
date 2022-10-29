import java.util.Scanner;
public class fibonacci
{
	public static void main(String [] args)
 	{
  		int n;
  		Scanner input = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("----- MENGHITUNG FAKTORIAL -----");
        System.out.println("================================");
  		System.out.print("\nMasukan panjang deret = ");
  		n = input.nextInt();
  		long fib[] = new long[n];

  		fib[0] = 0;
  		fib[1] = 1;

  		for (int i = 2; i<n; i++){
			fib [i] = fib[i-1] + fib [i-2];
		}
		for (int i = 0; i <n; i++){
			System.out.print(fib[i] + " ");
        }
   		System.out.println("\n");
   	}
}