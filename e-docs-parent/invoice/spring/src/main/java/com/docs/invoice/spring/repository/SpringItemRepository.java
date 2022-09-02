package com.docs.invoice.spring.repository;

import com.docs.invoice.api.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringItemRepository  extends JpaRepository<Item,Long> {
  Item findItemBy(Long id);
}
