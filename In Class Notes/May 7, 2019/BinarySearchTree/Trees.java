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
public class Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree<String> myTree = new Tree();
        myTree.add("Hello");
        myTree.add("There");
        myTree.add("We");
        myTree.add("Meet");
        myTree.add("At");
        myTree.add("Last");
        myTree.add("General");
        myTree.add("Kenobi");
        myTree.printInOrder(myTree.root);
    }
    
}
