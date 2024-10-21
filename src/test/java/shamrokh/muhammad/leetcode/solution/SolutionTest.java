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
        assertEquals(2, solution.findTheDistanceValue(new int[]{4,5,8},new int[]{10,9,1,8}, 2));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertEquals(2, solution.findTheDistanceValue(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30},3));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertEquals(1, solution.findTheDistanceValue(new int[]{2,1,100,3},new int[]{-5,-2,10,-3,7},6));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

