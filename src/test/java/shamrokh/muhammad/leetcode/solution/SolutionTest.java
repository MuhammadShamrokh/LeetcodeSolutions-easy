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
        int[][] expected = new int[][]{{1,4,7},{2,5,8},{3,6,9}};

        assertArrayEquals(expected, solution.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[][] expected = new int[][]{{1,4},{2,5},{3,6}};

        assertArrayEquals(expected, solution.transpose(new int[][]{{1,2,3},{4,5,6}}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int [][] expected = new int[][]{{1}};

        assertArrayEquals(expected, solution.transpose(new int[][]{{1}}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}