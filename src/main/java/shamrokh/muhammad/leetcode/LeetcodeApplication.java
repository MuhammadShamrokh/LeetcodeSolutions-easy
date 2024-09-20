package shamrokh.muhammad.leetcode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shamrokh.muhammad.leetcode.solution.Solution;

@SpringBootApplication
public class LeetcodeApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeetcodeApplication.class, args);
	}

	@Bean
	public CommandLineRunner myRunner(){
		return runner -> {
			int[][] arr = new Solution().allCellsDistOrder(2,2,0,1);
			for(int r=0;r<arr.length;r++){
				System.out.print("[");
				for(int c=0;c<arr[0].length;c++){
					System.out.print(arr[r][c] +",");
				}
				System.out.println("]");
			}
		};
	}

}



