package com.datainsert.data_insert.repository;

import com.datainsert.data_insert.entity.VoterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterDetailsRepository extends JpaRepository<VoterDetails, Integer> {
}
