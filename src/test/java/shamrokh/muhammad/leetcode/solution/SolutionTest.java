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
        assertEquals(1, solution.numEquivDominoPairs(new int[][]{{1,2}, {2,1},{3,4},{5,6}}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
        assertEquals(3, solution.numEquivDominoPairs(new int[][]{{1,2},{1,2},{1,1},{1,2},{2,2}}));
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

