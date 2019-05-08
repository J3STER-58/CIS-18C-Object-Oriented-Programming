package trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ncc
 */
public class Tree<T extends Comparable> {
    TreeNode<T> root;
    public void add(T data) {
        if (root == null){
            root = new TreeNode();
            root.data = data;
        } else {
            root.add(data);
        }
    }
    
    public TreeNode search(TreeNode n, T termToSearch) {
        // if node is null, return null
        // if termToSearch is in n, return n
        // if termToSearch is less than value at n, search left
        // if termToSearch is greater than value at n, search right
        
        if (n == null) {
            System.out.println("No nodes in tree\n\n");
        } else if (termToSearch.compareTo(n.data) < 0) {
            search(n.left, termToSearch);
        } else if (termToSearch.compareTo(n.data) > 0) {
            search (n.right, termToSearch);
        } else {
            System.out.println("Item is not in tree");
        }
        return n;
        
    }
    
    // prints all of the node of the tree using in-order traversal
    public void printInOrder(TreeNode n) {
        if (n == null) {
            return;
        }
        // go down the left until you get to the end
        printInOrder(n.left);
        // output yourself
        System.out.println(n);
        // go down the right until you reach the end
        printInOrder(n.right);
        
    }
    
//    @Override
//    public String toString() {
//        // do in-order traversal and print it out.
//    }
}
