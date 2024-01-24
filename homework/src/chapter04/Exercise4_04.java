package chapter04;

public class Exercise4_04 {
	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		// 100이상이 되는지 구하시오.
		
		int sum = 0;
		int num = 0;
		
		while(sum < 100) {
			num++;
			if(num % 2 == 0) {
				sum += num * (-1);
			} else  {
				sum += num;
			}
		}
		
		System.out.println(num + "번 더한 값은 " + sum);
			
	}
}
