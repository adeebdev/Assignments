package com.projects.mdfile;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TestController {

	
    @RequestMapping("/projects/{username}")
    public User getUserProjects(@PathVariable String username) {
        User emp1 = new User();
        emp1.setUsername(username);
    return emp1;
    }

    
    @RequestMapping("/projects/{username}/{project_id}")
    public String getProjectById(@PathVariable String username, @PathVariable String project_id) {
    return "Project Id: " + project_id;
    }

}