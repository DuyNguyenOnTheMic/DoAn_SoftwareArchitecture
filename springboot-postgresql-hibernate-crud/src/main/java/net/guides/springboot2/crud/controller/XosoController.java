package net.guides.springboot2.crud.controller;

import net.guides.springboot2.crud.model.Xoso;
import net.guides.springboot2.crud.repository.XosoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class XosoController {
	@Autowired
	private XosoRepository xosoRepository;

	@Cacheable("XoSoCache")
	@GetMapping("/xoso")
	public List<Xoso> getAllDruginfo() {
		return xosoRepository.findAll();
	}

	/*
	@GetMapping("/druginfo/{id}")
	public ResponseEntity<Druginfo> getDruginfoById(@PathVariable(value = "id") String id)
			throws ResourceNotFoundException {
		Druginfo druginfo = druginfoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		return ResponseEntity.ok().body(druginfo);
	}

	@PostMapping("/employees")
	public Druginfo createEmployee(@Valid @RequestBody Druginfo druginfo) {
		return druginfoRepository.save(druginfo);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Druginfo> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Druginfo druginfoDetails) throws ResourceNotFoundException {
		Druginfo druginfo = druginfoRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		druginfo.setEmailId(druginfoDetails.getEmailId());
		druginfo.setLastName(druginfoDetails.getLastName());
		druginfo.setFirstName(druginfoDetails.getFirstName());
		final Druginfo updatedDruginfo = druginfoRepository.save(druginfo);
		return ResponseEntity.ok(updatedDruginfo);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Druginfo druginfo = druginfoRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		druginfoRepository.delete(druginfo);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}*/
}
