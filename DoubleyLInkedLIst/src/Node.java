public class Node {
        @Override
	public String toString() {
        	String nextValue = next == null ? "None" : next.value;
        	String previousValue = previous == null ? "None" : previous.value;
		return "Node [value=" + value + ", next=" + nextValue + ", previous=" + previousValue + "]";
	}

		String value;   
        Node next;      
        Node previous;
	
	
        
        /**
           Constructor.            
           @param val The element to store in the node.
           @param n The reference to the successor node.
        */
        
        Node(String val, Node n)
        {
            value = val;
            next = n;
        } 
        
        /**
           Constructor. 
           @param val The element to store in the node.
        */
        
        Node(String val)
        {
           // Call the other (sister) constructor.
           this(val, null);            
        }
    }	
