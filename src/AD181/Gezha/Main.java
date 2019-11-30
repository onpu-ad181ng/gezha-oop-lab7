package AD181.Gezha;

import SomeOtherPerson.NewJFrame;

public class Main {
    public static void main(String[] args) {
	      try {
	          NewJFrame frame = new NewJFrame();
	          frame.main(args);
        } catch(Exception e) {
	          System.out.println("Error: " + e.getMessage());
        }
    }
}
