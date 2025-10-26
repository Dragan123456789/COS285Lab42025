<<<<<<< HEAD
package src;
=======
package lab4;
>>>>>>> 38bd188cdf2d5cbb51f96c7e867cf2ac5823b75c

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
<<<<<<< HEAD
    
    /** Print the tree
     * @author Lucas Haskell
     */
    public void bfsPrintTree() {
    	if (root == null) {
    		return;
    	}
    		
    	Queue<Node<E>> q = new ArrayDeque<Node<E>>();
    	q.add(root);
    	while (!q.isEmpty()) {
    		Node<E> node = q.remove();
    		System.out.print(node.data + " ");
    		if (node.left != null) {
    			q.add(node.left);
    		}
    		if (node.right != null) {
    			q.add(node.right);
    		}
    	}
    	System.out.println();
    }
    
    /** search the tree
     * @author Lucas Haskell
     */
    public void bfsSearchTree() {
    	if (root == null)
    		return;
    	Queue<Node<E>> q = new ArrayDeque<Node<E>>();
    	q.add(root);
    	while (!q.isEmpty()) {
    		Node<E> node = q.remove();
    		System.out.print(node.data + " ");
    		if (node.left != null)
    			q.add(node.left);
    		if (node.right != null)
    			q.add(node.right);
    	}
    	System.out.println();
    }
    
    /**Recursively searches for the target
     * @param target - the item to search for
     */
    public boolean search(E target) {
        return searchRecursively(root, target);
    }

    /** Recursive helper for search
     * @param current - the current Node being evaluated.
     * @param target  - the value to insert into the tree.
     */
    private boolean searchRecursively(Node<E> current, E target) {
        if (current == null) {
            return false;
        }
        int cmp = target.compareTo(current.data);
        if (cmp == 0) {
            return true;
        } else if (cmp < 0) {
            return searchRecursively(current.left, target);
        } else {
        	return searchRecursively(current.right, target);
        }
    }
=======
>>>>>>> 38bd188cdf2d5cbb51f96c7e867cf2ac5823b75c
}
