package com.docs.invoice.spring.mapper;

import com.docs.invoice.api.domain.Company;
import com.docs.invoice.spring.dto.in.CompanyIn;
import com.docs.invoice.spring.dto.out.CompanyOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface CompanyMapper {
  @Mapping(source = "companyIn.name", target = "name")
  @Mapping(source = "companyIn.shortName", target = "shortName")
  @Mapping(source = "companyIn.vat", target = "vat")
  @Mapping(source = "companyIn.uid", target = "uid")
  @Mapping(source = "companyIn.email", target = "email")
  @Mapping(source = "companyIn.address", target = "address")
  @Mapping(source = "companyIn.city", target = "city")
  @Mapping(source = "companyIn.country", target = "country")
  @Mapping(source = "companyIn.phone", target = "phone")
  Company updateCompany(CompanyIn companyIn, @MappingTarget Company company);

  Company toEntity(CompanyIn company);

  CompanyOut toDto(Company company);
}
