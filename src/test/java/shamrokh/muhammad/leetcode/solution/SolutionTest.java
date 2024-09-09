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
        int expected = 2;

        assertEquals(expected, solution.binaryGap(22));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int expected = 0;

        assertEquals(expected, solution.binaryGap(8));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int expected = 1;

        assertEquals(expected, solution.binaryGap(7));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        int expected = 2;

        assertEquals(expected, solution.binaryGap(5));
    }

}