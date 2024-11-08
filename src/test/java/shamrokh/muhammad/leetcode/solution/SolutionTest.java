package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;


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
        //Input: nums = [1,2,3,4]
        //Output: [1,3,6,10]
        int[] expected = new int[]{1,3,6,10};

        assertArrayEquals(expected, solution.runningSum(new int[]{1,2,3,4}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: nums = [1,1,1,1,1]
        //Output: [1,2,3,4,5]
        int[] expected = new int[]{1,2,3,4,5};

        assertArrayEquals(expected, solution.runningSum(new int[]{1,1,1,1,1}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: nums = [3,1,2,10,1]
        //Output: [3,4,6,16,17]
        int[] expected = new int[]{3,4,6,16,17};

        assertArrayEquals(expected, solution.runningSum(new int[]{3,1,2,10,1}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

