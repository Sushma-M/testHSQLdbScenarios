/*Copyright (c) 2015-2016 wavemakervcs1.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemakervcs1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemakervcs1.com*/

package com.wavemakervcs1.testsampledb738.hrdb23.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.wavemakervcs1.testsampledb738.hrdb23.*;

/**
 * Service object for domain model class Orders.
 * @see com.wavemakervcs1.testsampledb738.hrdb23.Orders
 */

public interface OrdersService {
   /**
	 * Creates a new orders.
	 * 
	 * @param created
	 *            The information of the created orders.
	 * @return The created orders.
	 */
	public Orders create(Orders created);

	/**
	 * Deletes a orders.
	 * 
	 * @param ordersId
	 *            The id of the deleted orders.
	 * @return The deleted orders.
	 * @throws EntityNotFoundException
	 *             if no orders is found with the given id.
	 */
	public Orders delete(Integer ordersId) throws EntityNotFoundException;

	/**
	 * Finds all orderss.
	 * 
	 * @return A list of orderss.
	 */
	public Page<Orders> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Orders> findAll(Pageable pageable);
	
	/**
	 * Finds orders by id.
	 * 
	 * @param id
	 *            The id of the wanted orders.
	 * @return The found orders. If no orders is found, this method returns
	 *         null.
	 */
	public Orders findById(Integer id) throws EntityNotFoundException;
	/**
	 * Updates the information of a orders.
	 * 
	 * @param updated
	 *            The information of the updated orders.
	 * @return The updated orders.
	 * @throws EntityNotFoundException
	 *             if no orders is found with given id.
	 */
	public Orders update(Orders updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the orderss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the orders.
	 */

	public long countAll();


    public Page<Orders> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

