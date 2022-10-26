import java.util.Scanner;
public class dengan_batasan {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;

		System.out.println("================================");
        System.out.println("MENAMPILKAN DERET BILANGAN PRIMA");
        System.out.println("================================");
        System.out.print("Masukan bilangan awal : ");
        awal=input.nextInt();
        System.out.print("Masukan bilangan akhir : ");
        akhir=input.nextInt();
        System.out.println("--------------------------------");
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
   }
}