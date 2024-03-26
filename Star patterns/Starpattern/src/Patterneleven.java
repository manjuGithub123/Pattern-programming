
public class Patterneleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(int i=1;i<=5;i++)//to print rows
 {
	 for(int j=1;j<=5-i+1;j++)//to print  num 0f spaces for every rows
	 {
		 System.out.print(" ");
	 }
	 for(int j=1;j<=i*2-1;j++)//to print i num of stars for every row
	 {
		 System.out.print("*");
	 }
	 System.out.println();
 }
	}

}
