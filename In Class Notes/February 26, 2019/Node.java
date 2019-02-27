package icw_022619_highscorelist;

public class Node {
    Integer data = null;
    Node next = null;  // Node* next;
    Node prev = null;
    
    public Node(Integer data) {
        this.data = data;
    }
    
    public Node retrieve(Integer index) {
        if (index != 0) {
            return this.next.retrieve(--index);
        } else {
            return this;
        }
    }
    
    public void add(Node nodeToAdd) {
        if (this.next == null) {
            this.next = nodeToAdd;
        } else {
            this.next.add(nodeToAdd);
    }
        }
    
    // Remove a node from the end
    public void remove() {
        if (this.next == null) {
            // I'm in a single-node linked list
            // Delete me...
//            throw new Exception("Cannot remove from single-node linked list");
        System.out.println("Nope.");
        } else if(this.next.next == null) {
            // We know the next node is the tail
            // Cut it off
            this.next = null;
        } else {
            // The next one is the tail the tail
            this.next.remove();
        }
    }
    
    public Node search(Integer intToFind) {
        if(this.data == intToFind) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.search(intToFind);
        }
    }
}
