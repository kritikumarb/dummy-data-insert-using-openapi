package com.datainsert.data_insert.repository;

import com.datainsert.data_insert.entity.RequestTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestTrackRepository extends JpaRepository<RequestTrack, Integer> {
}
