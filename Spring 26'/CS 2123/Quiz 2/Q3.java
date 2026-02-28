import java.util.LinkedList;

public class Q3 {
    public static LinkedList OW(LinkedList list, int i){
        Node currNode = list.head, prev = null;
        if(currNode != null && currNode.data == i){
            list.head = currNode.next;
            System.out.println(i+"Guess A");
            return list;
        }
        while(currNode != null && currNode.data != i){
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode == null){
            System.out.println(i+"Guess B");
            
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(i+"Guess C");
        }
        return list;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        OW(list,1);
        OW(list,5);
        printList(list);
    }   
    
}
