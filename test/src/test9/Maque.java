package test9;

class Animal{
	public int i;
	public Animal(){
		i++;
		System.out.println("this is Animal");
	}
}
class Bird extends Animal{
	public Bird(){
		System.out.println("this is Bird");
	}
}
public class Maque extends Bird{
	public Maque(){
		System.out.println("this is a Maque");
	}
	public static void main(String[] args) {
		Maque m = new Maque();
		System.out.println(m.i);
	}
	
}
