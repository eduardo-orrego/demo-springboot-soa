package org.xuaxpedia.springboot.soa.rest.simplerestyml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.xuaxpedia.springboot.soa.rest.simplerestyml.model.DemoModel;

@Repository
public interface DemoRepository extends JpaRepository<DemoModel, Long> {

}
