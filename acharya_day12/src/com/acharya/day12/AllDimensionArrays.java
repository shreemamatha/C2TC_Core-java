package com.acharya.day12;

public class AllDimensionArrays {

	public static void main(String[] args) {
		int[] a1d = {};
		int[] b1d = {1, 3};
        int[][] a2d = {};
        int[][] b2d = {{}};
        int[][] c2d = {{1, 2},{5}};
        System.out.print(a1d.length + " " + b1d.length + " ");
        System.out.print(a2d.length + " " + a2d.length + " ");
        System.out.print(a1d.length + " " + b1d.length + " ");
	}

}
