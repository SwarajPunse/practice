package com.importcsv.springbootimportcsvfileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.importcsv.springbootimportcsvfileapp.entity.CsvToDatabaseEntity;

public interface CsvToDatabaseRepository extends JpaRepository<CsvToDatabaseEntity, Long> {

}
