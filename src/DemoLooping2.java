//perintah control flow/structur kontrol
//perintah ketiga - contoh 03
package Latihan01.sesi1.bin;
import java.util.Random;

public class DemoLooping2
{
	static boolean selesai = false;
	public static void main(String[] Xx)
	{
		Integer faktor =7;
		System.out.println("Mencari Kelipatan " +faktor + " dengan while");
		while(!selesai)
		{
			cariKelipatan(faktor);
		}
		System.out.println("SELESAI MENCARI KELIPATAN DENGAN WHILE");
		System.out.println();
		System.out.println();
		System.out.println("Mencari Kelipatan " +faktor + " dengan for");
		for(selesai=false; !selesai;)
		{
			cariKelipatan(faktor);
		}
		System.out.println("SELESAI MENCARI KELIPATAN DENGAN FOR");
	}
	public static void cariKelipatan(Integer faktor)
	{
		Integer random = new Random().nextInt();
		System.out.println("Bilangan Random : " +random);
		
		if(random % faktor == 0)
		{
			System.out.println("Kelipatan " +faktor + " ditemukan, yaitu : " +random);
			selesai = true;
		}
	}
}
