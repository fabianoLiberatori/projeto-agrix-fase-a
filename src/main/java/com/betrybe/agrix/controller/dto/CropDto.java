package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.entity.Crop;

/**
 * Methords fromEntity'n'toDTO by Crop.
 */
public record CropDto(
    Long id,
    Long farmId,
    String name,
    Double plantedArea
) {

  /**
   * Returns by Entity to DTO.
   */
  public static CropDto fromEntity(Crop corp) {
    return new CropDto(
        corp.getId(),
        corp.getFarmId(),
        corp.getName(),
        corp.getPlantedArea()
    );
  }

  /**
   * Returns by DTO to Entity.
   */
  public Crop toEntity() {
    Crop crop = new Crop();
    crop.setName(name);
    crop.setPlanted_area(plantedArea);
    return crop;
  }
}
