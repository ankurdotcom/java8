/**
 * 
 */
package com.example.springboot.services.data;

import java.util.List;

/**
 * @author Ankur
 *
 */
@FunctionalInterface
public interface DataService<E> {
	
	public List<E> getData();

}
