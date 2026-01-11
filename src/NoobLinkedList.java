import java.sql.SQLOutput;
import java.util.List;

public class NoobLinkedList {

   Node head;

   public void insert(int data){
      Node node = new Node(data);

      if (head == null){
         head = node;
      }
      else {
         Node n = head;
         while(n.next != null){
            n = n.next;
         }
         n.next = node;
      }
   }

   public void insertAt(int data, int index) {
      Node node = new Node(data);
      Node n = head;

      if (index == 0){
         insertAtStart(data);
         return;
      }

      if (index < 0){
         System.out.println("Index error\n Negative index");
         System.exit(0);
      }

      if (index - ListLength() > 1){
         System.out.println("That index doesn't exist, theres only " + ListLength() + " nodes.");
         System.exit(0);
      }

      for (int i = 0; i < index - 1; i++){
         n = n.next;
      }

      node.next = n.next;
      n.next = node;
   }


   public void insertAtStart(int data){
      Node node = new Node(data);
      node.next = head;
      head = node;

   }

   public void delete(){
      Node n = head;
      for (int i = 0; i < ListLength() - 2; i++){
         /*
            Have to subtract 2 because ListLength() returns the number of nodes and not the last index of the last node
            and I want to get the node before the last
         */
         n = n.next;
      }
      n.next = null;

   }

   public void deleteAt(int index){
      Node n = head;
      Node n1;

      if(index == 0){
         head = head.next;
         return;
      }

      for (int i = 0; i < index - 1; i++){
         n = n.next;
      }
      n1 = n.next;
      n.next = n1.next;
   }

   public int addAllData(){
      Node n = head;
      int sum = 0;
      while(n.next != null){
         sum += n.data;
         n = n.next;
      }
      sum += n.data;
      return sum;
   }

   public int ListLength(){
      Node n = head;
      int i = 0;
      while(n.next != null){
         i++;
         n = n.next;
      }
      return i + 1;
   }

   public void printList(){
      Node n = head;
      while(n.next != null){
         System.out.println(n.data);
         n = n.next;
      }
      System.out.println(n.data);
   }

}
