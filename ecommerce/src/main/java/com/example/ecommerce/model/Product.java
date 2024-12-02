
package com.example.ecommerce.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
	public byte[] getImageData() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getImageType() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setImageName(String originalFilename) {
		// TODO Auto-generated method stub
		
	}
	public void setImageType(String contentType) {
		// TODO Auto-generated method stub
		
	}
	public void setImageData(byte[] bytes) {
		// TODO Auto-generated method stub
		
	}
}
