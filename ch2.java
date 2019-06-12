import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

public static void main(String[] args) {
   System.out.println(getNthNumber(-16, -14)); // 1
   System.out.println(getNthNumber(16, -14)); // 1
   System.out.println(getNthNumber(16, 0)); // 1
   System.out.println(getNthNumber(16, 1)); // 6
   System.out.println(getNthNumber(16, 4)); // 6
   System.out.println(getNthNumber(12345678, 4)); // 5
}

static int getNthNumber(final int pNumber, final int pIndex) {
   final String numberString = Integer.toString(abs(pNumber));
   return numberString.charAt(max(0, min(pIndex, numberString.length() - 1))) - '0';
}
