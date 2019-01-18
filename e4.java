package org.arpit.java2blog;
 
import java.util.Scanner;
 
public class SegmentTree
{
 
	static int[] segArr;
 
	public static void main(String[] args) 
  {
 
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
 
		for (int i = 0; i  0)
    {
			int check = scn.nextInt();
 
			if (check == 1)
      {
				int ql = scn.nextInt();
				int qr = scn.nextInt();
 
				System.out.println(getQuery(0, 0, arr.length - 1, ql, qr, arr));
			} else {
 
				int idx = scn.nextInt();
				int value = scn.nextInt();
				update(value, idx, 0, 0, arr.length - 1, arr);
 
			}
		}
 
 
	}
