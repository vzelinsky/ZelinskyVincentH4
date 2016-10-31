/* Queue.java
 * Written by Vincent Zelinsky
 * 
 * Contains the necessary methods to create a Queue, interacts with Node.java(S+Q)
 */
public class Queue {
  //Private fields
  //Contains a reference to the head Node object
  private Node head;
  //Contains a reference to the tail Node object
  private Node tail;
  
  //Constructors
  //No argument constructor that when called creates an empty Queue
  public Queue() {
    //Sets head to null
    this.head = null;
    //Sets tail to null
    this.tail = null;
  }
  
  //Methods
  //Getter methods
  //Returns the reference to the Node stored at head
  public Node getHead() {
    return head;
  }
  //Returns the reference to the Node stored at tail
  public Node getTail() {
    return tail;
  }
  
  //enqueue method
  //Adds a Node to the front of the Queue as the new end
  public void enqueue(String dataInput) {
    //Case 1: if the Queue is empty (head = null)
    //Inserts the new Node at head and makes it the tail as it is the only Node
    if(this.head == null) {
      //Add the Node as the head
      this.head = new Node(dataInput);
      //Set the tail to the same Node as head
      this.tail = this.head;
    }
    else{
      Node n = new Node(dataInput);
      tail.setNext(n);
      this.tail = n;
    }
  }
  //dequeue method
  //Returns a Node from the front of the Queue, then removes it from the Queue
  public Node dequeue() {
    Node t = this.head;
    if (this.head.getData().compareTo(this.tail.getData()) == 0) {
      this.head = null;
      this.tail = null;
    }
    else {
      this.head = head.getNext();
      t.setNext(null);
    }
    return(t);
  }
  //peek method
  //Returns a Node from the top of the Queue
  public Node peek() {
    return this.head;
  }
  
  //deleteQueue method
  //Removes references to the Queue, deleting the Queue
  public void deleteQueue() {
    //Makes head null
    this.head = null;
    //Makes tail null
    this.tail = null;
    //Print success
    System.out.println("The Queue has been deleted");
  }
}