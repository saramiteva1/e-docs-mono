package com.docs.invoice.api.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Item {
  @Id
  @GeneratedValue
  private Long id;
  private Long quantity;
  @Enumerated(EnumType.STRING)
  private QuantityType quantityTypeEnum;
  private Integer price;

  @ManyToMany
  private Set<Invoice> invoices = new HashSet<Invoice>(0);
}
