
package sdl.laporan.pkg10;
public class LinkedList {
    private ListNode head;
    private int size;
    public LinkedList() {
        head = new ListNode();
        head.next = head;
        head.prev= head;
        size = 0;
    }
    public void addBefore(Object x, ListNode Bantu) {   
        ListNode baru = new ListNode(x);
        baru.next = Bantu;
        baru.prev = Bantu.prev;
        Bantu.prev.next = baru;
        Bantu.prev = baru;
        size++;
    }
    public Object remove(ListNode Bantu) {   
        Bantu.prev.next = Bantu.next;
        Bantu.next.prev = Bantu.prev;
        size--;
        return Bantu.getElemen();
    }
    public void addFirst(Object x) {   
        addBefore(x, head.next);
    }
    public void addLast(Object x) {   
        addBefore(x, head);
    }
    public Object removeFirst() {   
        return remove(head.next);
    }
    public Object removeLast() {   
        return remove(head.prev);
    }
    public boolean isEmpty() {   
        if (head == head.next) {
            return true;
        } else {
            return false;
        }
    }
    public ListNode search(Object Cari){   
        ListNode Bantu = head.next;
        while(Bantu != head){
            if(Cari == Bantu.elemen){
                return Bantu;
            }
            Bantu = Bantu.next;
        }
        return null;
    }
    public int size(){   
        return size;
    }
    @Override
    public String toString() {   
        String temp = " ";
        ListNode Bantu = head.next;
        while (Bantu != head) {
            temp = temp + Bantu.elemen + " ";
            Bantu = Bantu.next;
        }
        return temp;
    }
}

