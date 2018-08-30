package com.hendisantika.springbootdatatables;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatables
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/08/18
 * Time: 06.59
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeRepository extends DataTablesRepository<Employee, Integer> {
}