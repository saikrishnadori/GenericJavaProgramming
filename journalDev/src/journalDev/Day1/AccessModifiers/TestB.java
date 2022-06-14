package journalDev.Day1.AccessModifiers;

public class TestB {
	public static void main(String args[]) {
		new TestA().methodPublic();
		new TestA().methodProtected();
		new TestA().methodDefault();

	}

	public void methodPublic() {
		System.out.println("TestB public method");
	}

	protected void methodProtected() {
		System.out.println("TestB protected method");

	}

	void methodDefault() {
		System.out.println("TestB default method");

	}

	private void methodPrivate() {
		System.out.println("TestB private method");
	}


}
