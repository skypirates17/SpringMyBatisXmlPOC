package com.poc.serviceimpl;
/**
 * put here all the useful methods for every services
 * @author joliveros
 *
 */
public class BaseService {
	/**
	 * checking of result from CRUD
	 * @param resultFlagger
	 * @return 
	 */
	public boolean resultChecker(int resultFlagger){
		boolean result;
		if(resultFlagger>0){
			result = true;
		}else{
			result = false;
		}
		return result;
	}
}
