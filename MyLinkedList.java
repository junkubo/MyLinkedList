public class MyLinkedList{
 private int size;
 private Node start,end;
 private Node head = null;
 private Node tail = null;
 private int count = 0;

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
      head.setPrev(null);
      tail.setNext(null);
    } else {
      tail.setNext(newNode);
      newNode.setPrev(tail);
      tail = newNode;
      tail.setNext(null);
    }
    return true;
 }
 public boolean add(int index, String value) throws IndexOutOfBoundsException {
   count = 0;
   Node current = head;
   if (index < 0 || index > size) {
     throw new IndexOutOfBoundsException("OUT OF RANGE!!");
   }
   while (current != null) {
     count += 1;
     if (count == index) {
       size += 1;
       current.setNext(current);
       current = new Node(value);
       return true;
     }
   }
   return false;
 }
 public String get(int index) {
   count = 0;
   Node current = head;
   while (current != null) {
     count += 1;
     if (count == index) {
       return current.getData();
     }
     current = current.getNext();
   }
   return current.getData();
 }
 public String set(int index, String value) {
   count = 0;
   Node current = head;
   while (current != null) {
     count += 1;
     if (count == index) {
       size += 1;
       current.setData(value);
       return value;
     } else {
       current = current.getNext();
     }
   }
   return value;
 };
 public String toString() {
   String str = "";
   Node current = head;
   while (current != null) {
     str += current.getData() + ", ";
     current = current.getNext();
     }
    return str;

 };
 public String toStringReversed() {
   String str = "";
   Node current = tail;
   while (current != null) {
     str += current.getData() + ", ";
     current = current.getPrev();
   }
   return str;
 }
}
