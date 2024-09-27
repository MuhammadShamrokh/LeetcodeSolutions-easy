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
        int[] expected = new int[]{4,1,2,3};

        assertArrayEquals(expected, solution.arrayRankTransform(new int[]{40,10,20,30}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[] expected = new int[]{1,1,1};

        assertArrayEquals(expected, solution.arrayRankTransform(new int[]{100, 100, 100}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int[] expected = new int[]{};

        assertArrayEquals(expected,solution.arrayRankTransform(new int[]{}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        int[] expected = new int[]{1,2,3,4};

        assertArrayEquals(expected,solution.arrayRankTransform(new int[]{1,2,3,4}));
    }

}

