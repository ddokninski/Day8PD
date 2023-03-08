package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestDataProvider extends BaseTest {

    public static Stream<Arguments> testDataProviderForSiiPage() {
        return Stream.of(
                Arguments.of("https://sii.pl/", "Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska")
        );
    }

    public static Stream<Arguments> testDataProviderForOnetPage() {
        return Stream.of(
                Arguments.of("https://onet.pl/", "Onet – Jesteś na bieżąco")
        );
    }

    public static Stream<Arguments> testDataProviderForKotuszkowoPage() {
        return Stream.of(
                Arguments.of("http://kotuszkowo.pl/", "Kotuszkowo- blog o kotach")
        );
    }

    public static Stream<Arguments> testDataProviderForFilmwebPage() {
        return Stream.of(
                Arguments.of("https://filmweb.pl/", "Filmweb - filmy takie jak Ty!")
        );
    }

    public static Stream<Arguments> testDataProviderForSeleniumPage() {
        return Stream.of(
                Arguments.of("https://www.selenium.dev/documentation/en/webdriver/", "WebDriver | Selenium")
        );
    }
}
