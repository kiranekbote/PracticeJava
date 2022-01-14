
public class Practice {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		String str1 = "hai";
		
	//	System.out.println(str.hashCode());
		
		str = "Hello";
		
	//	System.out.println(str.hashCode());
		
		String obj = new String();
		
		System.out.println(obj.hashCode());
		
		String obj1 = new String();

		System.out.println(obj.hashCode()+"===>"+obj1.hashCode());

	}

}
