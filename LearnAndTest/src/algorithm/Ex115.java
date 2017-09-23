package algorithm;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex115 {
	public static int judge(double x, double y) {
		if (x < 1 && x > 0 || y < 1 && y > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		double a, b;
		StdOut.println("输入(x,y)");
		a = StdIn.readDouble();
		b = StdIn.readDouble();
		if (judge(a, b) == 1) {
			StdOut.println("true");
		} else {
			StdOut.println("false");
		}
	}

}
