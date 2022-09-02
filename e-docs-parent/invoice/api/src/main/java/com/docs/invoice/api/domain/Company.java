package com.docs.invoice.api.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Company {

  @Id
  @GeneratedValue
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
