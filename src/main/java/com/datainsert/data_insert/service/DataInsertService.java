package com.datainsert.data_insert.service;

import com.datainsert.data_insert.entity.Cadre;
import com.datainsert.data_insert.repository.CadreRepository;
import org.springframework.stereotype.Service;

@Service
public class DataInsertService {

    private final AiDataInsertService aiDataInsertService;
    private final CadreRepository cadreRepository;

    public DataInsertService(AiDataInsertService aiDataInsertService, CadreRepository cadreRepository) {
        this.aiDataInsertService = aiDataInsertService;
        this.cadreRepository = cadreRepository;
    }

    public String insertData() {
        Cadre fakeDataForCadre = aiDataInsertService.getFakeDataForCadre();

        return "Hello";
    }
}
