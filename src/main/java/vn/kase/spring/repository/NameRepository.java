package vn.kase.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.kase.spring.entity.Name;

@Repository
public interface NameRepository extends CrudRepository<Name, Integer> {
    Optional<Name> findOneByShortName(String shortName);
}
