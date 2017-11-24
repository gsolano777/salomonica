package org.ict.salomonica.repository;

import java.util.List;

import org.ict.salomonica.entity.Report5x7;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface Report5x7Repository extends CrudRepository<Report5x7, Long>{
	
	List<Report5x7> findByPersonIdOrderByYearDescWeekDesc(long personId, Pageable pageable);
	

}
