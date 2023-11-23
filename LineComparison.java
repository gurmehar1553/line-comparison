import java.util.*;



public class LineComparison{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2;
		System.out.println("Input 2 points of first line");

		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		Line l1 = new Line(x1,y1,x2,y2);
		System.out.println("Input 2 points of second line");

		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		Line l2 = new Line(a1,b1,a2,b2);
		
		Line.checkEquality(l1,l2);
		Line.compare(l1,l2);
		
	}
}


class Line{
	
	int x1,y1,x2,y2;

	Line(int x1,int y1,int x2,int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public static double findLength(Line l){
		double length = Math.sqrt(Math.pow(l.x2-l.x1,2) + Math.pow(l.y2-l.y1,2));
		System.out.println("Length of line : "+length);
		return length;
	}

	public static boolean checkEquality(Line l1,Line l2){
		return findLength(l1) == findLength(l2);
	}

	public static void compare(Line l1,Line l2){
		double res = Double.compare(findLength(l1),findLength(l2));
		if(res == 0){
			System.out.println("Two Lines are Equal");
		}
		else if(res > 0){
			System.out.println("Line 1 is greater");
		}
		else{
			System.out.println("Line 2 is greater");
		}
	}
}