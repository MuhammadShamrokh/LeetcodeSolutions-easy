package shamrokh.muhammad.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shamrokh.muhammad.leetcode.solution.Solution;

@SpringBootApplication
public class LeetcodeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LeetcodeApplication.class, args);
		new Solution().largeGroupPositions("abcdddeeeeaabbbcd");
	}

}
