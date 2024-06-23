package com.health.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass //class level run time annotation
//(meant for hibernate) -- to tell hibernate following is super 
//class , from which all other entities will inherit , 
//don't create any table
@NoArgsConstructor
@Getter
@Setter
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY
)
	private Long id;
	@CreationTimestamp //adds current date when the entity is created(only once!)
	@Column(name="creation_date")
	private LocalDate creationDate;
	@UpdateTimestamp//adds the current date every time the entity is updated
	@Column(name="updated_on")
	private LocalDateTime updatedOn;
	
	@PrePersist
	public void onCreate() {
		creationDate=LocalDate.now();
		updatedOn = LocalDateTime.now();
	}
	
	@PreUpdate
	public void onUpdate() {
		updatedOn=LocalDateTime.now();
	}
	
	public Long getId() {
		return id;
	}
}