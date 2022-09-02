package com.docs.invoice.core.service;

import com.docs.invoice.api.domain.Invoice;
import com.docs.invoice.api.service.InvoiceService;
import com.docs.invoice.core.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;

import java.util.Set;
@RequiredArgsConstructor
public class CoreInvoiceService implements InvoiceService {

  private final InvoiceRepository invoiceRepository;

  public Invoice saveInvoice(Invoice invoice) {
    return invoiceRepository.saveInvoice(invoice);
  }

  @Override
  public Set<Invoice> getAllInvoices() {
    return invoiceRepository.getAllInvoices();
  }

  @Override
  public Invoice getInvoice(long id) {
    return invoiceRepository.getInvoice(id);
  }

  @Override
  public void removeInvoice(long id) {
invoiceRepository.removeInvoice(id);
  }
}
