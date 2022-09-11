
package sdl_laporan.pkg8;
public class LinkedList {
    private String name;
    private ListNode firstNode;
    private ListNode lastNode;
    public LinkedList(){
        firstNode = lastNode = null;
    }
     public LinkedList(String nama){
       this.name = name;
        firstNode = lastNode = null;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ListNode getFirstNode() {
        return firstNode;
    }
    public void setFirstNode(ListNode firstNode) {
        this.firstNode = firstNode;
    }
    public ListNode getLastNode() {
        return lastNode;
    }
    public void setLastNode(ListNode lastNode) {
        this.lastNode = lastNode;
    }
    public boolean isEmpty(){
        if (getFirstNode() == null){
            return true;
        }else{
            return false ;       
        }
    }
    public void addFirst(int x){
        if(isEmpty()){
            //Algoritma B
            ListNode baru = new ListNode(x);
            firstNode = baru;
            lastNode = baru;
        }else{
            //Algoritma C
            ListNode baru = new ListNode(x);
            baru.setNext(firstNode);
            firstNode = baru;
        }
    }
     public void addLast(int x){
        if(isEmpty()){
            //Algoritma B
            ListNode baru = new ListNode(x);
            firstNode = baru;
            lastNode = baru;
        }else{
            //Algoritma C
            ListNode baru = new ListNode(x);
           lastNode.setNext(baru);
           lastNode = baru;
        }
    }
     
     public ListNode removeFirst(){
         if(!isEmpty()){
             if (firstNode == lastNode){
                 //Algoritma G
                 ListNode bantu = firstNode;
                 lastNode = firstNode = null;
                 return bantu;
             }else {
                 // Algoritma E
                 ListNode bantu = firstNode;
                 firstNode = firstNode.getNext();
                 return bantu;
             }
         }else {
             return null;
         }
     }
     
     public ListNode removeLast(){
         if(!isEmpty()){
             if (firstNode == lastNode){
                 //Algoritma G
                 ListNode bantu = firstNode;
                 lastNode = firstNode = null;
                 return bantu;
             }else {
                 //Algoritma F
                 ListNode bantu = firstNode;
                 while (bantu.getNext() != lastNode){
                     bantu = bantu.getNext();
                 }
                 lastNode = bantu;
                 bantu = bantu.getNext();
                 lastNode.setNext(null);
                 return bantu;
             }
         }else {
             return null;
         }
     }
    public void print(){
       ListNode bantu = firstNode;
       while (bantu != null){
           System.out.print(bantu.getData() + " ");
           bantu = bantu.getNext();
       }
        System.out.println("");
    }
    }
