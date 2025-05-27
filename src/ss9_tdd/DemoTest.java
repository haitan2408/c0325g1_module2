package ss9_tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    public void testSum1() throws Exception {
      Demo demo = new Demo();
      long result = demo.sum(3,5);
      assertEquals(result, 8, "Đáp án của 3 + 5 phải bằng 8");
    }
}