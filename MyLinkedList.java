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
      head.prev=null;
      tail.next = null;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
      tail.next = null;
    }
    return true;
 }
 public boolean add(int index, String value) {
   count = 0;
   Node current = head;
   while (current != null) {
     count += 1;
     if (count == index) {
       size += 1;
       current.next = current;
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
       return current.data;
     }
     current = current.next;
   }
   return current.data;
 }
 public String set(int index, String value) {
   count = 0;
   Node current = head;
   while (current != null) {
     count += 1;
     if (count == index) {
       size += 1;
       current.data = value;
       return value;
     } else {
       current = current.next;
     }
   }
   return value;
 };
 public String toString() {
   String str = "";
   Node current = head;
   while (current != null) {
     str += current.data + ", ";
     current = current.next;
     }
    return str;

 };
}
