package shamrokh.muhammad.leetcode.solution;

import org.junit.jupiter.api.*;


import java.util.ArrayList;
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
        List<String> expected = Arrays.asList("as","hero");
        List<String> output = solution.stringMatching(new String[]{"mass","as","hero","superhero"});

        assertEquals(expected.size(), output.size());
        assertTrue(expected.containsAll(output));
        assertTrue(output.containsAll(expected));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        List<String> expected = Arrays.asList("et","code");
        List<String> output = solution.stringMatching(new String[]{"leetcode","et","code"});

        assertEquals(expected.size(), output.size());
        assertTrue(expected.containsAll(output));
        assertTrue(output.containsAll(expected));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        List<String> expected = List.of();
        List<String> output = solution.stringMatching(new String[]{"blue","green","bu"});

        assertEquals(0, output.size());
        assertTrue(expected.containsAll(output));
        assertTrue(output.containsAll(expected));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
    }

}

