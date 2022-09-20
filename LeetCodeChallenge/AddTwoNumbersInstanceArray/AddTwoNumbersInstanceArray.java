public class AddTwoNumbersInstanceArray {

	public static ListNode addTwoNumber(ListNode l1, ListNode l2){
		int result = 0;
		int carry = 0;
		ListNode total = new ListNode(0);
		


		result = l1.num + l2.num ;
		total.num = result;
		total.next = new ListNode(0);

		return total;
	}
}

// Problem issue
class ListNode {

	int num;
	ListNode next;
	// Default 
	ListNode() {}
	// For result
	ListNode(int num) {
		this.num = num;
	}
	// invoke recursive number in object 
	ListNode(int num, ListNode next) {
		this.num = num;
		this.next = next;
	}
}

// Testing Step 
// ListNode test = new ListNode();
// test.num that num will be 0;
// test.next that next will be null;

// ListNode test = new ListNode(2, new ListNode());
// test.num  will be num = 2
// test.next will not be num
// test.next.next will be num