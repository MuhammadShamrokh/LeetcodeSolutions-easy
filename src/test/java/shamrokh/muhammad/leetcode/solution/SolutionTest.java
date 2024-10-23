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
        int[] expected = new int[]{0,4,1,3,2};

        assertArrayEquals(expected, solution.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[] expected = new int[]{0,1,2,3,4};

        assertArrayEquals(expected, solution.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int[] expected = new int[]{1};

        assertArrayEquals(expected, solution.createTargetArray(new int[]{1}, new int[]{0}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

