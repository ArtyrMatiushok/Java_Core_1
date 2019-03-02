import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean trueorfalse;
		char s;
		short n;
		int a;
		long b;
		float f;
		double d;
		byte m;
		int[] array = new int[10];
		for (int i = 0; i < 10; i++)// задання масиву розміром в 10 значень
		{
			System.out.println("Значення №" + (i + 1));
			array[i] = in.nextInt();// при вводі значення, виводитиметься поле для вводу Значення №n+1, до 10
									// значення
		}
		int min = array[0];
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		Byte qwe;
		Double df;
		Float sjf;
		Long sdf;
		Integer integer;
		Short hur;
		Character character;
		Boolean bool;
		System.out.println("Byte min = " + Byte.MIN_VALUE);
		System.out.println("Byte max = " + Byte.MAX_VALUE);
		System.out.println("Double min = " + Double.MIN_VALUE);
		System.out.println("Double max = " + Double.MAX_VALUE);
		System.out.println("Float min = " + Float.MIN_VALUE);
		System.out.println("Float max = " + Float.MAX_VALUE);
		System.out.println("Long min = " + Long.MIN_VALUE);
		System.out.println("Long max = " + Long.MAX_VALUE);
		System.out.println("Integer min = " + Integer.MIN_VALUE);
		System.out.println("Integer max = " + Integer.MAX_VALUE);
		System.out.println("Short min = " + Short.MIN_VALUE);
		System.out.println("Short max = " + Short.MAX_VALUE);
		System.out.println("Character min = " + Character.MIN_VALUE);
		System.out.println("Character max = " + Character.MAX_VALUE);
		System.out.println("Bool = Only True or False");
		System.out.println("min value in array: " + min);
		System.out.println("max value in array: " + max);
	}
}