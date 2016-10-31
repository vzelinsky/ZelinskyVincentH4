/* Stack.java
 * Written by Vincent Zelinsky
 * 
 * Contains the necessary methods to create a Stack, interacts with Node.java(S+Q)
 */
public class Stack {
  //Private fields
  //Contains a reference to the head Node object
  private Node head;
  
  //Constructors
  //No argument constructor that when called creates an empty List
  public Stack() {
    //Sets head to null
    this.head = null;
  }
  
  //Methods
  //Getter methods
  //Returns the reference to the Node stored at head
  public Node getHead() {
    return head;
  }
  
  //push method
  //Adds a Node to the top of the Stack as the new top
  public void push(String dataInput) {
    //Case 1: if the Stack is empty (head = null)
    //Inserts the new Node at head
    if(this.head == null) {
      //Add the Node as the head
      this.head = new Node(dataInput);
    }
    else{
      Node n = new Node(dataInput);
      n.setNext(head);
      this.head = n;
    }
  }
  //pop method
  //Returns a Node from the top of the Stack, then removes it from the Stack
  public Node pop() {
    Node t = this.head;
    this.head = head.getNext();
    t.setNext(null);
    return(t);
  }
  //peek method
  //Returns a Node from the top of the Stack
  public Node peek() {
    return this.head;
  }
  
  //deleteStack method
  //Removes references to the Stack, deleting the Stack
  public void deleteStack() {
    //Makes head null
    this.head = null;
    //Print success
    System.out.println("The Stack has been deleted");
  }
}