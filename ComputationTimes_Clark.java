import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

//ComputationTimes_HW5
//Autumn Clark
//CS 2235
//Dr. Kirby
public class ComputationTimes_Clark {
    //Methods
    //Return a long[][] of run times for adding to the front
    public static long[][] AddFront(){
        long[][] frontTimes = new long[3][4];
        ArrayDeque<Integer> arrDeque = new ArrayDeque<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> lnkList = new LinkedList<>();
        int x1 = 100000, x2 = 200000, x3 = 400000, x4 = 800000;

        //ArrDeque add 100,000
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            arrDeque.addFirst(i);
        }
        long endTime = System.currentTimeMillis();
        frontTimes[0][0] = endTime - startTime;
        //Add 200,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            arrDeque.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[0][1] = endTime - startTime;
        //Add 400,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            arrDeque.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[0][2] = endTime - startTime;
        //Add 800,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            arrDeque.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[0][3] = endTime - startTime;


        //ArrList add 100,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            arrList.add(i,i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[1][0] = endTime - startTime;
        //Add 200,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            arrList.add(i,i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[1][1] = endTime - startTime;
        //Add 400,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            arrList.add(i,i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[1][2] = endTime - startTime;
        //Add 800,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            arrList.add(i,i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[1][3] = endTime - startTime;


        //LnkList add 100,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            lnkList.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[2][0] = endTime - startTime;
        //Add 200,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            lnkList.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[2][1] = endTime - startTime;
        //Add 400,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            lnkList.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[2][2] = endTime - startTime;
        //Add 800,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            lnkList.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        frontTimes[2][3] = endTime - startTime;


        return frontTimes;
    }

    //Return a long[][] of run times for adding to the back
    public static long[][] AddBack(){
        long[][] backTimes = new long[3][4];
        ArrayDeque<Integer> arrDeque = new ArrayDeque<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> lnkList = new LinkedList<>();
        int x1 = 1000000, x2 = 2000000, x3 = 4000000, x4 = 8000000;

        //ArrDeque add 1,000,000
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            arrDeque.addLast(i);
        }
        long endTime = System.currentTimeMillis();
        backTimes[0][0] = endTime - startTime;
        //Add 2,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            arrDeque.addLast(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[0][1] = endTime - startTime;
        //Add 4,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            arrDeque.addLast(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[0][2] = endTime - startTime;
        //Add 8,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            arrDeque.addLast(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[0][3] = endTime - startTime;


        //ArrList add 1,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            arrList.add(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[1][0] = endTime - startTime;
        //Add 2,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            arrList.add(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[1][1] = endTime - startTime;
        //Add 4,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            arrList.add(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[1][2] = endTime - startTime;
        //Add 8,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            arrList.add(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[1][3] = endTime - startTime;


        //LnkList add 1,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            lnkList.addLast(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[2][0] = endTime - startTime;
        //Add 200,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            lnkList.addLast(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[2][1] = endTime - startTime;
        //Add 4,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            lnkList.addLast(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[2][2] = endTime - startTime;
        //Add 8,000,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            lnkList.addLast(i);
        }
        endTime = System.currentTimeMillis();
        backTimes[2][3] = endTime - startTime;

        return backTimes;
    }

    //Return a long[][] of run times for adding to the middle
    public static long[][] AddMiddle(){
        long[][] midTimes = new long[2][4];
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> lnkList = new LinkedList<>();
        int x1 = 25000, x2 = 50000, x3 = 100000, x4 = 200000;


        //ArrList add 25,000
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            arrList.add(i/2,i);
        }
         long endTime = System.currentTimeMillis();
        midTimes[0][0] = endTime - startTime;
        //Add 50,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            arrList.add(i/2,i);
        }
        endTime = System.currentTimeMillis();
        midTimes[0][1] = endTime - startTime;
        //Add 100,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            arrList.add(i/2,i);
        }
        endTime = System.currentTimeMillis();
        midTimes[0][2] = endTime - startTime;
        //Add 200,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            arrList.add(i/2,i);
        }
        endTime = System.currentTimeMillis();
        midTimes[0][3] = endTime - startTime;


        //LnkList add 25,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x1; i++){
            lnkList.add(i/2, i);
        }
        endTime = System.currentTimeMillis();
        midTimes[1][0] = endTime - startTime;
        //Add 50,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x2; i++){
            lnkList.add(i/2, i);
        }
        endTime = System.currentTimeMillis();
        midTimes[1][1] = endTime - startTime;
        //Add 100,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x3; i++){
            lnkList.add(i/2, i);
        }
        endTime = System.currentTimeMillis();
        midTimes[1][2] = endTime - startTime;
        //Add 100,000
        startTime = System.currentTimeMillis();
        for (int i = 0; i < x4; i++){
            lnkList.add(i/2, i);
        }
        endTime = System.currentTimeMillis();
        midTimes[1][3] = endTime - startTime;

        return midTimes;
    }

    public static void main(String[] args){
        long[][] frontTimes = AddFront();
        long[][] backTimes = AddBack();
        long[][] midTimes = AddMiddle();

        System.out.println("Front run times: \n" + "ArrayDeque: " + frontTimes[0][0] + " " + frontTimes[0][1] + " "
                + frontTimes[0][2] + " " + frontTimes[0][3] + "\nArrayList: " + frontTimes[1][0] + " " + frontTimes[1][1]
                + " " + frontTimes[1][2] + " " + frontTimes[1][3] + "\nLinkedList: " + frontTimes[2][0] + " "
                + frontTimes[2][1] + " " + frontTimes[2][2] + " " + frontTimes[2][3]);

        System.out.println("Back run times: \n" + "ArrayDeque: " + backTimes[0][0] + " " + backTimes[0][1] + " "
                + backTimes[0][2] + " " + backTimes[0][3] + "\nArrayList: " + backTimes[1][0] + " " + backTimes[1][1]
                + " " + backTimes[1][2] + " " + backTimes[1][3] + "\nLinkedList: " + backTimes[2][0] + " "
                + backTimes[2][1] + " " + backTimes[2][2] + " " + frontTimes[2][3]);

        System.out.println("Middle run times: \n" + "ArrayList: " + midTimes[0][0] + " " + midTimes[0][1] + " "
                + midTimes[0][2] + " " + midTimes[0][3] + "\nLinkedList: " + midTimes[1][0] + " " + midTimes[1][1]
                + " " + midTimes[1][2] + " " + midTimes[1][3]);
    }
}
