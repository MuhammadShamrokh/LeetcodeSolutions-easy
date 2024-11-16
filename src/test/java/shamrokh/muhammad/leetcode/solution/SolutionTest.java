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
        //Input: n = 987
        //Output: "987"
        assertEquals("987", solution.thousandSeparator(987));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: n = 1234
        //Output: "1.234"
        assertEquals("1.234", solution.thousandSeparator(1234));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: n = 0
        //Output: "0"
        assertEquals("0", solution.thousandSeparator(0));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

