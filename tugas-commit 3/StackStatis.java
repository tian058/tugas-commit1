
package sdl.laporan.pkg10;
import java.util.NoSuchElementException;
public class StackStatis {
    Object[] elemen;
    int front = -1;
    int size = 0;
    StackStatis() {
    }
    StackStatis(int ukuran) {
        elemen = new Object[ukuran];
    }
    public Object push(Object x) {
        if (size < elemen.length) {
            front++;
            elemen[front] = x;
            size++;
            return true;
        } else {
            return false;
        }
    }
    public Object pop() {
        if (!isEmpty()) {
            Object hapus = elemen[front];
            front--;
            size--;
            return hapus;
        } else {
            throw new NoSuchElementException();
        }
    }
    public Object size(){   
        return size;
    }
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void Cetak(){   
        for (int i = 0; i < size; i++) {
            System.out.println(elemen[i]);
        }
    }   
}
