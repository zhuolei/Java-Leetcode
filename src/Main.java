import java.util.Random;

public class Main {

    private static double testQueue(Queue<Integer> q, int opCount) {

        long startTime = System.nanoTime();

        Random r = new Random();
        for(int i = 0; i < opCount; i++) {
            q.enqueue(r.nextInt(Integer.MAX_VALUE));
        }
        for(int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }
    public static void main(String[] args) {

        int opCount = 1000000;

        ArrayQueue<Integer> aq = new ArrayQueue<>();
        double time1 = testQueue(aq, opCount);
        System.out.println("ArrayQueue: " + time1 + "s");

        LoopQueue<Integer> lq = new LoopQueue<>();
        double time2 = testQueue(lq, opCount);
        System.out.println("LoopQueue: " + time2 + "s");
//        Array<Integer> arr = new Array<>();
//        for(int i = 0 ; i < 10 ; i ++)
//            arr.addLast(i);
//        System.out.println(arr);
//
//        arr.add(1, 100);
//        System.out.println(arr);
//
//        arr.addFirst(-1);
//        System.out.println(arr);
//
//        arr.remove(2);
//        System.out.println(arr);
//
//        arr.removeElement(4);
//        System.out.println(arr);
//
//        arr.removeFirst();
//        System.out.println(arr);
//
//        for(int i = 0 ; i < 4 ; i ++){
//            arr.removeFirst();
//            System.out.println(arr);
//        }
//
//        ArrayStack<Integer> stack = new ArrayStack<>();
//
//        for(int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }


    }
}
