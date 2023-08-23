import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while ( t-- != 0 )
		{
			int check = 0;
			String s = scanner.next();
			char[] s1 = s.toCharArray();
			for (int i = 0 ; i < s.length() ; i++)
			{
				if ( s1[i] == '8' || s1[i] == '9' )
					s1[i] = '0';
				else if ( s1[i] != '0' && s1[i] != '1' )
				{
					check = 1;
					break;
				}
			}
			String res = "";
	        int idx = 0;
	        while(idx < s.length() && s1[idx] == '0')
	            idx++;
	        for(int i = idx; i < s.length() ; i++)
	            res += s1[i];
	        if ( idx == s.length() || check == 1 )
	        	System.out.println("INVALID");
	        else
	        	System.out.println(res);
		}
	}
}
