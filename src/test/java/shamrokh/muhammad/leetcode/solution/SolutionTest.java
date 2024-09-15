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
        assertEquals(3, solution.repeatedNTimes(new int[]{1,2,3,3}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
        assertEquals(2, solution.repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertEquals(5, solution.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}