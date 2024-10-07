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
        assertEquals(6, solution.oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertEquals(0, solution.oddCells(2, 2, new int[][]{{1,1},{0,0}}));

    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertEquals(460, solution.oddCells(28, 38, new int[][]{
                {17,16},{26,31},{19,12},{22,24},{17,28},{23,21},{27,32},{23,27},{23,33},{18,7},{4,20},{0,31},{25,33},{5,22}
        }));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

