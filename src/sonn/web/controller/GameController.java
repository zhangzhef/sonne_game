package sonn.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sonn.web.entity.User;
import sonn.web.mapper.UserMapper;

/**
* @ClassName: GameController 
* @Description: the controller of game
* @author sonne
* @date 2017-1-7 16:20:16 
* @version 1.0
 */
@Controller
@RequestMapping("/game")
public class GameController {
	
	@Resource(name = "userMapper")
	private UserMapper userMapper;
	
	@RequestMapping(value = "/lst", method = RequestMethod.GET)
	public String submit(HttpServletRequest request,Model model) throws Exception {
		List<User> usr_lst = userMapper.findAll(); 
		model.addAttribute("lst", usr_lst);
		return "game_lst";
	}
}
