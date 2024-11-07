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
        //Input: target = [1,2,3,4], arr = [2,4,1,3]
        //Output: true
        assertTrue(solution.canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: target = [7], arr = [7]
        //Output: true
        assertTrue(solution.canBeEqual(new int[]{7}, new int[]{7}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: target = [3,7,9], arr = [3,7,11]
        //Output: false
        assertFalse(solution.canBeEqual(new int[]{3,7,9}, new int[]{3,7,11}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

