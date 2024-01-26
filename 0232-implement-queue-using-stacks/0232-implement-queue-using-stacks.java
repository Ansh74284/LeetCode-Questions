class MyQueue {
    Stack <Integer> input = new Stack<>();
    Stack <Integer> output = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(input.isEmpty()==false){

                output.push(input.pop());

            }

 

            input.push(x);

 

            while(output.isEmpty()==false){

                input.push(output.pop());

            }

        
    }
    
    public int pop() {
        if(input.isEmpty()) return -1;
        return input.pop();
        
    }
    
    public int peek() {
        if(input.isEmpty()) return -1;
        return input.peek();
    }
    
    public boolean empty() {
        if(input.isEmpty()) return true;
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */