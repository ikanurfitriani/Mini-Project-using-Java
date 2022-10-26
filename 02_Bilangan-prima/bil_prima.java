import java.util.Scanner;
public class bil_prima {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, cek=0;

       	System.out.println("=========================");
        System.out.println("MENENTUKAN BILANGAN PRIMA");
        System.out.println("=========================");
        System.out.print("Masukan bilangan : ");
        bil=input.nextInt();

        System.out.println("-------------------------");
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bil+" merupakan bilangan Prima");
        }else {
            System.out.println(bil+" bukan bilangan Prima");
        }
   }
}