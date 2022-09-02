package com.docs.invoice.spring.controller;


import com.docs.invoice.api.service.CompanyService;
import com.docs.invoice.spring.dto.in.CompanyIn;
import com.docs.invoice.spring.dto.out.CompanyOut;
import com.docs.invoice.spring.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/invoice/company")
@RequiredArgsConstructor
public class CompanyController {

  private final CompanyService companyService;
  private final CompanyMapper mapper;

  @GetMapping
  public Set<CompanyOut> getCompanies() {
    return companyService.getAllCompanies().stream()
        .map(mapper::toDto).collect(Collectors.toSet());
  }

  @GetMapping("/{id}")
  public CompanyOut getCompany(@PathVariable long id) {
    return mapper.toDto(companyService.getCompany(id));
  }

  @PostMapping("/add")
  public void saveCompany(@RequestBody CompanyIn company) {
    companyService.saveCompany(mapper.toEntity(company));
  }

  @PutMapping("/{id}")
  public void updateCompany(@PathVariable long id,
                            @RequestBody CompanyIn company) {
    companyService.saveCompany(mapper.updateCompany(company, companyService.getCompany(id)));
  }

  @DeleteMapping("/delete/{id}")
  public void deleteCompany(@PathVariable long id) {
    companyService.removeCompany(id);
  }

}
