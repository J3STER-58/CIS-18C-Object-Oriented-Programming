/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author ncc
 */
public class TreeNode<T extends Comparable> {
    TreeNode<T> left;
    TreeNode<T> right;
    TreeNode<T> parent;
    T data;
    
    public void add(T data){
        if (data.compareTo(this.data) < 0) {
            // check left side
            if (left == null) {
                // add a new tree node to the left
                left =  new TreeNode<T>();
                // add the data to that new tree node
                left.data = data;
                left.parent = this;
                
            } else {
                left.add(data);
            }
        } else {
            // check right side
            if (right == null) {
                // add a new tree node to the right
                right = new TreeNode<T>();
                // add the data to that new tree node
                right.data = data;
                right.parent = this;
            } else {
                right.add(data);
            }
        }
    }
    
    @Override
    public String toString(){
        return data.toString();
    }
}
