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

}
