//stack  => A Stack is a linear data structure that follows a particular order in which the operations are performed.
// The order may be LIFO(Last In First Out) or FILO(First In Last Out).
// LIFO implies that the element that is inserted last, comes out first
// and FILO implies that the element that is inserted first, comes out last.

//push o(1) => This method is used to insert an element on the top of the stack.
// Time complexity is O(1) as it takes constant time to insert an element on the top.
// Space complexity is O(n) as it takes n units of space to store n elements.
// st.push(1); // Inserting 1 on the top of the stack
// st.push(2); // Inserting 2 on the top of the stack
// st.push(3); // Inserting 3 on the top of the stack
// st.push(4); // Inserting 4 on the top of the stack

// pop o(1) => This method is used to remove an element from the top of the stack.

// Time complexity is O(1) as it takes constant time to remove an element from the top.

// Space complexity is O(n) as it takes n units of space to store n elements.

// System.out.println(st.pop()); // Removing and printing the top element of the stack

//peek o(1) => This method is used to get the top element of the stack without removing it.

// Time complexity is O(1) as it takes constant time to get the top element.

// Space complexity is O(n) as it takes n units of space to store n elements.

// System.out.println(st.peek()); // Getting and printing the top element of the stack










//stack  => Stack is a linear data structure that follows a particular order in which the operations are performed.

// The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO implies that the element that is inserted last, comes out first and FILO implies that the element that is inserted first, comes out last.

//push o(1) => dalana
// pop o(1) => nikana
//peek o(1) => select karna
package L30Stack;

import java.util.*;

public class Stacks{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
    }
}

