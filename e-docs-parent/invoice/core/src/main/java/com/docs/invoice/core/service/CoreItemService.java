package com.docs.invoice.core.service;

import com.docs.invoice.api.domain.Item;
import com.docs.invoice.api.service.ItemService;
import com.docs.invoice.core.repository.ItemRepository;
import lombok.RequiredArgsConstructor;

import java.util.Set;
@RequiredArgsConstructor
public class CoreItemService implements ItemService {
  private final ItemRepository itemRepository;

  @Override
  public Item saveItem(Item item) {
    return itemRepository.saveItem(item);
  }

  @Override
  public Set<Item> getAllItems() {
    return itemRepository.getAllItems();
  }

  @Override
  public Item getItem(long id) {
    return itemRepository.getItem(id);
  }

  @Override
  public void removeItem(long id) {
    itemRepository.removeItem(id);
  }
}
