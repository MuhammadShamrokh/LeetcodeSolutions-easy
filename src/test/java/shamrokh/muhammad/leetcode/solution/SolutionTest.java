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
        //Input: arr = [1,2,4]
        //Output: false
        assertFalse(solution.canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: arr = [3,5,1]
        //Output: true
        assertTrue(solution.canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){

    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

