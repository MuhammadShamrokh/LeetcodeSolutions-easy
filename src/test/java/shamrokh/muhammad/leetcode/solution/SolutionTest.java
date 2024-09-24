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
        String expected = "1[.]1[.]1[.]1";

        assertEquals(expected, solution.defangIPaddr("1.1.1.1"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
        String expected = "255[.]100[.]50[.]0";

        assertEquals(expected, solution.defangIPaddr("255.100.50.0"));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        String expected = "10[.]0[.]0[.]1";

        assertEquals(expected, solution.defangIPaddr("10.0.0.1"));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        String expected = "195[.]7[.]6[.]4";

        assertEquals(expected, solution.defangIPaddr("195.7.6.4"));
    }

}