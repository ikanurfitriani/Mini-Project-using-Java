import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class all
{
	public static void main(String args[]) {
		BufferedReader B=new BufferedReader (new InputStreamReader(System.in));
		int angka [] = new int[100];
		int urut [] = new int[100];
		int Modus [][] = new int[100][100];
		int inputCount=0;
		int N;
		int i, a, b, c, d, j, temp;

		//mean
		float jumlah;
		float mean=0;
		try
		{
			System.out.println("============================");
			System.out.println("MENENTUKAN MEAN MEDIAN MODUS");
			System.out.println("============================");
			System.out.print("\nMasukan banyaknya data : ");
			N=Integer.parseInt (B.readLine());
			System.out.println();
			jumlah = 0;
			try
			{
				for (i=1; i<=N; i++)
				{
					System.out.print("Masukan ke " + i + " : ");
					angka[i]=Integer.parseInt (B.readLine());
					jumlah = jumlah + angka[i];
					urut[i] = angka[i];
				}
				mean = jumlah/N;

				//pengurutan
				for (a=1; a<=N; a++) {
					b=a;
					while ((b>0) && (urut[b] < urut[b-1] )) {
						temp = urut[b];
						urut[b] = urut[b-1];
						urut[b-1] = temp;
						b--;
					}
				}

				//median
				int Nm = N/2;
				int median = urut[(N+1)/2];
				int lastEmpty = 1;
				int posx;
				for (i=1; i<=N; i++) {
					posx = 0;
					for (j=1; j<=N; j++) {
						if (angka[i] == Modus[j][1]) posx = j;
					}
					if (posx!=0) {
						Modus[posx][2]++;
					} else {
						Modus[lastEmpty][1] = angka[i];
						Modus[lastEmpty][2] = 1;
						lastEmpty++;
					}
				}

				//modus
				int modus = 0;
				int banyak = 0;
				for (i=1; i<=N; i++) {
					if (Modus[i][2]>banyak) {
						modus = Modus[i][1];
						banyak = Modus[i][2];
					}
				}

				System.out.println("\nData terurut:");
				for (i=1; i<=N; i++) {
					System.out.print(" "+ urut[i]);
				}

				System.out.println("\n");
				System.out.println("Mean   = " + mean);
				System.out.println("Median = " + median);
				System.out.println("Modus  = " + modus);
				System.out.println("");
			} catch (IOException e) {
				System.out.println ("Error!" +e);
			}
		} catch (IOException e) {
			System.out.println ("Error!" +e);
		}
		System.exit(0);
	}
}