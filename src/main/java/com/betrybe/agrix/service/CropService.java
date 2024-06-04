package com.betrybe.agrix.service;

import com.betrybe.agrix.model.entity.Crop;
import com.betrybe.agrix.model.repository.CropRepository;
import com.betrybe.agrix.service.exception.CropNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service by Crop.
 */
@Service
public class CropService {

  private final CropRepository cropRepository;

  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
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
}
