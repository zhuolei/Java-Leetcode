public interface Queue<E> {

    int getSize(); //O(1)
    boolean isEmpty(); //O(1)
    void enqueue(E e); //O(1) 均摊
    E dequeue(); // O(n)
    E getFront(); //O(1)
}
