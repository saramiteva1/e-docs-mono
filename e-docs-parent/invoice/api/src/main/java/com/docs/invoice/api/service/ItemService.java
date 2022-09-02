package com.docs.invoice.api.service;


import com.docs.invoice.api.domain.Item;

import java.util.Set;

public interface ItemService {
      Item saveItem(Item item);
      Set<Item> getAllItems();
      Item getItem(long id);
      void removeItem(long id);
}
