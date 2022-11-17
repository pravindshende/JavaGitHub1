package Pattern_Type;

public class Half_Pyramid {
	static void pattern(int n) {
		for(int i=1; i<=n; i++)            
		//for(int i=n; i>=1; --i)      // This For loop is for "Inverted" (Reverse) Half Pyramid.
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
				//System.out.print(j+" ");  // This S.O.P. for print the "Number" Format.
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);
		pattern(6);
	}
}
