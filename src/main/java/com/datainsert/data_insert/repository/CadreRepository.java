package com.datainsert.data_insert.repository;

import com.datainsert.data_insert.entity.Cadre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadreRepository extends JpaRepository<Cadre, Integer> {
}
