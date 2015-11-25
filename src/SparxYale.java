
class SparxYale
{
	public static void main (String[] args)
	{
		
		int [][]matrix=new int[4][5];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				int r = (int) (Math.random() * (500 - 1)) + 1;
				matrix[i][j]=r;
				j++;
				if(j!=5)
					matrix[i][j]=0;
			}
		}
		
		
		 
		//int [][]matrix={ {0,1,2,0,0} ,{5,0,8,3,0} ,{4,0,7,0,6} ,{0,0,10,9,0} };
		
		
		int cols=matrix[0].length;
		int rows=matrix.length;
		System.out.print("\nRows are := "+rows+"\nAnd Columns are := "+cols);
		int nonzero=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix[i][j]!=0)
					nonzero++;
			}
		}
		int []A=new int[nonzero];
		int []IA=new int[rows+1];
		int []JA=new int[nonzero];
		int index=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix[i][j]!=0)
				{
					A[index]=matrix[i][j];
					index++;
				}
			}
		}
		
		index=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix[i][j]!=0)
				{
					JA[index]=j;
					index++;
				}
			}
		}
		
		IA[rows]=nonzero;
		
		index=0;
		int ii;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix[i][j]!=0)
				{
					
					for(ii=0;ii<A.length;ii++)
					{
						if(matrix[i][j]==A[ii])
							break;
					}
					IA[index]=ii;
					index++;
					break;
				}
			}
		}
		
		System.out.print("\nMatrix is \n");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("    "+matrix[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.print("\n\nA Array is :\n");
		for(int i=0;i<A.length;i++)
			System.out.print("  "+A[i]);
			
		System.out.print("\n\nIA Array is :\n");
		for(int i=0;i<IA.length;i++)
			System.out.print("  "+IA[i]);	
				
		System.out.print("\n\nJA Array is :\n");
		for(int i=0;i<JA.length;i++)
			System.out.print("  "+JA[i]);		
			
			
	}
}