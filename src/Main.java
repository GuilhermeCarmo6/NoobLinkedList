import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoobLinkedList NoobLinkedList= new NoobLinkedList();
        int n;
        String s;
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            s = sc.nextLine();
            if (s.isEmpty()){
                break;
            }

            NoobLinkedList.insert(Integer.parseInt(s));
        }
        sc.close();

        NoobLinkedList.printList();
    }
}