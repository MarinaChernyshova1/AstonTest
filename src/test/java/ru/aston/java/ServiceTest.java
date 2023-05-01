package ru.aston.java;

import org.junit.jupiter.api.Test;

public class ServiceTest {
    @Test
    public void shouldResultByNumber() {
        Service service = new Service();

        service.setNumber(7);
    }

    @Test
    public void shouldResultByName() {
        Service service = new Service();

        service.setName("Вячеслав");
    }


}
