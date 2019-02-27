package icw_022619_highscorelist;

public class CircularNode {
    Integer data = null;
    CircularNode next = null;  // Node* next;
    CircularNode prev = null;
    
    public CircularNode(Integer data) {
        this.data = data;
    }
    
    public CircularNode retrieve(Integer index, CircularNode head) {
        if (index != 0) {
            return this.next.retrieve(--index, head);
        } else {
            return this;
        }
    }
    
    public void add(CircularNode nodeToAdd, CircularNode head) {
        if (this.next == head) {
            this.next = nodeToAdd;
            nodeToAdd.next = head;
        } else {
            this.next.add(nodeToAdd, head);
        }
    }
    
    // Remove a node from the end
    public void remove(CircularNode head) {
        if(this.next.next == head) {
            // We've found the tail - let's remove it
            this.next = head;
        }
    }
    
    public CircularNode search(Integer intToFind, CircularNode head) {
        if(this.data.equals(intToFind)) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.search(intToFind, head);
        }
    }
}
