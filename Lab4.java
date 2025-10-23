package lab4;

import java.util.*;
import java.io.*;

/**Demonstrate the binary tree and its methods
 * @author Abby Pitcairn
 * @version October 18, 2025
 */
public class Lab4 {
    
    /**Main method to run Lab 4. 
     * @param args - not applicable.
     */
    public static void main(String[] args) {
        
        // Create list of Integers from data file.
        List<Integer> data = loadNumbersFromFile(args[0]);

        // Create a new empty MyBinaryTree.
        MyBinaryTree<Integer> tree = new MyBinaryTree<>();
        
        // Add the data to the tree.
        tree.buildTree(data);

    }

    /**Create a List of Integers from a given filepath with data
     * separated by new lines. 
     * @param filename - the path to the file
     * @return a List of Integers read from the file
     */
    public static List<Integer> loadNumbersFromFile(String filename) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
            numbers.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return numbers;
    }

}
