package search;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SearchTest extends BaseTest{



        @Test
        @DisplayName("Проверка поиска")
        public void test_1() {

            homePage.open().searchCourse("Искусство");
//дописать ассерты

        }
    }
