/**
 * 
 */
package com.example.springboot.services;

import java.util.List;

/**
 * @author Ankur
 *
 */
public interface DataService<E> {
	
	public List<E> getData();

}
