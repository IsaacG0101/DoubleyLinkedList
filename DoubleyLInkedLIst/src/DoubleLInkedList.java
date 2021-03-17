import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLInkedList implements Deque {
	private int size;
	private Node front;
	private Node rear;
	
	
	
	public DoubleLInkedList() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "DoubleLInkedList [size=" + size + ", front=" + front + ", rear=" + rear + "]";
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addFirst(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerFirst(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeLastOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public int size(String x) {
		// TODO Auto-generated method stub
		return x.length();
	}
	
	public String addFront(String x) {
		Node NewNode = new Node(x);
		if(isEmpty()) {
			rear = NewNode;
		}
		else {
			front.previous = NewNode;
		}
		NewNode.next = front;
		front = NewNode;
		size++;
		return x;
	}
	public Node removeRear() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Node temp = rear;
		if(front == rear) {
			front = null;
		}
		else {
			rear.previous.next = null;
			
		}
		rear = rear.previous;
		temp.previous = null;
		size--;
		return temp;
	}
	
	public String addRear(String x) {
		Node NewNode = new Node(x);
		if(isEmpty()) {
			front = NewNode;
		}
		else {
			rear.next = NewNode;
			NewNode.previous = rear;
		}
		rear = NewNode;
		size++;
		return x;
	}
	
	public Node removeFront() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Node temp = front;
		if(front == rear) {
			rear = null;
		}
		else {
			front.next.previous =null;
		}
		front= front.next;
		temp.next = null;
		size--;
		return temp;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
