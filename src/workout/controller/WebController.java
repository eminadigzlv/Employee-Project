package az.workout.controller;


import az.workout.service.CandidateService;
import az.workout.service.CompanyService;
import az.workout.service.impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class WebController {
    @Autowired
     private JobServiceImpl  jobService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private CandidateService candidateService;

    @GetMapping("/")
    public ModelAndView index()
    {  ModelAndView modelAndView= new ModelAndView("web/index");
        modelAndView.addObject("JobCount",jobService.getJobCount());
        modelAndView.addObject("JobCategoryCount",jobService.getJobCategoryCount());
        modelAndView.addObject("RecentJobs",jobService.recentJobs());
        modelAndView.addObject("topHiringCompany",companyService.topHiringCompany());
        modelAndView.addObject("CandidatesCount",candidateService.candidatesCount());
        modelAndView.addObject("CompaniesCount",companyService.companiesCount());

        return modelAndView ;
    }

    @GetMapping("/login")
    public String login()
    {
        return  "web/login";
    }

    @GetMapping("/register")
    public  String register()
    { return  "web/register";
    }


}
