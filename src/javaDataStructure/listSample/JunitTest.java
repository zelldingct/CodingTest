package javaDataStructure.listSample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class JunitTest {
    /* Junit Annotation
    @Test 테스트 Method임을 밝힘
    @DisplayName 테스트 Method 사용자정의
    @BeforeEach 모든 메소드마다 실행전에 실행할 메소드
    @AfterEach 모든 메소드마다 실행후에 실행할 메소드
    @BeforeAll 해당 클래스 실행전에 실행할 메소드
    @AfterAll 해당 클래스 실행전에 실행할 메소드
    @Disabled 이 메소드를 사용하지 않음
    */

    /* Junit Assertion
    assertEquals(기대값,실제값);
    assertNotEquals(기대값,실제값);
    assertTrue();
    assertFalse();
    assertNull;
    assertNotNull();
    assertAll;
    assertThrows(ArithmeticException.class,()->divide(100,0)); // 실행한 함수에서 해당 Exception 발생하는지 확인.발생하면 True
    */

    @Test
    @DisplayName("assertThrows 예시")
    public void assertThrowsSample() {
        assertThrows(ArithmeticException.class, () -> {
            int i = 100 / 0;
        });
    }


    @Test
    @DisplayName("assumingThat 예시")
    public void assumingThatSample() {
        assumingThat(true, () -> {
            System.out.println("Success");
        });
    }


}
