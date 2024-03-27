package src.bitmanipulation;

public class BitManipulation {
    public static void main(String[] args) {
        int n =5; // 0101
        int positionsShift = 0;
        int bitMask = 1<<positionsShift;

//      // get bit
//        if ((bitMask & n) == 3){
//            System.out.println("bit was zero");
//        }
//        else {
//            System.out.println("bit was one");
//        }

        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }
}
