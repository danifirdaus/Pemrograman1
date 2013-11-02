//perintah control flow/structur kontrol
//perintah ketiga - contoh 03
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>javac -d bin src/DemoLooping2.java
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>java -cp bin Latihan01.sesi1.bin.DemoLooping2
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>git add "src/DemoLooping2.java"
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>git commit -m "commit01"
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>git push origin1 master

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
