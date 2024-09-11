package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        int[] expected = new int[]{1,2};

        assertArrayEquals(expected, solution.fairCandySwap(new int[]{1,1}, new int[]{2,2}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[] expected = new int[]{1,2};

        assertArrayEquals(expected, solution.fairCandySwap(new int[]{1,2}, new int[]{2,3}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int[] expected = new int[]{2,3};

        assertArrayEquals(expected, solution.fairCandySwap(new int[]{2}, new int[]{1,3}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}