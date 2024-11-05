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
        //Input: s = "011101"
        //Output: 5
        assertEquals(5, solution.maxScore("011101"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: s = "00111"
        //Output: 5
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: s = "00111"
        //Output: 5
        assertEquals(5, solution.maxScore("00111"));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        //Input: s = "1111"
        //Output: 3
        assertEquals(3, solution.maxScore("1111"));
    }

}

