import java.util.Scanner;
public class insertion_sort
{
	public static void main(String[]args)
 	{
  		int jumlah, i, j, swap;
  		Scanner input = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("MENGURUTKAN BILANGAN TERKECIL KE TERBESAR");
		System.out.println("-----  DENGAN METODE INSERTION SORT -----");
        System.out.println("=========================================");
  		System.out.print("\nMasukan Jumlah Bilangan = ");
  		jumlah = input.nextInt();

  		int array[] = new int[jumlah];

  		for(i=0; i<jumlah;i++)
  		{
   			System.out.print("Bilangan Ke-" + (i+1)+" = ");
   			array[i]=input.nextInt();
  		}

  		System.out.print("\nList Bilangan yang Anda Masukan = ");
  		for(int a=0;a<jumlah;a++)
  		{
   			System.out.print(array[a] +" ");
  		}

  		for(i=1; i<=jumlah-1;i++)
  		{
   			j=i;
   			while(j > 0 && array[j] < array[j-1]){
				swap = array[j];
				array[j] = array[j-1];
				array[j-1] = swap;
				j--;
			}
		}

  		System.out.print("\n\nHasil Pengurutan = ");
  		for(i=0;i<jumlah; i++)
   		System.out.print(array[i] +" ");
   		System.out.println("\n");
   	}
}