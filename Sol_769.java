package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 769. Max Chunks To Make Sorted
 * 
 * @author czm
 * 
 *
 */
public class Sol_769 {
	
	public int maxChunksToSorted(int[] arr) {
        
        int num = arr.length;
        int[] map = new int[num];
        int unions = 1;
        
        for (int i = 0; i < num; i++) {    
            
            if (arr[i] > i) {
                if (map[i] == 0) {
                    for (int j = i; j <= arr[i]; j++)
                        map[j] = unions;
                    unions++;
                } else
                    for (int j = i + 1; j <= arr[i]; j++)
                        map[j] = map[i];
            } else if (arr[i] == i)
                map[i] = unions++;
            
        }
        
        int count = 1;
        for (int i = 1; i < num; i++)
            if (map[i] != map[i - 1])
                count++;
        
        return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
