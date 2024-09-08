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
        assertTrue(solution.lemonadeChange(new int[]{5,5,5,10,20}),"Can give change back to [5,5,5,10,20] Payments");
    }

    @Test
    @Order(2)
    @DisplayName("Test 2")
    void TestTwo(){
        assertFalse(solution.lemonadeChange(new int[]{5,5,10,10,20}), "Can NOT give change back to [5,5,5,10,20] Payments.");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3")
    void TestThree(){
        assertTrue(solution.lemonadeChange(new int[]{5,5,5,5,5}),"Can give change back to [5,5,5,5,5] Payments.");
    }

    @Test
    @Order(4)
    @DisplayName("Test 4")
    void TestFour(){
        assertTrue(solution.lemonadeChange(new int[]{}),"There was no purchases, which mean everything is ok.");
    }

}