package com.docs.invoice.spring.mapper;

import com.docs.invoice.api.domain.Item;
import com.docs.invoice.spring.dto.in.ItemIn;
import com.docs.invoice.spring.dto.out.ItemOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface ItemMapper {
  @Mapping(source = "itemIn.quantity", target = "quantity")
  @Mapping(source = "itemIn.quantityTypeEnum", target = "quantityTypeEnum")
  @Mapping(source = "itemIn.price", target = "price")
  @Mapping(source = "itemIn.invoices", target = "invoices")

  Item updateItem(ItemIn itemIn, @MappingTarget Item item);
  Item toEntity(ItemIn itemIn);
  ItemOut toDto(Item invoice);
}
