package com.docs.invoice.spring.configuration;

import com.docs.invoice.core.service.CoreCompanyService;
import com.docs.invoice.core.service.CoreInvoiceService;
import com.docs.invoice.core.service.CoreItemService;
import org.springframework.context.annotation.Import;

@Import({
    CoreCompanyService.class,
    CoreInvoiceService.class,
    CoreItemService.class
})
public class ServiceConfiguration {
}
