package Allprogram;

class UseofSuper1 {
	public void display() {
		System.out.println(" i love u urvashi");
	}
}

public class UseofSuper extends UseofSuper1 {
	public void display() {
		super.display();
		System.out.println(" i miss u so much");

	}

	public void main(String[] args) {
		// TODO Auto-generated method stub
		UseofSuper obj = new UseofSuper();
		// obj.super.display();
		obj.display();

	}

}
