package behavioral.chainofresponsibility;

public abstract class CafeVisitor {
	protected String priority;
	protected CafeVisitor next;

	public void setNext(CafeVisitor next) {
		this.next = next;
	}

	public void getFood(String food) {
		if (this.priority.equals(food)) {
			eatFood();
		} else {
			if (this.next != null) {
				next.getFood(food);
			}
		}
	}

	protected abstract void eatFood();
}
