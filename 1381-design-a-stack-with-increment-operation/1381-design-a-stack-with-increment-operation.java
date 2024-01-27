// code by- SATYARTH 
// upvote if u like my code
class CustomStack {
    int stackArray[];   // stack using array
    int top;            // top pointer

    public CustomStack(int maxSize) { // constructor will help to initialize the array and top pointer
        stackArray=new int[maxSize];
        
        top=-1;         // as index starts from 0, so we will point the stackArray from -1
    }
    
    public void push(int x) {
        // overflow condition : means u can't add more elements to it 
        if(top == (stackArray.length-1)){
            return; 
        }
        
       else{
           top+=1;   // each time we have to update the pointer to add the element at the top
           stackArray[top]=x;  // add the element at the top 
       }
        
        
    }
    
    public int pop() { 
        // underflow condition : means stack is empty 
        if(top== -1){
            return -1;
        }
        
        int del=stackArray[top]; // storing the top value of stack 
        
        top--; // reducing the top pointer to next top element after deletion 
        
        return del;     
        
    }
    
    public void increment(int k, int val) {
        
     // the following block can be optimised :- but its simple to understand and my code works with stack property,not with array operations i.e.  top to bottom 
        
        // first check :if k is greater the stack size 
        if((top+1)<k ){
            int temp=top;  // storing top in temporary variable so that top won't be affected
            while(temp!=-1){
                stackArray[temp]+=val;
                temp--;
            }
            
        }
        // second : if stack size is greater than k
        else{
            
            int temp=top -((top+1)-k);  
            //ex:- stack size = 5 then top = 4 and let k=3 then elements to be increased from index 2 to 0
            // temp = 4 - ((4+1)-3) = 4-2=2 , see we reached at 2 , now decrease temp and update the value 
            
            while(temp!=-1){
                stackArray[temp]+=val;
                temp--;
            }
        }
        
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */