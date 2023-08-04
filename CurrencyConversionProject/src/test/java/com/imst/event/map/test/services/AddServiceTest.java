package com.imst.event.map.test.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.imst.event.map.test.model.Result;
import com.imst.event.map.test.service.AddService;


public class AddServiceTest {

    @Test
    public void addIntegers() {
        // given
        AddService service = new AddService();

        // when
        Result result = service.add(2, 3);

        // then
        assertEquals(result.getResult(), 5);
    }
}
