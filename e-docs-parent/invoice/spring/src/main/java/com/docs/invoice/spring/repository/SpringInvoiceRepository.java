package com.docs.invoice.spring.repository;

import com.docs.invoice.api.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringInvoiceRepository  extends JpaRepository<Invoice, Long> {
  Invoice findInvoiceById(Long id);
}
