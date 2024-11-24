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
        //Input: arr = [1,2,4,4,4,4], m = 1, k = 3
        //Output: true
        assertTrue(solution.containsPattern(new int[]{1,2,4,4,4,4}, 1, 3));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
        //Output: true
        assertTrue(solution.containsPattern(new int[]{1,2,1,2,1,1,1,3}, 2, 2));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: arr = [1,2,1,2,1,3], m = 2, k = 3
        //Output: false
        assertFalse(solution.containsPattern(new int[]{1,2,1,2,1,3}, 2, 3));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        //Input: arr = [2,2], m = 1, k = 2
        //output: true
        assertTrue(solution.containsPattern(new int[]{2, 2}, 1, 2));
    }

}

