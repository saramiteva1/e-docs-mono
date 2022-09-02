package com.docs.invoice.api.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Invoice {

  @Id
  @GeneratedValue
  private Long id;
  private Long fromCompany;
  private Long toCompany;
  private Long totalPrice;
  private Integer taxPercent;
  private Long priceWtaX;

  @ManyToMany
  private Set<Item> items = new HashSet<Item>(0);
}
