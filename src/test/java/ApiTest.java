package ru.netology.rest;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
class ApiTest {
    @Test
    void shouldReturnDemoAccounts() {
        given()// Предусловия
                .baseUri("https://postman-echo.com")
                .body("Good evening!")// отправляемые данные (заголовки и query можно выставлять аналогично)
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(00)
                .body("data", equalTo("Good evening!"))
        ;
    }
}
