package com.linkedlist.programs;

public class LinkedList { 
	  
    static Node head;
    static LinkedList list;
  
    static class Node { 
  
        int data; 
        Node next; 
   
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

  

    public static LinkedList insert(int data)  { 

        Node new_node = new Node(data); 
        new_node.next = null; 

        if (head == null) { 
            head = new_node; 
        } 
        else { 
            Node last = head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    } 
    
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) { 
    	
        Node currNode = head; 
        System.out.print("LinkedList: "); 

        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
    } 
    

    static public void segregateOddEven() { 
          
        Node evenStart = null; 
        Node evenEnd = null; 
        Node oddStart = null; 
        Node oddEnd = null; 
        Node currentNode = head; 
          
        while(currentNode != null) { 
            int element = currentNode.data; 
              
            if(element % 2 != 0) { 
                  
                if(oddStart == null) { 
                    oddStart = currentNode; 
                    oddEnd = oddStart; 
                } else { 
                    oddEnd.next = currentNode; 
                    oddEnd = oddEnd.next; 
                } 
                  
            } else { 
                  
                if(evenStart == null) { 
                    evenStart = currentNode; 
                    evenEnd = evenStart; 
                } else { 
                    evenEnd.next = currentNode; 
                    evenEnd = evenEnd.next; 
                } 
            } 
            currentNode = currentNode.next;     
        } 
          
          
        if(oddStart == null || evenStart == null) { 
            return; 
        } 
          
        oddEnd.next = evenStart; 
        evenEnd.next = null; 
        head=oddStart; 
    } 
   

    public static void main(String[] args) { 
    	
        LinkedList list = new LinkedList(); 

        list = insert(1); 
        list = insert(2); 
        list = insert(3); 
        list = insert(4); 
        list = insert(5); 
        list = insert(6); 
        list = insert(7); 
        list = insert(8);
        
        printList(list);
        System.out.println();
        segregateOddEven();
        System.out.println("After segregation");
        printList(list); 

    } 
} 
