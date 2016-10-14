package utilities;

import java.util.Iterator;
import java.util.ListIterator;
/**
 * DoublyLinkedList to store objects and have them linked to each other in a list.
 * 
 * @author Taylor Doud
 *
 * @param <Element> Iterables Object.
 */
public class DoublyLinkedList<Element> implements Iterable<Element> {

	private int n;	// Number of elements in linked list 
	private Node pre; // Previous Node container
	private Node post; // Next Node container
	
	
/**
 * Constructor for the DoublyLinkedList.
 * 
 */
	public DoublyLinkedList(){
		pre = new Node();
		post = new Node();
		pre.next = post;
		post.prev = pre;
	}
	/**
	 * Nested Node container class which will hold an object when its placed into
	 * the list.
	 */
	private class Node{
		
        private Element element;  //Object to be held.
        private Node next;	// Next Node pointer
        private Node prev; // Previous Node pointer
        
        /**
         * method that returns a string value of the element inside the node.
         */
        public String toString(){
        	StringBuilder s = new StringBuilder();
        	s.append(element);
			return s.toString();
        }
    }

	/**
	 * 
	 */
	@Override
	public ListIterator<Element> iterator(){
		return new LinkedlistIterator();
	}
	
	public void add(Element element){
		Node prev = post.prev;
		Node newNode = new Node();
		newNode.element = element;
		newNode.next = post;
		newNode.prev = prev;
		post.prev = newNode;
		prev.next = newNode;
		n++;
	}
	
	public boolean isEmpty(){
		if(n == 0)
			return true;
		else
			return false;
	}
	
	public int size(){
		return n;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(Element element : this){
			s.append(element + " ");
		}
		return s.toString();
	}
	
	private class LinkedlistIterator implements ListIterator<Element>{

		@Override
		public void add(Element element) {
			Node prev = post.prev;
			Node newNode = new Node();
			newNode.element = element;
			newNode.next = post;
			newNode.prev = prev;
			post.prev = newNode;
			prev.next = newNode;
			n++;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Element next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Element previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void set(Element arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
}
