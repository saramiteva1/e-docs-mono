package com.docs.invoice.spring.controller;

import com.docs.invoice.api.service.InvoiceService;
import com.docs.invoice.spring.dto.in.InvoiceIn;
import com.docs.invoice.spring.dto.out.InvoiceOut;
import com.docs.invoice.spring.mapper.InvoiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/invoice/invoice")
@RequiredArgsConstructor
public class InvoiceController {

  private final InvoiceService invoiceService;
  private final InvoiceMapper mapper;

  @GetMapping
  public Set<InvoiceOut> getInvoices(){
    return invoiceService.getAllInvoices().stream().map(mapper::toDto).collect(Collectors.toSet());
  }

  @GetMapping("/{id}")
  public InvoiceOut getInvoice(@PathVariable long id){
    return mapper.toDto(invoiceService.getInvoice(id));
  }


  @PostMapping("/add")
  public void saveInvoice(@RequestBody InvoiceIn invoice){
    invoiceService.saveInvoice(mapper.toEntity(invoice));
  }


  @PutMapping("/{id}")

  public void updateInvoice(@PathVariable long id,
                            @RequestBody InvoiceIn invoice){
    invoiceService.saveInvoice(mapper.updateInvoice(invoice, invoiceService.getInvoice(id)));
  }


  @DeleteMapping("/delete/{id}")
  public void deleteInvoice(@PathVariable long id){
    invoiceService.removeInvoice(id);
  }
}
