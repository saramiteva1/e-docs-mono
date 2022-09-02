package com.docs.invoice.spring.dto.in;

import com.docs.invoice.api.domain.Invoice;
import com.docs.invoice.api.domain.QuantityType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ItemIn {
  private Long quantity;
  private QuantityType quantityTypeEnum;
  private Integer price;
  private Set<Invoice> invoices;
}
