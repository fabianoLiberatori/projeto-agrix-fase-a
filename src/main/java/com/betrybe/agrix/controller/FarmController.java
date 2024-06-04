package com.betrybe.agrix.controller;


import com.betrybe.agrix.controller.dto.FarmDto;
import com.betrybe.agrix.model.entity.Farm;
import com.betrybe.agrix.service.FarmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller by Farm.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {

  private final FarmService farmService;

  @Autowired
  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * Get Returns List Farms.
   */
  @GetMapping
  public List<FarmDto> findAll() {
    List<Farm> farms = farmService.findAll();
    return farms.stream()
        .map(FarmDto::fromEntity)
        .toList();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public FarmDto save(@RequestBody FarmDto farm) {
    Farm savedFarm = farmService.create(farm.toEntity());
    return FarmDto.fromEntity(savedFarm);
  }

}
