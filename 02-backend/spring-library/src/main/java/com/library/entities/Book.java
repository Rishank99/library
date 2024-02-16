package com.library.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="book")
@Data
// @Data annotation of lombok will dynamically create getters and setters for Book
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="description")
	private String description;
	
	@Column(name="copies")
	private int copies;
	
	@Column(name="copies_available")
	private int copiesAvailable;
	
	@Column(name="category")
	private String category;
	
	@Column(name="img")
	private String img;
}
