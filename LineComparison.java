import java.util.*;

public class LineComparison{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of line : "+length1);

		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		double length2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		
		if(length1 == length2){
			System.out.println("Two lines are equal");
		}else{
			System.out.println("Two lines are not equal");
		}

		int ans = Double.compare(length1,length2);
		if(ans == 0){
			System.out.println("Two lines are equal");
		}
		else if(ans<0){
			System.out.println("Line2 is greater");
		}
		else{
			System.out.println("Line1 is greater");
		}
		
	}
}