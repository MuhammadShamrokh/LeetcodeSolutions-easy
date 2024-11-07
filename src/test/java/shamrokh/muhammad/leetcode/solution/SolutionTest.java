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
        //Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
        //Output: 1
        assertEquals(1, solution.busyStudent(new int[]{1,2,3},new int[]{3,2,7},4));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: startTime = [4], endTime = [4], queryTime = 4
        //Output: 1
        assertEquals(1, solution.busyStudent(new int[]{4},new int[]{4},4));
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

