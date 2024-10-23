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
        assertEquals(2, solution.findLucky(new int[]{2,2,3,4}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertEquals(3, solution.findLucky(new int[]{1,2,2,3,3,3}));
   }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertEquals(-1, solution.findLucky(new int[]{2,2,2,3,3}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

