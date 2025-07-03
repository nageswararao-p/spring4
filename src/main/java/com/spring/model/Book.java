/**
 * 
 */
package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author nages
 *
 */
@Entity(name = "Book")
public class Book {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String author;
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the title
 */
public String getTitle() {
	return title;
}
/**
 * @param title the title to set
 */
public void setTitle(String title) {
	this.title = title;
}
/**
 * @return the author
 */
public String getAuthor() {
	return author;
}
/**
 * @param author the author to set
 */
public void setAuthor(String author) {
	this.author = author;
}

}
