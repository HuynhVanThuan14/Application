package testThoi;

public class Laitesst {
	public static String boiSo7(int n) {
		if (n == 0)
			return "la boi so cua 7";
		if (n < 0)
			return "k la boi so cua 7";
		return boiSo7(n - 7);
	}

	public static int giaiThua(int n) {
		if (n == 0)
			return 1;
		return n * giaiThua((n - 1));
	}

	public static int sum(int n) {
		if (n == 1)
			return 1;
		return n + sum(n - 1);
	}

	public static int sumLe(int n) {
		if (n == 1)
			return 1;
		else if (n % 2 == 0)
			return sumLe(n - 1);
		return n + sumLe(n - 2);
	}

	public static int mu(int x, int y) {
		if (y == 0)
			return 1;
		return mu(x, y - 1) + x;
	}

	public static int haiMuN(int n) {
		if (n == 0)
			return 1;
		return haiMuN(n - 1) + haiMuN(n - 1);
	}

	public static int thuong(int a, int b) {
		if (a < b)
			return 0;
		return thuong(a - b, b) + 1;
	}

	public static int chiaDu(int a, int b) {
		if (a < b)
			return a;
		return chiaDu(a - b, b);
	}

	public static void decToBin(int n) {
		if (n > 0) {
			decToBin(n / 2);
			System.out.println(n % 2);
		}
	}

	public static void decToK(int n, int k) {
		if (n > 0)
			decToK(n / k, k);
		if (n < 0)
			System.out.println(n % k);
		else
			System.out.println((char) (n % k + 55));
	}

	public static void thapHaNoi(int n, String A, String B, String C) {
		if (n == 1)
			System.out.println("chuyen 1 dia tu" + A + " -> " + B);
		else {
			thapHaNoi(n - 1, A, C, B);
			thapHaNoi(1, A, B, C);
			thapHaNoi(n - 1, C, B, A);
		}
	}
	
	public static int fibonacci(int n) {
   		if (n < 0) {
       			return -1;
    		} else if (n == 0 || n == 1) {
        		return n;
    		} else {
        		return fibonacci(n - 1) + fibonacci(n - 2);
    		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(boiSo7(14));
//		System.out.println(giaiThua(12));
//		System.out.println(sum(5));
//		System.out.println(sumLe(5));
//		System.out.println(haiMuN(4));
//		System.out.println(thuong(10, 10));
//		System.out.println(chiaDu(37, 1));
		System.out.println(fibonacci(7));
	}
}
