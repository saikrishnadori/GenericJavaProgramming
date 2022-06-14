package journalDev.Day1.AccessModifiers;

public class TestA {
	public void methodPublic()
	{
		System.out.println("TestA public method");
		
		methodPrivate();
	}
	protected void methodProtected() {
		System.out.println("TestA protected method");
		methodPrivate();
		}
	void methodDefault() {
		System.out.println("TestA default method");
		methodPrivate();
	}
	private void methodPrivate() {
		System.out.println("TestA private method");
	}
}
