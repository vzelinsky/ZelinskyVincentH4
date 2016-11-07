/* Main.java(H4)
 * Written by Vincent Zelinsky
 * 
 * Contains the methods to test Stack.java and Queue.java
 */
public class Main {
  public static void main(String[] args) {
    //Creates a Stack called myStack
    Stack myStack = new Stack();
    //Pushes Strings to myStack
    myStack.push("Alpha");
    myStack.push("Bravo");
    myStack.push("Charlie");
    myStack.push("Delta");
    
    //Prints pops of all Nodes of myStack to check outputs
    System.out.println("myStack\n");
    System.out.println(myStack.pop().getData());
    System.out.println(myStack.pop().getData());
    System.out.println(myStack.pop().getData());
    //Prints peek to validate that peek doesn't delete Nodes
    System.out.println(myStack.peek().getData());
    System.out.println(myStack.pop().getData());
    
    System.out.println("-------------------------------");
    
    //Creates a Queue called myQueue
    Queue myQueue = new Queue();
    //Enqueues Strings to myQueue
    myQueue.enqueue("Alpha");
    myQueue.enqueue("Bravo");
    myQueue.enqueue("Charlie");
    myQueue.enqueue("Delta");
    
    //Prints dequeues of all Nodes of myQueue to check outputs
    System.out.println("myQueue\n");
    System.out.println(myQueue.dequeue().getData());
    System.out.println(myQueue.dequeue().getData());
    System.out.println(myQueue.dequeue().getData());
    //Prints peek to validate that peek doesn't delete Nodes
    System.out.println(myQueue.peek().getData());
    System.out.println(myQueue.dequeue().getData());
    
    System.out.println("-------------------------------");
    
    //Pushes the same data to myStack again for testing
    myStack.push("Alpha");
    myStack.push("Bravo");
    myStack.push("Charlie");
    myStack.push("Delta");
    
    //Creates a queue called myStacktoQueue
    Queue myStacktoQueue = new Queue();
    //Calls stack2queue passing myStack as the giving stack and myStacktoQueue as the receiving queue
    stack2queue(myStack,myStacktoQueue);
    
    //Prints dequeues of all Nodes to check outputs with myStack
    System.out.println("\nA queue that prints like myStack\n");
    System.out.println(myStacktoQueue.dequeue().getData());
    System.out.println(myStacktoQueue.dequeue().getData());
    System.out.println(myStacktoQueue.dequeue().getData());
    System.out.println(myStacktoQueue.peek().getData());
    System.out.println(myStacktoQueue.dequeue().getData());
    
    System.out.println("-------------------------------");
    
    //Enqueues the same data to myQueue again for testing
    myQueue.enqueue("Alpha");
    myQueue.enqueue("Bravo");
    myQueue.enqueue("Charlie");
    myQueue.enqueue("Delta");
    
    //Creates a stack called myQueuetoStack
    Stack myQueuetoStack = new Stack();
    //Calls queue2stack passing myQueue as the giving queue and myStacktoQueue as the receiving stack
    queue2stack(myQueue,myQueuetoStack);
    
    //Prints pops of all Nodes to check outputs with myQueue
    System.out.println("\nA stack that prints like myQueue\n");
    System.out.println(myQueuetoStack.pop().getData());
    System.out.println(myQueuetoStack.pop().getData());
    System.out.println(myQueuetoStack.pop().getData());
    System.out.println(myQueuetoStack.peek().getData());
    System.out.println(myQueuetoStack.pop().getData());
    
    System.out.println("-------------------------------");
    
    //Pushes the same data to myStack again for testing
    myStack.push("Alpha");
    myStack.push("Bravo");
    myStack.push("Charlie");
    myStack.push("Delta");
    
    //Creates a stack called myStacktoStack
    Stack myStacktoStack = new Stack();
    //Calls stack2stack passing myStack as the giving stack and myStacktoStack as the receiving stack
    stack2stack(myStack,myStacktoStack);
    
    //Prints pops of all Nodes to check outputs with myStack
    System.out.println("\nA stack that prints like myStack\n");
    System.out.println(myStacktoStack.pop().getData());
    System.out.println(myStacktoStack.pop().getData());
    System.out.println(myStacktoStack.pop().getData());
    System.out.println(myStacktoStack.peek().getData());
    System.out.println(myStacktoStack.pop().getData());
  }
  //Methods
  //stack2queue method
  //Takes the contents of "giving" stack(first argument) and transfers them to a "receiving" queue(second argument)
  //In a way such that the order of the giving stack's outputs are identical to the receiving queue's outputs
  public static void stack2queue(Stack stackInput, Queue queueInput) {
    //if the giving stack is empty
    if (stackInput.peek() == null)
      System.out.println("Stack is empty");
    else {
      //while the giving stack is not empty
      while (stackInput.peek() != null){
        //enqueue the popped Node from giving stack to the receiving queue
        //this reverses the order of the values so the outputs are the same as the giving stack
        queueInput.enqueue(stackInput.pop().getData());
      }
      //Print success
      System.out.println("Stack to Queue transfer complete");
    }
  }
  //queue2stack method
  //Takes the contents of "giving" queue(first argument) and transfers them to a "receiving" stack(second argument)
  //In a way such that the order of the giving queue's outputs are identical to the receiving stack's outputs
  public static void queue2stack(Queue queueInput, Stack stackInput) {
    //Creates an empty temporary stack to hold the data of the "giving" queue
    Stack tempStack = new Stack();
    //if the giving queue is empty
    if (queueInput.peek() == null)
      System.out.println("Queue is empty");
    else {
      //while the giving queue is not empty
      while (queueInput.peek() != null){
        //push the dequeued Node from the giving queue to the temporary stack
        //this reverses the order of the values
        tempStack.push(queueInput.dequeue().getData());
      }
      //while the temporary stack is not empty
      while (tempStack.peek() != null){
        //push the popped Node from the temporary stack to the receiving stack
        //this reverses the order of values again so the outputs are the same as giving queue
        stackInput.push(tempStack.pop().getData());
      }
      //Print success
      System.out.println("Queue to Stack transfer complete");
    }
  }
  //stack2stack method
  //Takes the contents of "giving" stack(first argument) and transfers them to a "receiving" stack(second argument)
  //In a way such that the order of the giving stack's outputs are identical to the receiving stack's outputs
  public static void stack2stack(Stack stackInput1, Stack stackInput2) {
    //Creates an empty temporary stack to hold the data of the "giving" stack
    Stack tempStack = new Stack();
    //if the giving stack is empty
    if (stackInput1.peek() == null)
      System.out.println("Stack is empty");
    else {
      //while the giving stack is not empty
      while (stackInput1.peek() != null){
        //push the popped Node from the giving stack to the temporary stack
        //this reverses the values
        tempStack.push(stackInput1.pop().getData());
      }
      //while the temporary stack is not empty
      while (tempStack.peek() != null){
        //push the popped Node from the temporary stack to the receiving stack
        //this reverses the order of the values again so the outputs are the same as giving stack
        stackInput2.push(tempStack.pop().getData());
      }
      //Print success
      System.out.println("Stack to Stack transfer complete");
    }
  }
}