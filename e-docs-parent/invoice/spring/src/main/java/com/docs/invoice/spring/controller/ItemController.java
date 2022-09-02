package com.docs.invoice.spring.controller;

import com.docs.invoice.api.service.ItemService;
import com.docs.invoice.spring.dto.in.ItemIn;
import com.docs.invoice.spring.dto.out.ItemOut;
import com.docs.invoice.spring.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/invoice/item")
@RequiredArgsConstructor
public class ItemController {

  private final ItemService itemService;
  private final ItemMapper mapper;


  @GetMapping
  public Set<ItemOut> getItems(){
    return itemService.getAllItems().stream().map(mapper::toDto).collect(Collectors.toSet());
  }


  @GetMapping("/{id}")
  public ItemOut getItem(@PathVariable long id){
    return mapper.toDto(itemService.getItem(id));
  }



  @PostMapping("/add")
  public void saveItem(@RequestBody ItemIn item){
    itemService.saveItem(mapper.toEntity(item));
  }


  @PutMapping("/{id}")
  public void updateItem(@PathVariable long id,
                         @RequestBody ItemIn item){
    itemService.saveItem(mapper.updateItem(item, itemService.getItem(id)));
  }


  @DeleteMapping("delete/{id}")
  public void deleteItem(@PathVariable long id){
    itemService.removeItem(id);
  }
}
