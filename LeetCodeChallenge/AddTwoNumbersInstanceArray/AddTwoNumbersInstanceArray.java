/* Look And Learn From ==> rois28 

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

 

Constraints:

    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.




*/
public class AddTwoNumbersInstanceArray {

	public static ListNode addTwoNumber(ListNode l1, ListNode l2){
//		int result = 0;
		int carry = 0;
		ListNode total = new ListNode(0);
		ListNode sensor = total;
		
		while(l1 != null || l2 != null || carry !=0) {
		//	carry = 0;
			int result = carry ;

			if(l1 != null) {
				result += l1.num;
				l1 = l1.next ;		
			}

			if(l2 != null) {
				result += l2.num;
				l2 = l2.next ;
			}

			if(result >= 10) {
				
				sensor.num = result - 10;
				carry ++;	
//				result = carry;		
			} else {
				carry = 0;
				sensor.num = result ;
			}

			
			if(l1 != null || l2 != null || carry != 0) {

//				sensor.num = result;
				sensor.next = new ListNode();
				sensor = sensor.next ;
//				result = 0;


			}	

		
		}

//		total.num = result;
//				total.num = result;
//				total.next = new ListNode(0);
//				total = total.next ;

/*		result = l1.num + l2.num ;
		total.num = result;
		total.next = new ListNode(0);
*/
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


