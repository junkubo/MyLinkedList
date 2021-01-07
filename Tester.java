public class Tester {
  public static void main (String[] args) {
    MyLinkedList myList = new MyLinkedList();
    myList.add("head");
    myList.add("test1");
    myList.add("test2");
    myList.add("test3");
    myList.add("test4");
    myList.add("tail");
    myList.set(2, "two");
    System.out.println("get(3): " + myList.get(3));
    System.out.println("toString(): " + myList.toString());
  }
}
