package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {
    Solution solution;
    @BeforeEach
    void setup(){
        solution = new Solution();
    }

    @Test
    @Order(1)
    @DisplayName("Test 1")

    void TestOne(){
        int[] expected = new int[]{0,1};

        int [] actual = solution.twoSum(new int[]{2,7,11,15}, 9);

        assertArrayEquals(expected, actual, "result should be [0,1]");
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[] expected = new int[]{1,2};

        int [] actual = solution.twoSum(new int[]{3,2,4}, 6);

        assertArrayEquals(expected, actual, "result should be [1,2]");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int[] expected = new int[]{0,1};

        int [] actual = solution.twoSum(new int[]{3,3}, 6);

        assertArrayEquals(expected, actual, "result should be [0,1]");
    }

}