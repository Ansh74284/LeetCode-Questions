class MyHashMap {
    int l[];

    public MyHashMap() {
        l = new int[100000];
    }
    
    public void put(int key, int value) {
        l[key] = value + 1;
    }
    
    public int get(int key) {
        return l[key] - 1;
    }
    
    public void remove(int key) {
        l[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */