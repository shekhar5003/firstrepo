package javademo;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			//args[i]=args[i];
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("sum="+sum);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(args[i]);
		}
		System.out.println("new cahnges to file");
	}
}



