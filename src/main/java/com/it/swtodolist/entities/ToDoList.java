package com.it.swtodolist.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data @ToString
@Entity
public class ToDoList implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String nomToDoList;
	private String nomUser;
	private Date dateCreation;

}
