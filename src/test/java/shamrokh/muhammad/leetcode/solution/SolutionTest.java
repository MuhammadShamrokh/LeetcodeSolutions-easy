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
        assertTrue(solution.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1} ),
                "There is a possible partition for the deck [1,2,3,4,4,3,2,1]");
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertFalse(solution.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3} ),
                "There is No possible partition for the deck [1,2,3,4,4,3,2,1]");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertTrue(solution.hasGroupsSizeX(new int[]{1,1,2,2,2,2} ),
                "There is a possible partition for the deck [1,1,2,2,2,2]");
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){

    }

}