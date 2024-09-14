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
        int expected = 1;

        assertEquals(expected, solution.minDeletionSize(new String[]{"cba","daf","ghi"}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int expected = 0;

        assertEquals(expected, solution.minDeletionSize(new String[]{"a","b"}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        int expected = 3;

        assertEquals(expected, solution.minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}