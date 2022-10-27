import java.util.*;
public class min_max {
    public static void main(String[] args)
    {
		System.out.println("=========================================");
		System.out.println("MENENTUKAN BILANGAN TERBESAR DAN TERKECIL");
        System.out.println("=========================================");
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Masukan Jumlah Bilangan : ");
        int panjangArray = scan.nextInt();
        int angka[]=new int[panjangArray];
        int min,max;
        for(int i=0;i<panjangArray;i++)
        {
            System.out.print("Bilangan ke-"+(i+1)+" : ");
            angka[i]= scan.nextInt();
        }
        min=angka[0];
        max=angka[0];
        for(int i=0;i<panjangArray;i++)
        {
            if(angka[i]<min)
                min=angka[i];
            if(angka[i]>max)
                max=angka[i];
        }
        System.out.println("-----------------------------------------");
    	System.out.println("Bilangan Terkecil : " +min);
    	System.out.println("Bilangan Terbesar : " +max);
    }
}