package com.gcp.copilotdemo.data.repository;

import com.gcp.copilotdemo.data.entity.Settlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, String> {

}
