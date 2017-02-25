package SingletonPattern;

public class App {
	public static void main(String[] args) {
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		System.out.println(user1 == user2);
	}
}
