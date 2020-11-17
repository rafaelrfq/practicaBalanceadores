package edu.pucmm.eict.balanceadores.controllers;

import edu.pucmm.eict.balanceadores.entities.GradedPoll;
import edu.pucmm.eict.balanceadores.entities.Poll;
import edu.pucmm.eict.balanceadores.services.GradedPollServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    private GradedPollServices gradedPollServices;
    private Poll poll = new Poll();

    @GetMapping("/")
    public String getHome(Model model, Principal principal){
        model.addAttribute("user", principal);
        return "home";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        int question1[], question2[], question3[];
        question1 = new int[]{0,0,0,0,0};
        question2 = new int[]{0,0,0,0,0};
        question3 = new int[]{0,0,0,0,0};

        for(GradedPoll p : gradedPollServices.findAllGradedPolls()){
            switch (p.getValueQuestion1()){
                case 1:
                    question1[0]++;
                    break;
                case 2:
                    question1[1]++;
                    break;
                case 3:
                    question1[2]++;
                    break;
                case 4:
                    question1[3]++;
                    break;
                case 5:
                    question1[4]++;
                    break;
                default:
                    break;
            }

            switch (p.getValueQuestion2()){
                case 1:
                    question2[0]++;
                    break;
                case 2:
                    question2[1]++;
                    break;
                case 3:
                    question2[2]++;
                    break;
                case 4:
                    question2[3]++;
                    break;
                case 5:
                    question2[4]++;
                    break;
                default:
                    break;
            }

            switch (p.getValueQuestion3()){
                case 1:
                    question3[0]++;
                    break;
                case 2:
                    question3[1]++;
                    break;
                case 3:
                    question3[2]++;
                    break;
                case 4:
                    question3[3]++;
                    break;
                case 5:
                    question3[4]++;
                    break;
                default:
                    break;
            }
        }

        model.addAttribute("poll", poll);
        model.addAttribute("question1", question1);
        model.addAttribute("question2", question2);
        model.addAttribute("question3", question3);
        return "dashboard";
    }
}
