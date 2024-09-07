package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
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
        int [][] resultArray = new int[][]{{3,6}};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(3,6));
        List<List<Integer>> actual = solution.largeGroupPositions("abbxxxxzzy");

        assertIterableEquals(expected,actual,"The result should be [[3,6]]");
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(3,5),
                                                     Arrays.asList(6,9),
                                                     Arrays.asList(12,14));
        List<List<Integer>> actual = solution.largeGroupPositions("abcdddeeeeaabbbcd");

        assertIterableEquals(expected,actual,"The result should be [[3,5],[6,9],[12,14]]");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){

    }

}