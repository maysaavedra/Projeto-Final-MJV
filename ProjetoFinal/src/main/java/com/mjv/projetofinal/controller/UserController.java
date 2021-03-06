package com.mjv.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mjv.projetofinal.model.User;
import com.mjv.projetofinal.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	@Autowired
	public void setUserRepository(UserRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(path = "/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping(path = "/users/add", method = RequestMethod.GET)
	public String createUser(Model model) {
		model.addAttribute("user", new User());
		return "edit";
	}

	@RequestMapping(path = "users", method = RequestMethod.POST)
	public ModelAndView saveUser(User user) {
		repository.save(user);
		return index();
	}

	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public ModelAndView getAllUsers(Model model) {
		ModelAndView mv = new ModelAndView("users");
		model.addAttribute("users", repository.findAll());
		return mv;
	}

	@RequestMapping(path = "/users/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editUser(Model model, @PathVariable(value = "id") Integer id) {
		ModelAndView mv = new ModelAndView("edit");		
		model.addAttribute("user", repository.findById(id));
		return mv;
	}

	@RequestMapping(path = "/users/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable(name = "id") Integer id) {
		repository.deleteById(id);
		return index();
	}
}
