package com.docs.invoice.core.repository;

import com.docs.invoice.api.domain.Item;

import java.util.Set;

public interface ItemRepository {
  Item saveItem(Item item);
  Set<Item> getAllItems();
  Item getItem(long id);
  void removeItem(long id);
}
