abstract class AbstractCheck{
	public int variableOne = 6;
	public String str = "Very Good";
	public void CompletedMethod() {
		int values = 100;
		System.out.println(values);
	}
	public abstract void inCompleteMethod();
	public abstract int inCompleteMethod2();
}

abstract class Abstract2{}

abstract class CheckExample extends AbstractCheck{}  		
public class Assignment2Q4 extends AbstractCheck {

	public static void main(String[] args) {

	}

	public void inCompleteMethod() {
		
	}

	public int inCompleteMethod2() {
		return 0;
	}

}