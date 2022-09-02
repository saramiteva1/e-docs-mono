package com.docs.invoice.core.repository;

import com.docs.invoice.api.domain.Company;

import java.util.Set;

public interface CompanyRepository {

  Company saveCompany(Company company);
  Set<Company> getAllCompanies();
  Company getCompany(long id);
  void removeCompany(long id);
}
