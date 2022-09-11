
package sdl_laporan.pkg8;
public class MainSingleLinkedList {
    public static void main(String[] args) {
        LinkedList senarai = new LinkedList();
        senarai.addFirst(8);
        senarai.print();
        senarai.addFirst(15);
        senarai.print();
        senarai.addFirst(26);
        senarai.print();
        senarai.addFirst(14);
        senarai.print();
        senarai.removeLast();
        senarai.print();
        senarai.removeFirst();
        senarai.print();

    }
}
