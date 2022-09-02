package com.docs.invoice.spring.repository.impl;


import com.docs.invoice.api.domain.Invoice;
import com.docs.invoice.core.repository.InvoiceRepository;
import com.docs.invoice.spring.repository.SpringCompanyRepository;
import com.docs.invoice.spring.repository.SpringInvoiceRepository;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@RequiredArgsConstructor
public class InvoiceRepositoryImpl implements InvoiceRepository {
  private final SpringInvoiceRepository repository;

  @Override
  public Invoice saveInvoice(Invoice invoice) {
    return repository.save(invoice);
  }

  @Override
  public Set<Invoice> getAllInvoices() {
    return new HashSet<>(repository.findAll());
  }

  @Override
  public Invoice getInvoice(long id) {
    return repository.findInvoiceById(id);
  }

  @Override
  public void removeInvoice(long id) {
      repository.delete(repository.findInvoiceById(id));
  }
}
