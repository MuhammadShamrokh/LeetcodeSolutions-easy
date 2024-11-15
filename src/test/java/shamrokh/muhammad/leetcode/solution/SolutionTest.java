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
        //Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
        //Output: 4
        assertEquals(4, solution.countGoodTriplets(new int[]{3,0,1,1,9,7}, 7, 2, 3));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
        //Output: 0
        assertEquals(0, solution.countGoodTriplets(new int[]{1,1,2,2,3}, 0, 0, 1));
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

