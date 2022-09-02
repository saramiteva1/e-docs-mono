package com.docs.invoice.spring.repository;

import com.docs.invoice.api.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringCompanyRepository extends JpaRepository<Company, Long> {
  Company findCompanyById(Long id);
}
