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
    
    System.out.println("------------------------");
    
    Queue myQueue = new Queue();
    myQueue.enqueue("Alpha");
    myQueue.enqueue("Bravo");
    myQueue.enqueue("Delta");
    myQueue.enqueue("Echo");
    myQueue.enqueue("Charlie");
    myQueue.enqueue("Foxtrot");
    
    System.out.println(myQueue.dequeue().getData());
    System.out.println(myQueue.dequeue().getData());
    System.out.println(myQueue.peek().getData());
    System.out.println(myQueue.dequeue().getData());
    
    System.out.println("------------------------");
    
    Queue myStacktoQueue = new Queue();
    stack2queue(myStack,myStacktoQueue);
    System.out.println(myStacktoQueue.dequeue().getData());
    System.out.println(myStacktoQueue.peek().getData());
    
    System.out.println("------------------------");
    
    Stack myQueuetoStack = new Stack();
    queue2stack(myQueue,myQueuetoStack);
    System.out.println(myQueuetoStack.pop().getData());
    System.out.println(myQueuetoStack.peek().getData());
  }
  public static void stack2queue(Stack stackInput, Queue queueInput) {
    if (stackInput.peek() == null)
      System.out.println("Stack is empty");
    else {
      while (stackInput.peek() != null){
        queueInput.enqueue(stackInput.pop().getData());
      }
      System.out.println("Stack to Queue transfer complete");
    }
  }
  public static void queue2stack(Queue queueInput, Stack stackInput) {
    List newList = new List();
    if (queueInput.peek() == null)
      System.out.println("Queue is empty");
    else {
      while (queueInput.peek() != null){
        newList.addNode(queueInput.dequeue().getData());
      }
      while (newList.getHead() != null){
        stackInput.push(newList.getTail().getData());
        newList.deleteTail();
      }
      System.out.println("Stack to Queue transfer complete");
    }
  }
}