package org.xuaxpedia.springboot.soa.rest.simplerestprop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.xuaxpedia.springboot.soa.rest.simplerestprop.model.DemoModel;

@Repository
public interface DemoRepository extends JpaRepository<DemoModel, Long> {

}
