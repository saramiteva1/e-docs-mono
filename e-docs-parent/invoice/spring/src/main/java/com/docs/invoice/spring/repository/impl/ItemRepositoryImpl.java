package com.docs.invoice.spring.repository.impl;

import com.docs.invoice.api.domain.Item;
import com.docs.invoice.core.repository.ItemRepository;
import com.docs.invoice.spring.repository.SpringItemRepository;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {
  private final SpringItemRepository repository;

  @Override
  public Item saveItem(Item item) {
    return repository.save(item);
  }

  @Override
  public Set<Item> getAllItems() {
    return new HashSet<>(repository.findAll());
  }

  @Override
  public Item getItem(long id) {
    return repository.findItemBy(id);
  }

  @Override
  public void removeItem(long id) {
    repository.delete(repository.findItemBy(id));
  }
}
