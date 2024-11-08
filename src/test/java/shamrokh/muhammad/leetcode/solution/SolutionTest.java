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
        //Input: nums = [3,4,5,2]
        //Output: 12
        assertEquals(12, solution.maxProduct(new int[]{3,4,5,2}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: nums = [1,5,4,5]
        //Output: 16
        assertEquals(16, solution.maxProduct(new int[]{1,5,4,5}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: nums = [3,7]
        //Output: 12
        assertEquals(12, solution.maxProduct(new int[]{3,7}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

