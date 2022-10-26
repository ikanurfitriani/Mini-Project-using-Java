import java.util.Scanner;
public class ganjil_genap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int pilihan, awal, akhir;

		System.out.println("=========================================");
        System.out.println("MENAMPILKAN DERET BILANGAN GANJIL & GENAP");
        System.out.println("=========================================");
        System.out.print("Masukan Bilangan Awal : ");
		awal=input.nextInt();
		System.out.print("Masukan Bilangan Akhir : ");
        akhir=input.nextInt();
        System.out.println("\nPilihan: \n[1. Ganjil]\n[2. Genap]");
        System.out.print("Masukan Pilihan Anda : ");
        pilihan=input.nextInt();
        System.out.println("-----------------------------------------");

        switch (pilihan){
            case 1 :
                    System.out.println("Deret Bilangan Ganjil");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2!=0)
                        System.out.print(i+" ");
                    }
                    break;
            case 2 :
                    System.out.println("Deret Bilangan Genap");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2==0)
                        System.out.print(i+" ");
                    }
                    break;
        }
        System.out.println("");
    }
}