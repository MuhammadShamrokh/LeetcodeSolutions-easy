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
        //Input: prices = [8,4,6,2,3]
        //Output: [4,2,4,2,3]
        int[] expected = new int[]{4,2,4,2,3};

        assertArrayEquals(expected, solution.finalPrices(new int[]{8,4,6,2,3}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: prices = [1,2,3,4,5]
        //Output: [1,2,3,4,5]
        int[] expected = new int[]{1,2,3,4,5};

        assertArrayEquals(expected, solution.finalPrices(new int[]{1,2,3,4,5}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: prices = [10,1,1,6]
        //Output: [9,0,1,6]
        int[] expected = new int[]{9,0,1,6};

        assertArrayEquals(expected, solution.finalPrices(new int[]{10,1,1,6}));

    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

