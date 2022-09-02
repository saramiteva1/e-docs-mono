package com.docs.invoice.core.repository;

import com.docs.invoice.api.domain.Invoice;

import java.util.Set;

public interface InvoiceRepository {

  Invoice saveInvoice(Invoice invoice);
  Set<Invoice> getAllInvoices();
  Invoice getInvoice(long id);
  void  removeInvoice(long id);
}
