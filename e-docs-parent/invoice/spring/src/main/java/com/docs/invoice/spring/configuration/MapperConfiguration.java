package com.docs.invoice.spring.configuration;

import com.docs.invoice.spring.mapper.CompanyMapperImpl;
import com.docs.invoice.spring.mapper.InvoiceMapperImpl;
import com.docs.invoice.spring.mapper.ItemMapperImpl;
import org.springframework.context.annotation.Import;

@Import({
    CompanyMapperImpl.class,
    InvoiceMapperImpl.class,
    ItemMapperImpl.class
})
public class MapperConfiguration {
}
