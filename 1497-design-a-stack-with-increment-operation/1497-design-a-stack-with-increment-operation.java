class CustomStack {
    int top, capacity, arr[];

    public CustomStack(int maxSize) {
        capacity = maxSize;
        top = -1;
        arr = new int[capacity];
    }
    
    public void push(int x) {
        if(top==capacity-1)
            return;
        top++;
        arr[top] = x;
    }
    
    public int pop() {
        if(top==-1)
            return -1;
        int res = arr[top--];
        return res;
    }
    
    public void increment(int k, int val) {
       int len = Math.min(k, top+1);
       for(int i=0; i<len; i++)
        arr[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */