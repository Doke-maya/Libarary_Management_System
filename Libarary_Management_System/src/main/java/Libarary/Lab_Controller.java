package Libarary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("books")
public class Lab_Controller {
	@Autowired
	private Lab_ServiceDao dao;

	@PostMapping("names")
	public Lab_Entity postmethod(@RequestBody Lab_Entity labentity) {
		// TODO: process POST request

		return dao.save(labentity);
	}

	@GetMapping("getdata")
	public List<Lab_Entity> get() {
		return dao.findAll();

	}

	@GetMapping("getby/{id}")
	public Optional<Lab_Entity> getbyid(@PathVariable int id) {
		return dao.findById(id);
	}

	@DeleteMapping("deleteby/{id}")
	public ResponseEntity<String> deleteid(@PathVariable int id) {
		dao.deletebyid(id);
		return ResponseEntity.ok("delete id successfully :-" + id);
	}

	// pending its not getting me response
	@DeleteMapping("deleteby/{name}")
	public ResponseEntity<String> deletename(@PathVariable String name) {
		dao.deleteByName(name);
		return ResponseEntity.ok("delete name successfully :-" + name);

	}

	@PutMapping("path/{id}")
	public Lab_Entity putMethod(@PathVariable int id, @RequestBody Lab_Entity entity) {
		//TODO: process PUT request
		
		return dao.update(id,entity);
	}
}
