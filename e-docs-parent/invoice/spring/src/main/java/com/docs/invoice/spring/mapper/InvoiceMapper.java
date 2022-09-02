package com.docs.invoice.spring.mapper;

import com.docs.invoice.api.domain.Invoice;
import com.docs.invoice.spring.dto.in.InvoiceIn;
import com.docs.invoice.spring.dto.out.InvoiceOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface InvoiceMapper {
  @Mapping(source = "invoiceIn.fromCompany", target = "fromCompany")
  @Mapping(source = "invoiceIn.toCompany", target = "toCompany")
  @Mapping(source = "invoiceIn.totalPrice", target = "totalPrice")
  @Mapping(source = "invoiceIn.taxPercent", target = "taxPercent")
  @Mapping(source = "invoiceIn.priceWtaX", target = "priceWtaX")
  @Mapping(source = "invoiceIn.items", target = "items")
  Invoice updateInvoice(InvoiceIn invoiceIn, @MappingTarget Invoice invoice);
  Invoice toEntity(InvoiceIn invoiceIn);
  InvoiceOut toDto(Invoice invoice);
}
