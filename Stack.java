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
    if(head == null) {
      //Add the Node as the head
      head = new Node(dataInput);
    }
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