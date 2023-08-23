import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	static long gcd(long a, long b)
    {
        if( b == 0 )
            return a;
        return gcd(b, a % b);
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while ( t-- != 0 )
		{
			long a = scanner.nextInt();
			long b = scanner.nextInt();
			long c = gcd(a, b);
			System.out.println(a * b / c + " " + c);
		}
	}
}
