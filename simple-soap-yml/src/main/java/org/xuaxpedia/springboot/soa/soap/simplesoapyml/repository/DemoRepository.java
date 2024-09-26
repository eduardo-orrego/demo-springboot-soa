package org.xuaxpedia.springboot.soa.soap.simplesoapyml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.model.DemoModel;

@Repository
public interface DemoRepository extends JpaRepository<DemoModel, Long> {

}
