
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int count=1;
 for(int i=1;i<=4;i++)
 {
	 for(int j=1;j<=4;j++)
	 {
		 if(count<=9)
		 {System.out.print("0"+count+" ");
		 count+=2;
		 }
	 
		 else
		 {
			 System.out.print(count+" ");
			 count+=2;
		 }}
		 System.out.println();
 }
	}

}
