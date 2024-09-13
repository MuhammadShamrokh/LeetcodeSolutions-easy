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
        String expected = "dc-ba";

        assertEquals(expected, solution.reverseOnlyLetters("ab-cd"));
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        String expected = "j-Ih-gfE-dCba";

        assertEquals(expected, solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        String expected = "Qedo1ct-eeLg=ntse-T!";

        assertEquals(expected, solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}