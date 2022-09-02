package com.docs.invoice.core.service;

import com.docs.invoice.api.domain.Company;
import com.docs.invoice.api.service.CompanyService;
import com.docs.invoice.core.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import java.util.Set;

@RequiredArgsConstructor
public class CoreCompanyService implements CompanyService {
  private final CompanyRepository companyRepository;
  @Override
  public Company saveCompany(Company company) {
    return companyRepository.saveCompany(company);
  }

  @Override
  public Set<Company> getAllCompanies() {
    return companyRepository.getAllCompanies();
  }

  @Override
  public Company getCompany(long id) {
    return companyRepository.getCompany(id);
  }

  @Override
  public void removeCompany(long id) {
    companyRepository.removeCompany(id);
  }
}
