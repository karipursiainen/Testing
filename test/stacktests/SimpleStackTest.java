package stacktests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.asm.tree.analysis.Value;

public class SimpleStackTest {

	@Test
	public void testPop() {
		SimpleStack<Integer> testattava = new SimpleStack(Integer.class, (10));
		if (!testattava.isFull()) {
			testattava.push(1);
		}
		if (!testattava.isFull()) {
			testattava.push(2);
		}
		if (!testattava.isFull()) {
			testattava.push(3);
		}
		if (!testattava.isFull()) {
			testattava.push(4);
		} else {
            System.out.println("Stack is full!");
        }
		
		int value = 0;
		while (!testattava.isEmpty()) {
            value = testattava.pop();
            //System.out.print(value + " ");
        }
		
		assertEquals(1,value);
	}
	
		@Test(expected = ArrayIndexOutOfBoundsException.class)
		public void testPopArray() {
			SimpleStack<Integer> testattava = new SimpleStack(Integer.class, (10));
			if (!testattava.isFull()) {
				testattava.push(1);
			}
			if (!testattava.isFull()) {
				testattava.push(2);
			}
			if (!testattava.isFull()) {
				testattava.push(3);
			}
			if (!testattava.isFull()) {
				testattava.push(4);
			} else {
	            System.out.println("Stack is full!");
	        }
			
			int value = 0;
			while (!testattava.isEmpty()) {
	            value = testattava.pop();
	            //System.out.print(value + " ");
	        }
			
			value = testattava.pop();
		
		//fail("Not yet implemented");
		}
	
	@Test
	public void testPeek(){
		SimpleStack<Integer> testattava = new SimpleStack(Integer.class, (10));
		for(int i=0;i<10;i++) {
			testattava.push(i);
		}
		int j = testattava.peek();
		assertEquals(9,j);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testPeekIndexOutOfBoundsHigh() {
		SimpleStack<Integer> testattava = new SimpleStack(Integer.class, (10));
		int arraySize = 10;
		for(int i=0;i <= arraySize; i++) {
			if (!testattava.isFull()) {
				testattava.push(i);
			}
		}
	}
	
	@Test(expected = StackEmptyException.class)
	public void testPopEmpty() throws  StackEmptyException{
		SimpleStack<Integer> testattava = new SimpleStack(Integer.class, (10));
		if (!testattava.isFull()) {
			testattava.push(1);
		}
		if (!testattava.isFull()) {
			testattava.push(2);
		}
		if (!testattava.isFull()) {
			testattava.push(3);
		}
		if (!testattava.isFull()) {
			testattava.push(4);
		} else {
            System.out.println("Stack is full!");
        }
		
		int value = -1;
		while (!testattava.isEmpty()) {
            //value = testattava.pop();
            //System.out.print(value + " ");
        }
		
		value = testattava.pop2();
	
	//fail("Not yet implemented");
	}

}
