public class Main 
{
    public static void main(String... args)
    {
        int place = args.length > 0 ? Integer.parseInt(args[0]) : 250 * 1000;
        long start = System.nanoTime();
        BigInteger fibNumber = fib(place);
        long time = System.nanoTime() - start;

        System.out.println(place + "th fib # is: " + fibNumber);
        System.out.printf("Time to compute: %5.1f seconds.%n", time / 1.0e9);
    }

    private static BigInteger fib(int place
    ) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        while (place-- > 1) {
            BigInteger t = b;
            b = a.add(b);
            a = t;
        }
        return b;
    }
}
