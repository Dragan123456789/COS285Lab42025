package lab4;

import java.util.*;

/**Creates a MyBinaryTree object that stores unsorted nodes in a binary tree.
 * @param <E> the data type of the elements in the tree
 * @author Abby Pitcairn
 * @version October 18, 2025
 */
public class MyBinaryTree<E extends Comparable<E>> {
    
    /**Root Node of the tree*/
    protected Node<E> root;
    
    /**Nested class for a Node object
     * @param <E> the data type of the element in the node
     */
    protected static class Node<E>{
        E data;
        Node<E> left;
        Node<E> right;
        
        Node(E data){
            this.data = data;
        }
    }
    
    /**Recursively searches for the next available insertion spot
     * and inserts a new node with the given value to that space
     * in the tree.
     * @param value - the value to insert into the tree.
     */
    public void insert(E value) {
        root = insertRecursively(root, value);
    }

    /** Recursive helper for insertion.
     * @param current - the current Node being evaluated.
     * @param value - the value to insert into the tree.
     */
    private Node<E> insertRecursively(Node<E> current, E value) {
        if (current == null) {
            return new Node<>(value);
        }
        if (value.compareTo(current.data) < 0) {
            current.left = insertRecursively(current.left, value);
        } else if (value.compareTo(current.data) > 0) {
            current.right = insertRecursively(current.right, value);
        }
        return current;
    }
    
    /** Helper function to quickly build a tree from a List of elements.
     * @param elements - a List of data type E to be added to the tree.
     */
    public void buildTree(List<E> elements) {
        for (E element : elements) {
            insert(element);
        }
    }
}
