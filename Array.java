package javademo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);

		int empid=Integer.parseInt(args[0]);
		String name=args[1];
		float salary=Float.parseFloat(args[2]);
		
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		*/
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
	}
}



