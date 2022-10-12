package com.flow.ipq;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InterRepo extends JpaRepository<Inter, Integer> {

    @Query(value = "select e from public.batch_claim_info e where e.status is distinct from 'DONE'", nativeQuery = true)
    List<Claim> getNotDone();
}
