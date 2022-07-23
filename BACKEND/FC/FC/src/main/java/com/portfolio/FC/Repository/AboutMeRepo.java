package com.portfolio.FC.Repository;

import com.portfolio.FC.models.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AboutMeRepo extends JpaRepository<AboutMe, Long> {
    
}
