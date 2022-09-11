
package sdnl_laporan_9;
import java.util.LinkedList;
public class Queue<E> {
    private LinkedList<E> linkedList;
    Queue() {
        linkedList = new LinkedList<E>();
    }
    public void add(E e){
        linkedList.addLast(e);
    }
    public E remove(){
        return linkedList.removeFirst();
    }
    public void enqueue(E e){
        linkedList.addLast(e);
    }
    public E dequeue(){
        return linkedList.removeFirst();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}