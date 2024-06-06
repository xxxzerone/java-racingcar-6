package racingcar.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateTest {

    @Test
    @DisplayName("이름이 6자 이상이면 true 반환")
    void overLength() {
        assertTrue(Validate.isOverLength(new String[]{"wonni", "abcdef", "pobi"}));
    }

    @Test
    @DisplayName("이름이 5자 이하이면 false 반환")
    void notOverLength() {
        assertFalse(Validate.isOverLength(new String[]{"wonni", "jun", "pobi"}));
    }

    @Test
    @DisplayName("이름에 소문자 알파벳 이외의 값이 있으면 true 반환")
    void notNameLowerCase() {
        assertTrue(Validate.isNameLowerCase(new String[]{"wonn1", "3un", "pob!"}));
    }

    @Test
    @DisplayName("이름이 소문자 알파벳만 있으면 false 반환")
    void nameLowerCase() {
        assertFalse(Validate.isNameLowerCase(new String[]{"won", "jun", "pobi"}));
    }
}