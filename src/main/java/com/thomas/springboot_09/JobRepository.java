package com.thomas.springboot_09;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long>
{

}
