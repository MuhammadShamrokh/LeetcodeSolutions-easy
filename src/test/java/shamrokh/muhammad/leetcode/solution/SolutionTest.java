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
        assertTrue(solution.isMonotonic(new int[]{1,2,2,3}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertTrue(solution.isMonotonic(new int[]{6,5,4,4}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertFalse(solution.isMonotonic(new int[]{1,3,2}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        assertTrue(solution.isMonotonic(new int[]{1}));
    }

}