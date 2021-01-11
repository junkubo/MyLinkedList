public class TesterJun {
  public static void main (String[] args) {
    MyLinkedList myList = new MyLinkedList();
    myList.add("head");
    myList.add("test1");
    myList.add("test2");
    myList.add("test3");
    myList.add("test4");
    myList.add("tail");
    myList.set(2, "two");
    myList.add(0, 100+"");
    myList.add(3, 120+"");
    myList.add(2, "index add");
    System.out.println("get(3): " + myList.get(3));
    System.out.println("toString(): " + myList.toString());

    myList.remove(0);
    myList.remove(myList.size());
    myList.remove(4);
    System.out.println("toString(): " + myList.toString());


    //System.out.println("This is myList reversed: " + myList.toStringReversed());
    //System.out.println("This is myList raw: " + myList);
  }
}
