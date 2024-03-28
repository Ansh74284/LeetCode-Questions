class BrowserHistory {
    node head;
    node tail;
    int size;
    public BrowserHistory(String homepage) {
        node n =new node(homepage);
        head = n;
        tail = n;
        size=1;
    }
    
    public void visit(String url) {
        tail.next =null;
        size=size(head);
        node nd = new node(url);
        tail.next = nd;
        nd.prev = tail;
        tail = tail.next;
        size++;
    }
    
    public String back(int steps) {
        if(steps>=size){
            tail = head;
        return head.data;
        }

        while(steps-->0 && tail.prev!=null){
            tail = tail.prev;
        }

        return tail.data;
    }
    
    public String forward(int steps) {    
        while(steps-->0 && tail.next!=null){
            tail = tail.next;
        }
        return tail.data;
    }
    
    public int size(node head){
        if(head==null)
        return 0;
        node temp = head;
        int s =0;
        while(temp!=null){
            temp = temp.next;
            s++;
        }
        return s;
    }

}

class node{
    node next;
    node prev;
    String data;
    node(String data){
        this.data= data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

 /*this problem is nothing but triversal of DLL
such as -:

FOR creating homepage - we initialize and create a head node , named head (it is fix)

VISIT - keep track of current tail node and add node(URL)accordingly

BACK - if step>size return node and update tail =head else triverse tail to steps and return that node(URL page)

FORWARD - if step>size return tail else triverse upto step and return tail*/
/*Time complexity:
O(N+N)
Space complexity:
O(N)*/