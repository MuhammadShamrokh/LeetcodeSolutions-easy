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
        assertEquals(1, solution.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertEquals(15, solution.daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){

    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

