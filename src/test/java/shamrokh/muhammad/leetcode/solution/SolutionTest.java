package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;


import java.util.List;

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
        //Input: n = 4, rounds = [1,3,1,2]
        //Output: [1,2]
        List<Integer> expected = List.of(1, 2);

        assertIterableEquals(expected, solution.mostVisited(4, new int[]{1, 3, 1, 2}));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: n = 2, rounds = [2,1,2,1,2,1,2,1,2]
        //Output: [2]
        List<Integer> expected = List.of(2);

        assertIterableEquals(expected, solution.mostVisited(4, new int[]{2,1,2,1,2,1,2,1,2}));

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

