package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
    public static void findSpecialSquares(int n) {
        int count = 0;
        int num = 1;
        
        while (count < n) {
            int squareRoot = (int) Math.sqrt(num);
            if (squareRoot * squareRoot == num) {
                int sum = 0;
                for (int k = 1; sum < num; k++) {
                    sum += k;
                    if (sum == num) {
                        System.out.println(num);
                        count++;
                        break;
                    }
                }
            }
            num++;
        }
    
    }
}


