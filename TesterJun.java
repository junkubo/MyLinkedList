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

    MyLinkedList myList2 = new MyLinkedList();
    myList2.add("test10");
    myList2.add("test11");
    myList2.add("test12");
    myList2.add("test13");

    myList.extend(myList2);
    System.out.println("After merge!!");
    System.out.println("toString(): " + myList.toString());

    MyLinkedList a = new MyLinkedList();
       MyLinkedList b = new MyLinkedList();
       for(int i = 0; i < 10; i++){
         if(i < 5){
           a.add(i+"");
         }else{
           b.add(i+"");
         }
       }
       System.out.println();
       System.out.println("A:"+a+a.size());
       System.out.println("B:"+b+b.size());

       a.extend(b);
       System.out.println("A:"+a+a.size());
       System.out.println("B:"+b+b.size());
       System.out.println("A reversed:"+a.toStringReversed()+a.size());
       System.out.println("B reversed:"+b.toStringReversed()+b.size());







    //System.out.println("This is myList reversed: " + myList.toStringReversed());
    //System.out.println("This is myList raw: " + myList);
  }
}
