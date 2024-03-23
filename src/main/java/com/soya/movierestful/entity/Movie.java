package com.soya.movierestful.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MOVIE_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	@Id
	@GeneratedValue
	private int id; 
	
	private String 	title;
	private String 	description; 
	private Float 	rating; 
	private String 	image; 
	
    @CreationTimestamp
    private String created_at;
    
    @UpdateTimestamp  
    private String updated_at;

}
