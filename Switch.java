package locator;

public class Switch {

	public static void main(String[] args) {
		int i=20;
		switch(i/2)
		{case 1:
				System.out.println("Case 1:Value is"+i);
			break;
		case 2:
			System.out.println("Case 2:Value is"+i);
			break;
		case 3:
			System.out.println("Case 3:Value is"+i);
			default:
				System.out.println("Default: value"+i);
		}

	}

}
