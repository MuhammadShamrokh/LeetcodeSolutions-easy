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
        assertEquals(1, solution.removePalindromeSub("ababa"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertEquals(2, solution.removePalindromeSub("abb"));

    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertEquals(2, solution.removePalindromeSub("baabb"));

    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        assertEquals(1, solution.removePalindromeSub("a"));
    }

}

