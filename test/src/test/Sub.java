package test;

public class Sub extends Base {
	public static void main(String[] args) {
		Sub a=new Sub();
		Base b=new Base();
		System.out.println(a.a);
		Base.a=6;
	}
}
