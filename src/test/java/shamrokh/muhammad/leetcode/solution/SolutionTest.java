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
        assertTrue(solution.checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertFalse(solution.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertTrue(solution.checkStraightLine(new int[][]{{0,0},{0,1},{0,-1}}));

    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        assertFalse(solution.checkStraightLine(new int[][]{{0,0},{0,5},{5,0},{1337,0},{0,1337}}));

    }

}

