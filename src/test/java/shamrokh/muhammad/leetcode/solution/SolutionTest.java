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
        assertTrue(solution.backspaceCompare("ab#c", "ad#c"), "both ab#c and ad#c should be equal");
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertTrue(solution.backspaceCompare("ab##", "c#d#"), "both ab## and c#d# should be equal");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertFalse(solution.backspaceCompare("a#c", "#b"), "both a#c and b should be equal");
    }

}