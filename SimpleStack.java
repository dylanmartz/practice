//Dylan Martz
//Tuesday/Thursday 11:00 Lecture
//Tuesday 3:00 Lab

/**
This is a stack data structure generic class that implements SimpleStackInterface
using an array.  The size of the array can be changed based on what the client
wants. It has add, remove, isEmpty, isFull, contains, and size methods.
@author Dylan Martz
*/

public class SimpleStack<T> implements SimpleStackInterface<T>
{
	private int size = 15;
	private int top = -1;
	private T array[] = (T[]) new Object[size];
	
	public SimpleStack()
	{
		
	}
	
	/**
	Adds an item to the stack
	@param item The item to be added
	@return false If the stack is full
	@return true If the item is added
	*/
	public boolean add(T item)
	{
		if(isFull())
		{
			return false; //stack is full
		}
		else
		{
			array[top + 1] = item;
			top++;
			return true;
		}
	}
	
	/**
	Removes an item from the top of the stack
	@return The item that was removed.
	*/
	public T remove()
	{
		if(isEmpty())
		{
			return null; //stack is empty
		}
		int temp = top;
		top--;
		return array[temp];
	}
	
	/**'
	Gets an array of the pre-specified number of 
	items at the top of the stack.
	@param howMany the number of items to return
	@return object The array of items being returned
	*/
	public Object[] topItems(int howMany)
	{
		Object[] object = (T[]) new Object[howMany];
		if(size >= howMany)
		{
			for(int i=0, j= top;j >= 0;i++,j--)
			{
				object[i] = array[j];
			}
		}
		else
		{
			return null;
		}
		return object;
	}
	
	/**
	Determines whether the stack contains an item.
	@return false If the stack does not 
	@return true If the stack does
	*/
	public boolean contains(T item)
	{
		boolean x = false;
		for(int i = top;i >= 0; i--)
		{
			if (item == array[i])
			{
				x = true;
				break;
			}
			else
			{
				x = false;
			}
		}	
		return x;
	}
	
	/**
	Determines if the stack is empty
	@return false if the stack has contents
	@return true if the stack is empty
	*/
	public boolean isEmpty()
	{
		 return top == -1;
	}
	
	/**
	Determines if the stack is full
	@return false if the stack isn't full
	@return true if the stack is full
	*/
	public boolean isFull()
	{
		return (size == top); 
	}
	
	/**
	Gets the size of the stack.
	@return The size of the stack
	*/
	public int size()
	{
		return top + 1;
	}
}