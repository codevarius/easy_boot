package org.example.test.project.easy_boot.repo;

import org.example.test.project.easy_boot.model.DataRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordsRepo extends CrudRepository<DataRecord,Long> {
}
