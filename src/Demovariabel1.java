//Latihan variabel
package Latihanvariabel01.sesi1.bin;

public class Demovariabel1 {
	public static void main(String[] qq){
		int x=10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		
		//Isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai Y adalah " +y);
		
		//tidak bisa compile (error)
		//char w=x;
		//System.out.println("Nilai W adalah " +x);
		
		//Type casting
		//char v=(char) x;
		int v=30;
		System.out.println("Nilai V adalah " +v);
		System.out.println("Baris selanjutnya");
		
		dani(); //function
		
		System.out.println("Setelah menjalankan dani");
	}
	//static char v;
	static int v=31;
	
	public static void dani() {
		int v=35;
		System.out.println("Nilai V adalah " +v);
		// variabel v tidak boleh dihapus kerana masih dipakai dan masih berada didalam scope
		short d= 15; // variabel boleh dihapus dibaris 22, karena life timenya sudah habis
		System.out.println("D adalah " +d); // variabel d boleh dihapus di baris 26
	}
	//public static void coba() {
	//	System.out.println("Nilai V adalah " +v);
	//}
}