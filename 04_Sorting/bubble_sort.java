import java.util.Scanner;
public class bubble_sort
{
	public static void main(String[]args)
 	{
  		int jumlah, i, j, swap;
  		Scanner input = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("MENGURUTKAN BILANGAN TERKECIL KE TERBESAR");
		System.out.println("------- DENGAN METODE BUBBLE SORT -------");
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

  		for(i=0; i<(jumlah-1);i++)
  		{
   			for(j=0;j<jumlah-i-1;j++)
   			{
    			if (array[j] > array[j+1])
    			{
     				swap = array[j];
     				array[j] = array[j+1];
     				array[j+1]=swap;
    			}
    		}
		}

  		System.out.print("\n\nHasil Pengurutan = ");
  		for(i=0;i<jumlah; i++)
   		System.out.print(array[i] +" ");
   		System.out.println("\n");
   	}
}