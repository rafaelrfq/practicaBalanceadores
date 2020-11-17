package edu.pucmm.eict.balanceadores.controllers;

import edu.pucmm.eict.balanceadores.entities.GradedPoll;
import edu.pucmm.eict.balanceadores.entities.Poll;
import edu.pucmm.eict.balanceadores.services.GradedPollServices;
import edu.pucmm.eict.balanceadores.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/polls")
public class PollController {
    @Autowired
    private GradedPollServices pollServices;
    @Autowired
    private UserServices userServices;
    private Poll poll = new Poll();

    @GetMapping("create")
    public String createPoll(Model model){
        model.addAttribute("poll", poll);

        return "/polls/create";
    }

    @PostMapping("create")
    public String createdPoll(@ModelAttribute("gradedPoll")GradedPoll poll, Principal principal){
        System.out.println("User: " + principal.getName() + " created the poll");
        GradedPoll gPoll = new GradedPoll(
                poll.getValueQuestion1(),
                poll.getValueQuestion2(),
                poll.getValueQuestion3(),
                poll.getValueQuestion4(),
                userServices.findUserByUsername(principal.getName()));
        pollServices.createGradedPoll(gPoll);
        return "redirect:/";
    }

    @GetMapping("list")
    public String pollList(Model model){
        model.addAttribute("polls", pollServices.findAllGradedPolls());
        return "/polls/list";
    }

}
