package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

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
        int[][] expected = {{1,0,0},
                            {0,1,0},
                            {1,1,1}};

        assertArrayEquals(expected, solution.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}),
                "The result should be [[1,0,0],[0,1,0],[1,1,1]].");

    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[][] expected = {{1,1,0,0},
                            {0,1,1,0},
                            {0,0,0,1},
                            {1,0,1,0}};

        assertArrayEquals(expected, solution.flipAndInvertImage(new int[][]{{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}}),
                "The result should be [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]].");

    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){

    }

}