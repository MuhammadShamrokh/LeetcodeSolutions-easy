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
        assertEquals("2052-10-20", solution.reformatDate("20th Oct 2052"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertEquals("1933-06-06", solution.reformatDate("6th Jun 1933"));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertEquals("1960-05-26", solution.reformatDate("26th May 1960"));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

