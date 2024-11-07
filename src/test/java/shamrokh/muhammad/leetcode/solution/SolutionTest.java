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
        //Input: sentence = "i love eating burger", searchWord = "burg"
        //Output: 4

        assertEquals(4, solution.isPrefixOfWord("i love eating burger", "burg"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: sentence = "this problem is an easy problem", searchWord = "pro"
        //Output: 2
        assertEquals(2, solution.isPrefixOfWord("this problem is an easy problem", "pro"));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: sentence = "i am tired", searchWord = "you"
        //Output: -1
        assertEquals(-1, solution.isPrefixOfWord("i am tired", "you"));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

