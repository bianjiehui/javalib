package algorithm;

import edu.princeton.cs.algs4.StdOut;

public class Ex113 {
	public static String judgeEqual(String x, String y, String z) {
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int c = Integer.parseInt(z);

		if (a == b && a == c)
			return "equal";
		else
			return "not equal";
	}

	public static void main(String[] args) {
		String rs = judgeEqual(args[0], args[1], args[2]);
		StdOut.println(rs);
	}
}
