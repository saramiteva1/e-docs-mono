package com.docs.invoice.spring.dto.in;

import com.docs.invoice.api.domain.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class InvoiceIn {
  private Long fromCompany;
  private Long toCompany;
  private Long totalPrice;
  private Integer taxPercent;
  private Long priceWtaX;
  private Set<Item> items;
}
