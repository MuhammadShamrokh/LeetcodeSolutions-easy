package shamrokh.muhammad.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shamrokh.muhammad.leetcode.solution.Solution;

@SpringBootApplication
public class LeetcodeApplication {
	public static void main(String[] args) {
		//SpringApplication.run(LeetcodeApplication.class, args);
		new Solution().sortArrayByParityII(new int[]{4,1,1,0,1,0});
	}

}
