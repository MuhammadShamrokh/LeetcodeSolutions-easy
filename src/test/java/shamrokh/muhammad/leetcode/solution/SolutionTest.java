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
        assertTrue(solution.isRectangleOverlap(
                        new int[]{0,0,2,2},
                        new int[]{1,1,3,3}),
                "The rectangles [0,0,2,2] and [1,1,3,3] overlap, function returned false.");
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertFalse(solution.isRectangleOverlap(
                        new int[]{0,0,1,1},
                        new int[]{1,0,2,1}),
                "The rectangles [0,0,1,1] and [1,0,2,1] does not overlap, function returned true.");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertFalse(solution.isRectangleOverlap(
                        new int[]{0,0,1,1},
                        new int[]{2,2,3,3}),
                "The rectangles [0,0,1,1] and [2,2,3,3] does not overlap, function returned true.");
    }

}