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
        //Input: nums = [2,5,1,3,4,7], n = 3
        //Output: [2,3,5,4,1,7]
        int[] expected = new int[]{2,3,5,4,1,7};

        assertArrayEquals(expected, solution.shuffle(new int[]{2,5,1,3,4,7}, 3));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: nums = [1,2,3,4,4,3,2,1], n = 4
        //Output: [1,4,2,3,3,2,4,1]
        int[] expected = new int[]{1,4,2,3,3,2,4,1};

        assertArrayEquals(expected, solution.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: nums = [1,1,2,2], n = 2
        //Output: [1,2,1,2]
        int[] expected = new int[]{1,2,1,2};

        assertArrayEquals(expected, solution.shuffle(new int[]{1,1,2,2}, 2));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

