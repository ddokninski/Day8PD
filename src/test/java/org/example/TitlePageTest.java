package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TitlePageTest extends TestDataProvider {

    @ParameterizedTest
    @MethodSource("testDataProviderForSiiPage")
    @DisplayName("Testing sii.pl title")
    @Tag("regression")
    @Tag("sii.pl")
    void shouldValidateCorrectTitleSii(String url, String expectedTitle) {
        checkPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("testDataProviderForOnetPage")
    @DisplayName("Testing onet.pl title")
    @Tag("regression")
    @Tag("onet.pl")
    void shouldValidateCorrectTitleOnet(String url, String expectedTitle) {
        checkPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("testDataProviderForKotuszkowoPage")
    @DisplayName("Testing kotuszkowo.pl title")
    @Tag("regression")
    @Tag("kotuszkowo.pl")
    void shouldValidateCorrectTitleKotuszkowo(String url, String expectedTitle) {
        checkPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("testDataProviderForFilmwebPage")
    @DisplayName("Testing filmweb.pl title")
    @Tag("regression")
    @Tag("filmweb.pl")
    void shouldValidateCorrectTitleFilmweb(String url, String expectedTitle) {
        checkPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("testDataProviderForSeleniumPage")
    @DisplayName("Testing selenium.pl title")
    @Tag("regression")
    @Tag("selenium.pl")
    void shouldValidateCorrectTitleSelenium(String url, String expectedTitle) {
        checkPageTitle(url, expectedTitle);
    }

    private void checkPageTitle(String url, String expectedTitle) {
        //GIVEN
        driver.get(url);
        driver.manage().window().maximize();
        //WHEN
        String actualTitle = driver.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
