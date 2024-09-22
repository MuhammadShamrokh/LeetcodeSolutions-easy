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
        assertArrayEquals(new String[]{"girl", "student"}, solution.findOcurrences( "alice is a good girl she is a good student", "a", "good"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
        assertArrayEquals(new String[]{"we","rock"}, solution.findOcurrences("we will we will rock you", "we", "will"));
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