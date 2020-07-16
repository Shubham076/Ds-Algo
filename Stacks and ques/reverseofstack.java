package stacksandqueues;

public class reverseofstack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stackusingarray stack = new stackusingarray(5);

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}
		stack.display();

		stackusingarray helper = new stackusingarray(5);

		reversestack(stack, helper, 0);
		System.out.println();
		stack.display();
	}

	public static void reversestack(stackusingarray stack, stackusingarray helper, int index) throws Exception {
		if (stack.isempty()) {
			return;
		}

			int item = stack.pop();
			reversestack(stack, helper, index + 1);
			helper.push(item);
			if (index == 0) {
				while (!helper.isempty()) {
					stack.push(helper.pop());
				}
			}
		}
}
	

