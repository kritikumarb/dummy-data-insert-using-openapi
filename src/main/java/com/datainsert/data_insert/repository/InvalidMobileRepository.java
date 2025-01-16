package com.datainsert.data_insert.repository;

import com.datainsert.data_insert.entity.InvalidMobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvalidMobileRepository extends JpaRepository<InvalidMobile, Integer> {
}
