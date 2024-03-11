package univ.iwa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("filieres")
	public String getAllFilieres() {
		System.out.println("Liste filieres");
		return "Liste des filières";
	}
	@GetMapping("etudiants")
	public String getAllEtudiants() {
		System.out.println("Liste des étudiants");
		return "Liste des étudiants";
	}
	@GetMapping("etudiants/{id}")
	public String getAllEtudiants(@PathVariable String id) {
		System.out.println("Un seul étudiant");
		return "Un seul étudiants";
	}
}
