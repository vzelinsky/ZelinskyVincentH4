/* Main.java(H4)
 * Written by Vincent Zelinsky
 * 
 * Contains the methods to test Stack.java and Queue.java
 */
public class Main {
  public static void main(String[] args) {
    Stack myStack = new Stack();
    myStack.push("Alpha");
    myStack.push("Bravo");
    myStack.push("Delta");
    myStack.push("Echo");
    myStack.push("Charlie");
    myStack.push("Foxtrot");
    
    System.out.println(myStack.pop().getData());
    System.out.println(myStack.pop().getData());
    System.out.println(myStack.peek().getData());
    System.out.println(myStack.pop().getData());
  }
}