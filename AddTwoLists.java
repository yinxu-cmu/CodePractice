import java.util.Stack;



public class AddTwoLists {
	
	public static void main(String[] args) {
		Node l1 = new Node(null, 3);
		Node l2 = new Node(null, 1);
		l1.setNext(l2);
		Node l3 = new Node(null, 5);
		l2.setNext(l3);
		
		Node m1 = new Node(null, 5);
		Node m2 = new Node(null, 9);
		Node m3 = new Node(null, 2);
		m1.setNext(m2);
		m2.setNext(m3);
		
		int carry = 0;
		Node runL = l1;
		Node runM = m1;
		Stack stack = new Stack();
		while(runL != null && runM != null){
			int op1 = (Integer)runL.getData();
			int op2 = (Integer)runM.getData();
			int result = (op1+op2+carry) % 10;
			if((op1+op2+carry) >= 10)
				carry = 1;
			else
				carry = 0;
				stack.push(result);
				runL = runL.getNext();
				runM = runM.getNext();
		}
		while(runL != null){
			stack.push(runL.getData());
			runL = runL.getNext();
		}
		while(runM != null){
			stack.push(runM.getData());
			runL = runL.getNext();
		}
		Node head = new Node(null, stack.pop());
		Node current = head;
		while(!stack.isEmpty()){
			Node next = new Node(null, stack.pop());
			current.setNext(next);
			current = next;
		}
		
		/* test */
		Node test = head;
		while(test != null){
			System.out.println(test.getData());
			test = test.getNext();
		}
	}
}
