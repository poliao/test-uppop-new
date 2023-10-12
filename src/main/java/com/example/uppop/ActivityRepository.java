package com.example.uppop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    // คุณสามารถเพิ่มเมธอดเพิ่มเติมตามต้องการ
}
