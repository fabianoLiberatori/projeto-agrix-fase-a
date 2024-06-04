package com.betrybe.agrix.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity by farm.
 */
@Entity
@Table(name = "farms")
public class Farm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Double size;

  public Farm() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getSize() {
    return size;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(Double size) {
    this.size = size;
  }
}
