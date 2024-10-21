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
        int[] expected = new int[]{2,1,0,3};

        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(new int[]{6,5,4,8}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[] expected = new int[]{0,0,0,0};

        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
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

