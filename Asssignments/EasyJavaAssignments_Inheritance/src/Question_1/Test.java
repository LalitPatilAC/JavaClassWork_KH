package Question_1;

public class Test {

	public static void main(String[] args) {
		
		Parent parentObj = new Parent();
        System.out.print("1. ");
        parentObj.printParent();

        Child childObj = new Child();
        System.out.print("2. ");
        childObj.printChild();

        System.out.print("3. ");
        childObj.printParent();

	}

}
