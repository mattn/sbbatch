package io.github.mattn.sbbatch.repository;

import io.github.mattn.sbbatch.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mattn on 2016/09/07.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
