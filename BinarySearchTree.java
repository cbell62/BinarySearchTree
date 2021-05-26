
public class BinarySearchTree 
{
    private Node root;
  
    public BinarySearchTree()
    {
        root = null;
    }
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void insert(String words)
    {
    
        if(isEmpty())
        {
            root = new Node(words);
        }
        else
        {
            insert(root, words);
        }
    }
    
    public void insert(Node subRoot, String words)
    {
        if(subRoot.getWords().equals(words))
        {
            subRoot.incrementFrequency();
        }
        else if(subRoot.getWords().compareTo(words)>0)
        {
            if(subRoot.getLeftChild() == null)
            {
                subRoot.setLeftChild(new Node(words));
            }
            else
            {
                insert(subRoot.getLeftChild(), words);
            }
        }
        else
        {
            if(subRoot.getRightChild() == null)
            {
                subRoot.setRightChild(new Node(words));
            }
            else
            {
                insert(subRoot.getRightChild(),words);
            }
        }
    }
   
    public Node search(String words)
    {
      if(isEmpty())return null;
      return search (root, words);
    }
    
    public Node search(Node subRoot, String words)
    {
        if (subRoot.getWords().equals(words))
        {
            return subRoot;
        }
        else if(subRoot.getWords().compareTo(words)>0)
        {
            if (subRoot.getLeftChild () == null) 
            { 
                return null;
            }
            else
            {
                return search (subRoot.getLeftChild(), words);
            }
        }
        else
        {
           if(subRoot.getWords().compareTo(words)<0)
        {
            if (subRoot.getRightChild () == null) 
            { 
                return null;
            }
            else
            {
                return search (subRoot.getRightChild(), words);
            } 
        }
    }
        return subRoot;
        
}
    
    public void printPreOrder()
    {
        System.out.println("Running PreOrder Transversal");
        printPreOrder(root);
    }
    
    public void printPreOrder(Node subRoot )
    {
        if(subRoot == null) return;
        
        
        System.out.println(subRoot.toString());
        
        
        printPreOrder(subRoot.getLeftChild());
        
        
        printPreOrder(subRoot.getRightChild());            
    }
    
    public void printInOrder()
    {
        System.out.println("Running InOrder Transversal");
        printInOrder(root);
    }
    
    public void printInOrder(Node subRoot)
    {
        if(subRoot == null)
        {
            return;
        }
       
        //left subtree
        printInOrder(subRoot.getLeftChild());
        
        //print subroot
        System.out.println(subRoot.toString());
        
        //right subtree
        printInOrder(subRoot.getRightChild()); 
    }
    public void printPostOrder()
    {
        System.out.println("Running PostOrder Transversal");
        printPostOrder(root);
    }
    
    public void printPostOrder(Node subRoot)
    {
        if(subRoot == null)return;
        
        //left subtree
        printPostOrder(subRoot.getLeftChild());
        
        //right subtree
        printPostOrder(subRoot.getRightChild()); 
        
        //print subroot
        System.out.println(subRoot.toString());
        
    }
    
}