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
        //Input: nums = [1,2,3,1,1,3]
        //Output: 4
        assertEquals(4, solution.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: nums = [1,1,1,1]
        //Output: 6
        assertEquals(6, solution.numIdenticalPairs(new int[]{1,1,1,1}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: nums = [1,2,3]
        //Output: 0
        assertEquals(0, solution.numIdenticalPairs(new int[]{1,2,3}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

