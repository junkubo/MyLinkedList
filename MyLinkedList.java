public class MyLinkedList{
 private int size;
 private Node start,end;
 private Node head = null;
 private Node tail = null;

 public MyLinkedList(){

   this.size = 0;
   this.start = start;
   this.end = end;
 }
 public int size() {
   return size;
 }


 public boolean add(String value) {
    Node newNode = new Node(value);
    size += 1;
    if (head==null) {
      head = tail = newNode;
      head.previous=null;
      tail.next = null;
    } else {
      tail.next = newNode;
      newNode.previous = tail;
      tail = newNode;
      tail.next = null;
    }
 }
 public boolean add(int index, String value) {

 }
 public String get(int index);
 public String set(int index, String value);
 public String toString();
}
