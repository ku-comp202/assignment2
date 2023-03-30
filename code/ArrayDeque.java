package code;

/* 
 * ASSIGNMENT 2
 * AUTHOR:  <Insert Student Name>
 * Class : ArrayDeque
 *
 * You are not allowed to use Java containers!
 * You must implement the Array Deque yourself
 *
 * MODIFY 
 * 
 * */

import given.iDeque;
import java.util.Arrays;
import java.util.Iterator;

import given.Util;


/*
 * You must have a circular implementation. 
 * 
 * WARNING: Modulo operator (%) might create issues with negative numbers.
 * Use Math.floorMod instead if you are having issues
 */
public class ArrayDeque<E> implements iDeque<E> {

  private E[] A; //Do not change this name!

  /*
   * ADD FIELDS IF NEEDED
   */
	
	public ArrayDeque() {
		this(1000);
    /*
     * ADD CODE IF NEEDED
     */
	}
	
	public ArrayDeque(int initialCapacity) {
	   if(initialCapacity < 1)
	      throw new IllegalArgumentException();
		A = createNewArrayWithSize(initialCapacity);
		
		/*
		 * ADD CODE IF NEEDED
		 */
	}
	
	// This is given to you for your convenience since creating arrays of generics is not straightforward in Java
	@SuppressWarnings({"unchecked" })
  private E[] createNewArrayWithSize(int size) {
	  return (E[]) new Object[size];
	}
	
	//Modify this such that the dequeue prints from front to back!
	//Hint, after you implement the iterator, use that!
  public String toString() {
    
    /*
     * MODIFY THE BELOW CODE
     */
    
    StringBuilder sb = new StringBuilder(1000);
    sb.append("[");
    Iterator<E> iter = Arrays.asList(A).iterator();
    while(iter.hasNext()) {
      E e = iter.next();
      if(e == null)
        continue;
      sb.append(e);
      if(!iter.hasNext())
        sb.append("]");
      else
        sb.append(", ");
    }
    return sb.toString();
  }
	
  /*
   * ADD METHODS IF NEEDED
   */

  /*
   * Below are the interface methods to be overriden
   */
	
  @Override
  public int size() {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
    return 0;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
    return false;
  }

  @Override
  public void addFront(E o) {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
  }

  @Override
  public E removeFront() {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
    return null;
  }

  @Override
  public E front() {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
    return null;
  }

  @Override
  public void addBehind(E o) {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
  }

  @Override
  public E removeBehind() {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
    return null;
  }

  @Override
  public E behind() {
    // TODO Auto-generated method stub
    Util.NotImplementedYetSoft();
    return null;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    
  }
  
  //Must print from front to back
  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    //Hint: Fill in the ArrayDequeIterator given below and return a new instance of it
    return null;
  }
  
  private final class ArrayDequeIterator implements Iterator<E> {
    
    /*
     * 
     * ADD A CONSTRUCTOR IF NEEDED
     * Note that you can freely access everything about the outer class!
     * 
     */

    @Override
    public boolean hasNext() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public E next() {
      // TODO Auto-generated method stub
      return null;
    }        
  }
}
