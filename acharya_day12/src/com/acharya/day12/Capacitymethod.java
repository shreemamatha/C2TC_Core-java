package com.acharya.day12;

public class Capacitymethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Good Morining");
		System.out.println(sb.capacity());
		sb.append("I love My Life");
		System.out.println(sb.capacity());
	}
}