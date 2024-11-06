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
        //Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
        //Output: "Sao Paulo"
        String expected = "Sao Paulo";
        List<List<String>> functionInput = List.of(
                List.of("London","New York"),
                List.of("New York","Lima"),
                List.of("Lima","Sao Paulo")
        );


        assertEquals(expected, solution.destCity(functionInput));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        //Input: paths = [["B","C"],["D","B"],["C","A"]]
        //Output: "A"
        String expected = "A";
        List<List<String>> functionInput = List.of(
                List.of("B","C"),
                List.of("D","B"),
                List.of("C","A")
        );


        assertEquals(expected, solution.destCity(functionInput));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        //Input: paths = [["A","Z"]]
        //Output: "Z"
        String expected = "Z";
        List<List<String>> functionInput = List.of(List.of("A","Z"));

        assertEquals(expected, solution.destCity(functionInput));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}

