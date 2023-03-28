public class LinkedList {
    Node head;


    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null ){
            head = newNode;
        }
        else{
            Node n = head;
            while (n.next != null){
                n=n.next;

            }
            n.next = newNode;
        }
    }
            public void show(){
                Node node = head;
                while (node.next != null){
                    System.out.println(node.data);
                    node =node.next;
                }
            }
}
