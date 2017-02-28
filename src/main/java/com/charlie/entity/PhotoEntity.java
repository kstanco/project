package com.charlie.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gallery")
public class PhotoEntity {
	@Id
	@SequenceGenerator(name = "gallery_id")
	@Column(name = "id")
	Integer photoId;

	@Column(name = "photoblob")
	String photoBlob;

	@Column(name = "date_added", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public PhotoEntity() {
		super();
	};

	public PhotoEntity(Integer id) {
		this();
		this.photoId = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
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
