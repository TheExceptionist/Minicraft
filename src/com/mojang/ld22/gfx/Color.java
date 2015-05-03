package com.mojang.ld22.gfx;

public class Color {
	//Notch made up his custom coloring system, a little confusing at first.
	//function will accept values 0 to 555
	//Very confusing but, he use the get method below get(d) for get(a, b, c, d)
	public static int get(int a, int b, int c, int d) {
		return (get(d) << 24) + (get(c) << 16) + (get(b) << 8) + (get(a));
	}

	public static int get(int d) {
		if (d < 0) return 255;
		int r = d / 100 % 10;
		int g = d / 10 % 10;
		int b = d % 10;
		return r * 36 + g * 6 + b;
	}

}
