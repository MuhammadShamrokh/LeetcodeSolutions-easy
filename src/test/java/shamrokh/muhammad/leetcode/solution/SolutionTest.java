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
        //Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        //Output: "leetcode"
        assertEquals("leetcode", solution.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: s = "abc", indices = [0,1,2]
        //Output: "abc"
        assertEquals("abc", solution.restoreString("abc", new int[]{0,1,2}));
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

