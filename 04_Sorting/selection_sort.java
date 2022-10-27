import java.util.Scanner;
public class selection_sort
{
	public static void main(String[]args)
 	{
  		int jumlah, i, j, p, swap;
  		Scanner input = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("MENGURUTKAN BILANGAN TERKECIL KE TERBESAR");
		System.out.println("-----  DENGAN METODE SELECTION SORT -----");
        System.out.println("=========================================");
  		System.out.print("\nMasukan Jumlah Bilangan = ");
  		jumlah = input.nextInt();

  		int array[] = new int[jumlah];

  		for(i=0; i<jumlah; i++)
  		{
   			System.out.print("Bilangan Ke-" + (i+1)+" = ");
   			array[i]=input.nextInt();
  		}

  		System.out.print("\nList Bilangan yang Anda Masukan = ");
  		for(int a=0; a<jumlah; a++)
  		{
   			System.out.print(array[a] +" ");
  		}

  		for(i=0; i<=jumlah-1; i++)
  		{
   			p=i;
   			for(j=i+1; j<jumlah; j++)
   			{
				if(array[p] > array[j])
				{
					p=j;
				}
			}
			if(p != i)
			{
				swap = array[i];
				array[i] = array[p];
				array[p] = swap;
			}
		}
  		System.out.print("\n\nHasil Pengurutan = ");
  		for(i=0; i<jumlah; i++)
   		System.out.print(array[i] +" ");
   		System.out.println("\n");
   	}
}