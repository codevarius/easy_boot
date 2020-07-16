package org.example.test.project.easy_boot.services;

import org.example.test.project.easy_boot.dto.InputForm;
import org.example.test.project.easy_boot.model.DataRecord;
import org.example.test.project.easy_boot.repo.RecordsRepo;
import org.springframework.stereotype.Service;

@Service
public class ResordsService {

    public RecordsRepo recordsRepo;

    public ResordsService(RecordsRepo recordsRepo) {
        this.recordsRepo = recordsRepo;
    }

    public void saveInputFormData(InputForm inputForm) {
        DataRecord record = new DataRecord();
        record.setData(inputForm.getData());
        recordsRepo.save(record);
    }
}
