package io.github.sthdev.addressbook.model;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

	Person findByFirstName(String firstName);
}
