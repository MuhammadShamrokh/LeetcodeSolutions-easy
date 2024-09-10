package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<String> expected = new HashSet<>(Arrays.asList("sweet","sour"));

        assertIterableEquals(expected,
                new HashSet<>(Arrays.asList(solution.uncommonFromSentences("this apple is sweet","this apple is sour"))));

    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        Set<String> expected = new HashSet<>(List.of("banana"));

        assertIterableEquals(expected,
                new HashSet<>(Arrays.asList(solution.uncommonFromSentences("apple apple","banana"))));
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