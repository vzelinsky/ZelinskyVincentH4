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
    myStack.push("Charlie");
    myStack.push("Delta");
    
    System.out.println("myStack\n");
    System.out.println(myStack.pop().getData());
    System.out.println(myStack.pop().getData());
    System.out.println(myStack.pop().getData());
    System.out.println(myStack.peek().getData());
    System.out.println(myStack.pop().getData());
    
    System.out.println("-------------------------------");
    
    Queue myQueue = new Queue();
    myQueue.enqueue("Alpha");
    myQueue.enqueue("Bravo");
    myQueue.enqueue("Charlie");
    myQueue.enqueue("Delta");
    
    System.out.println("myQueue\n");
    System.out.println(myQueue.dequeue().getData());
    System.out.println(myQueue.dequeue().getData());
    System.out.println(myQueue.dequeue().getData());
    System.out.println(myQueue.peek().getData());
    System.out.println(myQueue.dequeue().getData());
    
    System.out.println("-------------------------------");

    myStack.push("Alpha");
    myStack.push("Bravo");
    myStack.push("Charlie");
    myStack.push("Delta");
    
    Queue myStacktoQueue = new Queue();
    stack2queue(myStack,myStacktoQueue);
    
    System.out.println("\nA queue that prints like myStack\n");
    System.out.println(myStacktoQueue.dequeue().getData());
    System.out.println(myStacktoQueue.dequeue().getData());
    System.out.println(myStacktoQueue.dequeue().getData());
    System.out.println(myStacktoQueue.peek().getData());
    System.out.println(myStacktoQueue.dequeue().getData());
    
    System.out.println("-------------------------------");
    
    myQueue.enqueue("Alpha");
    myQueue.enqueue("Bravo");
    myQueue.enqueue("Charlie");
    myQueue.enqueue("Delta");
    
    Stack myQueuetoStack = new Stack();
    queue2stack(myQueue,myQueuetoStack);
    
    System.out.println("\nA stack that prints like myQueue\n");
    System.out.println(myQueuetoStack.pop().getData());
    System.out.println(myQueuetoStack.pop().getData());
    System.out.println(myQueuetoStack.pop().getData());
    System.out.println(myQueuetoStack.peek().getData());
    System.out.println(myQueuetoStack.pop().getData());
    
    System.out.println("-------------------------------");
    
    myStack.push("Alpha");
    myStack.push("Bravo");
    myStack.push("Charlie");
    myStack.push("Delta");
    
    Stack myStacktoStack = new Stack();
    stack2stack(myStack,myStacktoStack);
    
    System.out.println("\nA stack that prints like myStack\n");
    System.out.println(myStacktoStack.pop().getData());
    System.out.println(myStacktoStack.pop().getData());
    System.out.println(myStacktoStack.pop().getData());
    System.out.println(myStacktoStack.peek().getData());
    System.out.println(myStacktoStack.pop().getData());
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
    Stack tempStack = new Stack();
    if (queueInput.peek() == null)
      System.out.println("Queue is empty");
    else {
      while (queueInput.peek() != null){
        tempStack.push(queueInput.dequeue().getData());
      }
      while (tempStack.peek() != null){
        stackInput.push(tempStack.pop().getData());
      }
      System.out.println("Queue to Stack transfer complete");
    }
  }
  public static void stack2stack(Stack stackInput1, Stack stackInput2) {
    Stack tempStack = new Stack();
    if (stackInput1.peek() == null)
      System.out.println("Stack is empty");
    else {
      while (stackInput1.peek() != null){
        tempStack.push(stackInput1.pop().getData());
      }
      while (tempStack.peek() != null){
        stackInput2.push(tempStack.pop().getData());
      }
      System.out.println("Stack to Stack transfer complete");
    }
  }
}