package com.betrybe.agrix.controller;


import com.betrybe.agrix.controller.dto.CropDto;
import com.betrybe.agrix.model.entity.Crop;
import com.betrybe.agrix.service.CropService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller by Crop.
 */
@RestController
@RequestMapping("/crops")
public class CorpController {

  private final CropService cropService;

  @Autowired
  public CorpController(CropService cropService) {
    this.cropService = cropService;
  }

  /**
   * Get Returns List Crops.
   */
  @GetMapping
  public List<CropDto> findAll() {
    List<Crop> crops = cropService.findAll();
    return crops.stream()
        .map(CropDto::fromEntity)
        .toList();
  }
}
