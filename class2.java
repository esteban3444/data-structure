
public class class2 {
	public static void A(int n) {
		// TODO Auto-generated method stub
				if(n>0) {
					
					System.out.println(""+n);
						A(n-1);
					}
	}
	public static void main(String[] args) {
		A(3);
	}
}
