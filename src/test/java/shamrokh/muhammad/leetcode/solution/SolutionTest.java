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
        int[] expected = new int[]{2,2,2,1,4,3,3,9,6,7,19};

        assertArrayEquals(expected, solution.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},
                                                                new int[]{2,1,4,3,9,6}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
        int[] expected = new int[]{22,28,8,6,17,44};

        assertArrayEquals(expected, solution.relativeSortArray(new int[]{28,6,22,8,44,17},
                                                                new int[]{22,28,8,6}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int[] expected = new int[]{2,42,38,0,43,21,5,7,12,12,13,23,24,24,27,29,30,31,33,48};

        assertArrayEquals(expected, solution.relativeSortArray(new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31},
                new int[]{2,42,38,0,43,21}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

