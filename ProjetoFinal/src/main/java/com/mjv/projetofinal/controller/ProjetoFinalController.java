/*
 * package com.mjv.projetofinal.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.validation.annotation.Validated; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.mjv.projetofinal.model.User; import
 * com.mjv.projetofinal.repository.UserRepository;
 * 
 * @Controller
 * 
 * @RequestMapping("/") public class ProjetoFinalController {
 * 
 * @Autowired private UserRepository repository;
 * 
 * @GetMapping("/") public ModelAndView index() { ModelAndView mv = new
 * ModelAndView("index");
 * 
 * // mv.getStatus();
 * 
 * return mv;
 * 
 * }
 * 
 * @GetMapping("/user") public ModelAndView user() { ModelAndView mvUser = new
 * ModelAndView("p1_user"); mvUser.addObject("cadastros", repository.findAll());
 * 
 * 
 * return mvUser;
 * 
 * }
 * 
 * @PostMapping("/saveUser") public ModelAndView saveForm(@Validated User user)
 * {
 * 
 * repository.save(user);
 * 
 * return user();
 * 
 * }
 * 
 * 
 * 
 * }
 */