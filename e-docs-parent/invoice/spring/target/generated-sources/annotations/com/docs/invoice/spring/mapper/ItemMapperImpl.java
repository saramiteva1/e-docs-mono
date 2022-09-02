package com.docs.invoice.spring.mapper;

import com.docs.invoice.api.domain.Invoice;
import com.docs.invoice.api.domain.Item;
import com.docs.invoice.api.domain.Item.ItemBuilder;
import com.docs.invoice.spring.dto.in.ItemIn;
import com.docs.invoice.spring.dto.out.ItemOut;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-02T12:08:46+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
public class ItemMapperImpl implements ItemMapper {

    @Override
    public Item updateItem(ItemIn itemIn, Item item) {
        if ( itemIn == null ) {
            return null;
        }

        item.setQuantity( itemIn.getQuantity() );
        item.setQuantityTypeEnum( itemIn.getQuantityTypeEnum() );
        item.setPrice( itemIn.getPrice() );
        if ( item.getInvoices() != null ) {
            Set<Invoice> set = itemIn.getInvoices();
            if ( set != null ) {
                item.getInvoices().clear();
                item.getInvoices().addAll( set );
            }
            else {
                item.setInvoices( null );
            }
        }
        else {
            Set<Invoice> set = itemIn.getInvoices();
            if ( set != null ) {
                item.setInvoices( new HashSet<Invoice>( set ) );
            }
        }

        return item;
    }

    @Override
    public Item toEntity(ItemIn itemIn) {
        if ( itemIn == null ) {
            return null;
        }

        ItemBuilder item = Item.builder();

        item.quantity( itemIn.getQuantity() );
        item.quantityTypeEnum( itemIn.getQuantityTypeEnum() );
        item.price( itemIn.getPrice() );
        Set<Invoice> set = itemIn.getInvoices();
        if ( set != null ) {
            item.invoices( new HashSet<Invoice>( set ) );
        }

        return item.build();
    }

    @Override
    public ItemOut toDto(Item invoice) {
        if ( invoice == null ) {
            return null;
        }

        ItemOut itemOut = new ItemOut();

        itemOut.setId( invoice.getId() );
        itemOut.setQuantity( invoice.getQuantity() );
        itemOut.setQuantityTypeEnum( invoice.getQuantityTypeEnum() );
        itemOut.setPrice( invoice.getPrice() );
        Set<Invoice> set = invoice.getInvoices();
        if ( set != null ) {
            itemOut.setInvoices( new HashSet<Invoice>( set ) );
        }

        return itemOut;
    }
}
