
package sdl.laporan.pkg10;
import java.util.LinkedList;
public class StackDinamis {
    LinkedList tumpukan;
    StackDinamis(){
        tumpukan = new LinkedList();
    }
    public void push(Object elemen){   
        tumpukan.addFirst(elemen);
    }
    public Object pop(){   
        return tumpukan.removeFirst();
    }
    public Object size(){   
        return tumpukan.size();
    }
    public boolean isEmpty(){   
        return tumpukan.isEmpty();
    }
    public void Cetak(){   
        System.out.println(tumpukan.toString());
        
    }
}


