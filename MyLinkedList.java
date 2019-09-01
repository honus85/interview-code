class MyLinkedList{ 

  static class LinkedList<T>{

    Node<T> head;
    Node<T> current;

    class Node<T>{

      T data;
      private Node next;
      public Node(T data){
         this.data = data;
         this.next = null;
      }
    }

    public LinkedList(){

    }

    public Node reverse (Node node){
      Node prev = null;
      Node current = node;
      Node next = null;
       
      while (current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      node = prev;
      return node;
    }


    public void add(T data){
      if (head == null){
        head = new Node(data);
        current = head;
      }
      else{
         Node<T> last = this.current;
         Node<T> next = new Node(data);
         current = next;
         last.next = next;
      }
    }

    public T getElem(int n){
      Node<T> start = head;
      if (n==0){
        return head.data;
      }
      else{
        for (int i=0; i<n; i++){
          start = start.next;
        }
        return start.data;
       }
    }

  }

  public static void main(String[] args) {
    LinkedList myll = new LinkedList<>();
    myll.add("element_1");
    myll.add("element_2");
    myll.add("element_3");
    System.out.println(myll.getElem(0));
    myll.head = myll.reverse(myll.head);
    System.out.println(myll.getElem(0));
  }
}