package com.docs.invoice.api.service;

import com.docs.invoice.api.domain.Invoice;

import java.util.Set;

public interface InvoiceService {
  Invoice saveInvoice(Invoice invoice);
  Set<Invoice> getAllInvoices();
  Invoice getInvoice(long id);
  void  removeInvoice(long id);

}
