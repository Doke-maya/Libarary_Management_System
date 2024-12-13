package Libarary;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Lab_ServiceDao {
	@Autowired
	private Lab_Repository labrepo;

	public Lab_Entity save(Lab_Entity labentity) {
		// TODO Auto-generated method stub
		return labrepo.save(labentity);
	}

	public List<Lab_Entity> findAll() {
		// TODO Auto-generated method stub
		return labrepo.findAll();
	}

	public Optional<Lab_Entity> findById(int id) {
		// TODO Auto-generated method stub
		return labrepo.findById(id);
	}

	public void deletebyid(int id) {
		labrepo.deleteById(id);

	}

	public void deleteByName(String name) {
		labrepo.deleteByName(name);

	}

	public Lab_Entity update(int id, Lab_Entity entity) {
		Optional<Lab_Entity>lab=labrepo.findById(id);
		if(lab.isPresent()) {
			Lab_Entity le=lab.get();
			le.setId(entity.getId());
			le.setName(entity.getName());
			le.setAuthor(entity.getAuthor());
			le.setPrice(entity.getPrice());
			
			labrepo.save(entity);
			return le;
		}else {
			throw new RuntimeException( "data is updatetd successfully :- "+id);
		}
		
	}

}
