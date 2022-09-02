package com.docs.invoice.api.service;

import com.docs.invoice.api.domain.Company;

import java.util.Set;

public interface CompanyService {
  Company saveCompany(Company company);
  Set<Company> getAllCompanies();
  Company getCompany(long id);
  void removeCompany(long id);
}
