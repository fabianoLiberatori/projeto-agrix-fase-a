package com.betrybe.agrix.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity by crop.
 */
@Entity
@Table(name = "crops")
public class Crop {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long farmId;
  private String name;
  private Double plantedArea;


  public Crop() {
  }

  public Long getId() {
    return id;
  }

  public Long getFarmId() {
    return farmId;
  }

  public String getName() {
    return name;
  }

  public Double getPlantedArea() {
    return plantedArea;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setPlanted_area(Double plantedArea) {
    this.plantedArea = plantedArea;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFarm_id(Long farmId) {
    this.farmId = farmId;
  }
}
