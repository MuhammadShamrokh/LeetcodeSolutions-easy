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
        //Input: mat = [[1,2,3],
        //              [4,5,6],
        //              [7,8,9]]
        //Output: 25
        int[][] input = new int[][]{{1,2,3},
                                    {4,5,6},
                                    {7,8,9}};

        assertEquals(25, solution.diagonalSum(input));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: mat = [[1,1,1,1],
        //              [1,1,1,1],
        //              [1,1,1,1],
        //              [1,1,1,1]]
        //Output: 8
        int[][] input = new int[][]{{1,1,1,1},
                                    {1,1,1,1},
                                    {1,1,1,1},
                                    {1,1,1,1}};

        assertEquals(8, solution.diagonalSum(input));
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

