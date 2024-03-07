package Array;

public class CheckBreakStatement {

	static void checkStatement() {
		
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]==3) {
					System.out.println(i);
					System.out.println(j);
					break;
				}
			}
		}
	}
}
