/*Copyright (c) 2015-2016 wavemakervcs1.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemakervcs1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemakervcs1.com*/


package com.wavemakervcs1.testsampledb738.hrdb23.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface Hrdb23ProcedureExecutorService {

	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

