/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 16, 2020
 */
package com.learnswagger.demo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author raghavdutta
 *
 */
public interface IEmployeeRespository extends PagingAndSortingRepository<Employee, Long>{}


