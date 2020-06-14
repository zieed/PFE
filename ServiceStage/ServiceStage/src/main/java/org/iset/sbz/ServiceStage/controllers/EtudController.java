package org.iset.sbz.ServiceStage.controllers;

import org.iset.sbz.ServiceStage.models.Etudiant;

import org.iset.sbz.ServiceStage.services.IEtudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtudController {
	@Autowired
	private IEtudService etudService;
	@GetMapping("/etudslist")
	public String Etuds(Model model,@RequestParam("page")int page,@RequestParam("size")int size) {
		Page<Etudiant> etudPage=etudService.findAll(PageRequest.of(page, size));
		model.addAttribute("listEtuds", etudPage.getContent());
		model.addAttribute("tot", new int [etudPage.getTotalPages()]);
		model.addAttribute("cuurp", page);
		return "etudiantlist";
				
	}

}
