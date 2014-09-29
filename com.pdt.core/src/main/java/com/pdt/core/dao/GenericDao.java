package com.pdt.core.dao;

import java.util.List;

import com.pdt.core.model.BaseEntity;

/**
 * 
 * <p>
 * Interface provides all generic method for select or manipulate base entities
 * <p>
 * 
 * @author hungpx
 * 
 * @version 0.1
 * 
 */
public interface GenericDao {

	<T extends BaseEntity> T findById(Class<T> type, long id);

	<T extends BaseEntity> List<T> findAll(Class<T> type);

	<T extends BaseEntity> T insert(T entity);

	<T extends BaseEntity> List<T> insert(final List<T> entities);

	void remove(Object entity);

	<T extends BaseEntity> T update(T entity);
}
