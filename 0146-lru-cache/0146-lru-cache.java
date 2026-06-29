class LRUCache {
    HashMap<Integer,Node> map=new HashMap<>();
    int c;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        c=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
           Node n=map.get(key);
           remove(n);
           addToFront(n);
           return n.value;

        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            addToFront(node);
        }else{
            Node node = new Node(key, value);
            map.put(key, node);
            addToFront(node);

            if(map.size() > c){
                Node temp = tail.prev;
                map.remove(temp.key);
                remove(temp);
            }
        }
        
    }
    void remove(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    void addToFront(Node node){
        Node temp = head.next;
        head.next = node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;
    }
}
class Node{
    int key;
    int value;

    Node next;
    Node prev;

    Node(int key, int value){
        this.key=key;
        this.value=value;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */