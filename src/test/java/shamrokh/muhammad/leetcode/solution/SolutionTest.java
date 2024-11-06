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
        //Input: nums = [1,0,0,0,1,0,0,1], k = 2
        //Output: true
        assertTrue(solution.kLengthApart(new int[]{1,0,0,0,1,0,0,1}, 2));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: nums = [1,0,0,1,0,1], k = 2
        //Output: false
        assertFalse(solution.kLengthApart(new int[]{1,0,0,1,0,1}, 2));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertFalse(solution.kLengthApart(new int[]{1,0,1}, 2));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

