import java.util.Scanner;

public class Rotation {
		static int d;
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a = new int[5];
			int[] n = new int[5];
			System.out.println("Enter the number of elements of array: ");
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i<5; i++)
			{
				a[i] = sc.nextInt();
			}
			for(int k = 0; k<5; k++)
			{
				n[k]= a[k];
			}
			
			System.out.println("How many rotation: ");
			d = sc.nextInt();
			int count = d;
			for(int j = 0 ; j<a.length ; j++)
			{
				if(j==a.length-d)
				{
					count=0;
				}
				
				if(n[count]!=-1)
				{
					a[j] = n[count];
					n[count] = -1;
					count++;
					
				}
				
			}
			System.out.print("[");
			for(int k = 0; k<5; k++)
			{
				System.out.print(a[k]);
				if(k<=3)
					System.out.print(", ");
			}
				
			System.out.println("]");
		}

	}
