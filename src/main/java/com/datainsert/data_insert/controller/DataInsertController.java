package com.datainsert.data_insert.controller;

import com.datainsert.data_insert.dto.CadreDTO;
import com.datainsert.data_insert.service.AiDataInsertService;
import com.datainsert.data_insert.service.DataInsertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class DataInsertController {
    private final DataInsertService dataInsertService;
    private final AiDataInsertService aiDataInsertService;

    public DataInsertController(DataInsertService dataInsertService, AiDataInsertService aiDataInsertService) {
        this.dataInsertService = dataInsertService;
        this.aiDataInsertService = aiDataInsertService;
    }

    @GetMapping("/chat")
    public String AiChat(@RequestParam String query) {
        return aiDataInsertService.getAiResponse(query);
    }

    @GetMapping("/ping")
    public CadreDTO insertData() {
        return dataInsertService.insertData();
    }
}
