package com.docs.invoice.spring.mapper;

import com.docs.invoice.api.domain.Invoice;
import com.docs.invoice.api.domain.Invoice.InvoiceBuilder;
import com.docs.invoice.api.domain.Item;
import com.docs.invoice.spring.dto.in.InvoiceIn;
import com.docs.invoice.spring.dto.out.InvoiceOut;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-02T12:08:46+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
public class InvoiceMapperImpl implements InvoiceMapper {

    @Override
    public Invoice updateInvoice(InvoiceIn invoiceIn, Invoice invoice) {
        if ( invoiceIn == null ) {
            return null;
        }

        invoice.setFromCompany( invoiceIn.getFromCompany() );
        invoice.setToCompany( invoiceIn.getToCompany() );
        invoice.setTotalPrice( invoiceIn.getTotalPrice() );
        invoice.setTaxPercent( invoiceIn.getTaxPercent() );
        invoice.setPriceWtaX( invoiceIn.getPriceWtaX() );
        if ( invoice.getItems() != null ) {
            Set<Item> set = invoiceIn.getItems();
            if ( set != null ) {
                invoice.getItems().clear();
                invoice.getItems().addAll( set );
            }
            else {
                invoice.setItems( null );
            }
        }
        else {
            Set<Item> set = invoiceIn.getItems();
            if ( set != null ) {
                invoice.setItems( new HashSet<Item>( set ) );
            }
        }

        return invoice;
    }

    @Override
    public Invoice toEntity(InvoiceIn invoiceIn) {
        if ( invoiceIn == null ) {
            return null;
        }

        InvoiceBuilder invoice = Invoice.builder();

        invoice.fromCompany( invoiceIn.getFromCompany() );
        invoice.toCompany( invoiceIn.getToCompany() );
        invoice.totalPrice( invoiceIn.getTotalPrice() );
        invoice.taxPercent( invoiceIn.getTaxPercent() );
        invoice.priceWtaX( invoiceIn.getPriceWtaX() );
        Set<Item> set = invoiceIn.getItems();
        if ( set != null ) {
            invoice.items( new HashSet<Item>( set ) );
        }

        return invoice.build();
    }

    @Override
    public InvoiceOut toDto(Invoice invoice) {
        if ( invoice == null ) {
            return null;
        }

        InvoiceOut invoiceOut = new InvoiceOut();

        invoiceOut.setId( invoice.getId() );
        invoiceOut.setFromCompany( invoice.getFromCompany() );
        invoiceOut.setToCompany( invoice.getToCompany() );
        invoiceOut.setTotalPrice( invoice.getTotalPrice() );
        invoiceOut.setTaxPercent( invoice.getTaxPercent() );
        invoiceOut.setPriceWtaX( invoice.getPriceWtaX() );
        Set<Item> set = invoice.getItems();
        if ( set != null ) {
            invoiceOut.setItems( new HashSet<Item>( set ) );
        }

        return invoiceOut;
    }
}
