//Perintah control flow/structur kontrol
//Perintah keempat - contoh 04
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>javac -d bin src/DemoKalender.java
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>java -cp bin Latihan01.sesi1.bin.DemoKalender
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>git add "src/DemoKalender.java"
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>git commit -m "commit01"
//E:\Dropbox\kuliah\smester4\Pemrograman 1\sesi01>git push origin1 master

package Latihan01.sesi1.bin;

public class DemoKalender
{
	public static void main(String[] Xx)
	{
		hitungHari(2010, 2);
		hitungHari(2013, 4);
	}
	public static void hitungHari(Integer tahun, Integer bulan)
	{
		switch(bulan)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 hari");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 hari");
				break;
			case 2:
				if(tahun % 4 == 0)
				{
					System.out.println("29 hari");
				}
				else
				{
					System.out.println("28 hari");
				}
				break;
			default:
				System.out.println("Nilai Bulan Tidak Valid");
		}
	}
}