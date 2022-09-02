package com.docs.invoice.spring.dto.out;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CompanyOut {
  private Long id;
  private String name;
  private String shortName;
  private Long vat;
  private Long uid;
  private String email;
  private String address;
  private String city;
  private String country;
  private String phone;
}
