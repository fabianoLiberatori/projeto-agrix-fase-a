package com.betrybe.agrix.service;

import com.betrybe.agrix.model.entity.Crop;
import com.betrybe.agrix.model.entity.Farm;
import com.betrybe.agrix.model.repository.CropRepository;
import com.betrybe.agrix.service.exception.CropNotFoundException;
import com.betrybe.agrix.service.exception.FarmNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service by Crop.
 */
@Service
public class CropService {

  private final CropRepository cropRepository;
  private final FarmService farmService;

  @Autowired
  public CropService(CropRepository cropRepository, FarmService farmService) {
    this.cropRepository = cropRepository;
    this.farmService = farmService;
  }

  public Crop findById(long id) throws CropNotFoundException {
    return null;
  }

  public List<Crop> findAll() {
    return List.of();
  }

  public Crop create(Crop crop) {
    return null;
  }

  /**
   * Create Crop with FarmId.
   */
  public Crop createCrop(Crop crop, long farmId) throws FarmNotFoundException {
    Farm farm = farmService.findById(farmId);

    crop.setFarm(farm);

    return cropRepository.save(crop);
  }
}
