package com.docs.invoice.spring.configuration;

import com.docs.invoice.spring.repository.impl.CompanyRepositoryImpl;
import com.docs.invoice.spring.repository.impl.InvoiceRepositoryImpl;
import com.docs.invoice.spring.repository.impl.ItemRepositoryImpl;
import org.springframework.context.annotation.Import;

@Import({
    CompanyRepositoryImpl.class,
    InvoiceRepositoryImpl.class,
    ItemRepositoryImpl.class
})
public class RepositoryConfiguration {
}
