package com.docs.invoice.spring.repository.impl;

import com.docs.invoice.api.domain.Company;
import com.docs.invoice.core.repository.CompanyRepository;
import com.docs.invoice.spring.repository.SpringCompanyRepository;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
public class CompanyRepositoryImpl implements CompanyRepository {
  private final SpringCompanyRepository repository;

  @Override
  public Company saveCompany(Company company) {
    return repository.save(company);
  }

  @Override
  public Set<Company> getAllCompanies() {
    return new HashSet<>(repository.findAll());
  }

  @Override
  public Company getCompany(long id) {
    return repository.findCompanyById(id);
  }

  @Override
  public void removeCompany(long id) {
    repository.delete(repository.findCompanyById(id));
  }
}
