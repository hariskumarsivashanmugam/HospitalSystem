/*
 *
 */
package global.coda.hms.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import global.coda.hms.models.sampleModel;

/**
 * The Interface Repos.
 */
@Component
@Repository
public interface Repos extends CrudRepository<sampleModel, Integer> {

}
