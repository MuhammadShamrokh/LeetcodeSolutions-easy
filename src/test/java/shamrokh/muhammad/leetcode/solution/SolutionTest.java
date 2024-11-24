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
        //Input: arr = [1,4,2,5,3]
        //Output: 58
        assertEquals(58, solution.sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: arr = [1,2]
        //Output: 3
        assertEquals(3, solution.sumOddLengthSubarrays(new int[]{1,2}));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: arr = [10,11,12]
        //Output: 66
        assertEquals(66, solution.sumOddLengthSubarrays(new int[]{10,11,12}));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

