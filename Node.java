/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Calista
 */
public class Node {
   private String words;
   private int frequency;
   private Node leftChild, rightChild;
   
   public Node () 
   {
      frequency = (int)(Math.random() * 25) + 16;
      leftChild = rightChild = null;
   }
   
   public Node(String words)
   {
       setWords(words);
       this.frequency = 1;
   }
   
   public void incrementFrequency()
   {
       frequency++;
   }
   public int getFrequency () {
      return frequency;
   }
   public String getWords()
   {
       return words;
   }
   public Node getLeftChild () {
      return leftChild;
   }
   public Node getRightChild () {
      return rightChild;
   }
   public void setWords(String words)
   {
       this.words = words;
   }
   public void setRightChild (Node n) { 
      rightChild = n;
   }
   public void setLeftChild (Node n) { 
      leftChild = n;
   }   
   
   public String toString () {
      return "Word: " + getWords() + "\n" + "Frequency: " + getFrequency() +"\n";
      
   }
}