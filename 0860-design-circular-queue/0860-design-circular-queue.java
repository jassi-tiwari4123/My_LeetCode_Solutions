class MyCircularQueue {
    private class Node{
        int val;
        Node next;
        Node(int v){
            this.val=v;
        }
    }
    int capacity;
    int size=0;
    Node head;
    Node tail;
    public MyCircularQueue(int k) {
        capacity=k;
        size=0;
        head=null;
        tail=null;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        Node qn=new Node(value);
        if(isEmpty()){
            head=qn;
            tail=qn;
            tail.next=head;
        }
        else{
            tail.next=qn;
            tail=qn;
            tail.next=head;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        Node temp=head.next;
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=temp;
            tail.next=head;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        else{
            return head.val;
        }
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        else{
            return tail.val;
        }
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */