package com.charlie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gallery")
public class PhotoEntity {
  @Id 
  @Column(name="id")
  Integer photoId;

  @Column(name="photoblob")
  String photoBlob;
  
  public PhotoEntity() {
	  super();
  };
  
  public PhotoEntity(Integer id) {
	  this();
	  this.photoId=id;
  }

public int getPhotoId() {
	return photoId;
}

public void setPhotoId(Integer photoId) {
	this.photoId = photoId;
}

public String getPhotoBlob() {
	return photoBlob;
}

public void setPhotoBlob(String photoBlob) {
	this.photoBlob = photoBlob;
};
  
}
