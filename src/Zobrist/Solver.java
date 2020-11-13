package Zobrist;

public class Solver {


    public static void main (String[] args) {
        Connect4 g = new Connect4(5, 5, 4);
        long start = System.currentTimeMillis();
        g.solve();
        System.out.println("Time taken : " + (((double) System.currentTimeMillis() - start) / 1000));
        g.printInfo();
        g.play();
    }


}
