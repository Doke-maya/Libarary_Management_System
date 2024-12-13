package Libarary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Lab_Repository  extends JpaRepository<Lab_Entity, Integer>{

	Lab_Entity save(Lab_Entity labentity);

	void deleteByName(String name);

	 


}
