package br.edu.infnet.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.infnet.springmvc.model.Game;

@Controller
public class LocadoraController {
	@RequestMapping(value = "/busca", method = RequestMethod.GET)
	public ModelAndView user() {
		Game game = new Game();

		ModelAndView modelAndView = new ModelAndView("busca", "command", game);

		return modelAndView;
	}

	@RequestMapping(value = "/resultado", method = RequestMethod.POST)
	public String resultado(@ModelAttribute("games") Game game, ModelMap model) {
		model.addAttribute("titulo", game.getTitulo());

		return "resultado";
	}
}