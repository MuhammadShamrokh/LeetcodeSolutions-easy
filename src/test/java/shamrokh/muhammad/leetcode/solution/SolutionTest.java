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
        int[] expected = new int[]{1,2,3,1};

        assertArrayEquals(expected, solution.distributeCandies(7,4));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
        int[] expected = new int[]{5,2,3};

        assertArrayEquals(expected, solution.distributeCandies(10,3));
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