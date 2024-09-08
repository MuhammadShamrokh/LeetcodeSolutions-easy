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
        assertTrue(solution.buddyStrings("ab","ba"), "the strings 'ab' and 'ba' are buddy strings");
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertFalse(solution.buddyStrings("ab","ab"), "the strings 'ab' and 'ab' are NOT buddy strings");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertTrue(solution.buddyStrings("aa","aa"), "the strings 'aa' and 'aa' are buddy strings");
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        assertFalse(solution.buddyStrings("aa","bb"), "the strings 'aa' and 'bb' are NOT buddy strings");
    }

}