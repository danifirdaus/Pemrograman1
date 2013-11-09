//Perintah Control folw/struktur kontrol
//Perintah kelima - contoh 05

package Latihan01.sesi1.bin;
import java.util.Random;

public class DemoJump2
{
	public static void main(String[] Xx)
	{
		Integer faktor=7;
		Integer jumlahFaktorDiinginkan=4;
		Integer batasAtas=1000000;
		
		System.out.println("Mencari Kelipatan " + faktor + "  dengan break dan Continue");
		Integer jumlahFaktorDitemukan=0;
		while(true)
		{
			Integer random=new Random().nextInt();
			System.out.println("Bilangan Random : "+random);
			
			if(random > batasAtas)
			{
				System.out.println("Melewati batas atas, langsung selesai");
				return;
			}
			if(random % faktor == 0)
			{
				System.out.println("Kelipatan " +faktor+" ditumekan, yaitu :" +random);
				jumlahFaktorDitemukan++;
				
				if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan)
				{
					System.out.println("Baru menemukan " +jumlahFaktorDitemukan+ " faktor");
					System.out.println("dari" +jumlahFaktorDiinginkan +"Yang diminta, lanjut lagi");
					continue;
				}
				else
				{
					System.out.println("Sudah menemukan" +jumlahFaktorDiinginkan +"Selesai Looping");
					break;
				}
			}
		}
		System.out.println("Selesai mencari kelipatan");
	}
}