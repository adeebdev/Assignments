package mdfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mdfile.dto.UserDTO;
import mdfile.services.ProjectService;
import mdfile.services.UserService;

@RestController()
@RequestMapping("app/")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService; 
	
	@Autowired
	private UserService userService;
	
	public String getUsers() {
		System.out.println("test-----");
		return "hafiz";
	}

	
	@RequestMapping("/projects/{username}")
	public UserDTO getUserProjects(@PathVariable String username) {
		System.out.println("test-----");
		return userService.getUserDetail(username);
	}

	@RequestMapping("/projects/{username}/{project_id}")
	public String getProjectById(@PathVariable String username, @PathVariable String project_id) {
		System.out.println("test-----");
		return "Project Id: " + project_id;
	}
}
