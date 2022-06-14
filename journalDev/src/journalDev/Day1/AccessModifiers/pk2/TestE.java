package journalDev.Day1.AccessModifiers.pk2;

import journalDev.Day1.AccessModifiers.TestB;

public class TestE extends TestB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestB().methodPublic();
//		new TestB().methodProtected();

		
	 new TestE().methodProtected();
	}
	
	protected void methodProtected() {
		System.out.println("TestE methodProtected");
		
	}

}
