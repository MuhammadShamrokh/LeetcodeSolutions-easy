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
        int[] expected = new int[]{0,1,2,4,8,3,5,6,7};

        assertArrayEquals(expected, solution.sortByBits(new int[]{0,1,2,3,4,5,6,7,8}));

    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        int[] expected = new int[]{1,2,4,8,16,32,64,128,256,512,1024};

        assertArrayEquals(expected, solution.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1}));
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

