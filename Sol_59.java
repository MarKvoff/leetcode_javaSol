package leetcode_sol;

public class Sol_59 {
	
	public static int[][] generateMatrix(int n) {
		
		int count = n - 1, num = 1;
		int[][] res = new int[n][n];
		int x = 0, y = 0;
		
		while (count > 0) {
			
			for (int i = 0; i < count; i++)
				res[x][y++] = num++;
			System.out.println("(" + x + "," + y + ")");
			
			for (int i = 0; i < count; i++)
				res[x++][y] = num++;
			System.out.println("(" + x + "," + y + ")");
			
			for (int i = 0; i < count; i++)
				res[x][y--] = num++;
			System.out.println("(" + x + "," + y + ")");
			
			for (int i = 0; i < count; i++)
				res[x--][y] = num++;
			x++;
			y++;
			
			System.out.println("(" + x + "," + y + ")");
			
			count -= 2;
		}
		System.out.println("count is " + count);
		if (count == 0)
			res[x][y] = num;
		
		return res;
		
        
    }
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sol_59.generateMatrix(8);

	}

}
