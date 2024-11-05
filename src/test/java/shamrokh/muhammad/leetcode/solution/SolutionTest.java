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
        //Input: candies = [2,3,5,1,3], extraCandies = 3
        //Output: [true,true,true,false,true]
        List<Boolean> expected = List.of(true,true,true,false,true);

        assertIterableEquals(expected, solution.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: candies = [4,2,1,1,2], extraCandies = 1
        //Output: [true,false,false,false,false]
        List<Boolean> expected = List.of(true,false,false,false,false);

        assertIterableEquals(expected, solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: candies = [12,1,12], extraCandies = 10
        //Output: [true,false,true]
        List<Boolean> expected = List.of(true,false,true);

        assertIterableEquals(expected, solution.kidsWithCandies(new int[]{12,1,12}, 10));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

