/**
*class increment.
*@author (Dani)
*version (op-02)
*/

package increment.bin;

public class increment
{
	public static void main(String[] args)
	{
		int a;
		a=120;
		System.out.println ("contoh postfix increment :");
		System.out.println (a);
		System.out.println (a++);
		System.out.println (a);
		a=120;
		System.out.println ("contoh prefix increment : ");
		System.out.println (a);
		System.out.println (++a);
		System.out.println (a);
		a=120;
		System.out.println ("contoh postfix decrement : ");
		System.out.println (a);
		System.out.println (a--);
		System.out.println (a);
		a=120;
		System.out.println ("contoh prefix decrement : ");
		System.out.println (a);
		System.out.println (--a);
		System.out.println (a);
	}
}