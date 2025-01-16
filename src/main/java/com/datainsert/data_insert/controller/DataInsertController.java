package com.datainsert.data_insert.controller;

import com.datainsert.data_insert.service.DataInsertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class DataInsertController {
    private final DataInsertService dataInsertService;

    public DataInsertController(DataInsertService dataInsertService) {
        this.dataInsertService = dataInsertService;
    }

    @GetMapping("/ping")
    public String insertData() {
        return dataInsertService.insertData();
    }
}
