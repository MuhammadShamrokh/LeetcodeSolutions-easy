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
        int[] expected = new int[]{0,1,9,16,100};

        assertArrayEquals(expected, solution.sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo() {
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