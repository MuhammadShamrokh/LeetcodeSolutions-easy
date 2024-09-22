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
        assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
        assertEquals("AB",solution.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}