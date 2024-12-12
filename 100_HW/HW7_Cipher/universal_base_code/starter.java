/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String encoded = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
		System.out.println(encoded);
		String encoded2 = Cipher.encode("sv8vq17r 1r q25 85rq");
		System.out.println(encoded2);
		String encoded3 = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
		System.out.println(encoded3);
		String encoded4 = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
		System.out.println(encoded4);
		String encoded5 = Cipher.keyedEncode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d", 8);
		System.out.println(encoded5);
		String encoded6 = Cipher.encode("a8 1oy 92 1kx rxdj in 4");
		System.out.println(encoded6);
		String encoded7 = Cipher.encode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8");
		System.out.println(encoded7);
		String encoded8 = Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw");
		System.out.println(encoded8);
	}
}
