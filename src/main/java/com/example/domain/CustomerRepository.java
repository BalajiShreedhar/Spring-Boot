package com.example.domain;

import org.hibernate.persister.entity.Loadable;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Balaji on 04-12-2015.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {


}
