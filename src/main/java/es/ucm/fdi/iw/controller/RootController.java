package es.ucm.fdi.iw.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import es.ucm.fdi.iw.model.User;
import es.ucm.fdi.iw.service.SkillService;
import es.ucm.fdi.iw.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/**
 *  Non-authenticated requests only.
 */
@Controller
public class RootController {

    private static final Logger log = LogManager.getLogger(RootController.class);

    @ModelAttribute
    public void populateModel(HttpSession session, Model model) {        
        for (String name : new String[] {"u", "url", "ws"}) {
            model.addAttribute(name, session.getAttribute(name));
        }
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("actual", "inicio");

        List<User> recusers = UserService.getRecommendedUsers();
        List<User> otherusers = UserService.getPopularUsers();
        List<String> desiredSkills = SkillService.getRequestedSkills();
        List<String> commonSkills = SkillService.getCommonSkills();

        model.addAttribute("recusers", recusers);
        model.addAttribute("otherusers", otherusers);
        model.addAttribute("desiredSkills", desiredSkills);
        model.addAttribute("commonSkills", commonSkills);

        return "index";
    }

	@GetMapping("/login")
    public String login(Model model, HttpServletRequest request) {
        boolean error = request.getQueryString() != null && request.getQueryString().indexOf("error") != -1;
        model.addAttribute("loginError", error);
        return "login";
    }

    @GetMapping("/rewards")
    public String rewards(Model model) {
        return "rewards";
    }

   @GetMapping("/search")
    public String search(@RequestParam(name = "query", required = false) String username, Model model) {
        model.addAttribute("query", username);
        return "search";
    }
}
