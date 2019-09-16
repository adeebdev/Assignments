package mdfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;
import java.util.ArrayList;
import java.util.List;

import mdfile.dto.UserDTO;
import mdfile.dto.ProjectDTO;
import mdfile.services.ProjectService;
import mdfile.services.UserService;

@RestController()
public class ProjectController {
	
	@Autowired
	private ProjectService projectService; 
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/projects/{username}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UserDTO getUserProjects(@PathVariable String username) {
		return userService.getUserDetail(username);
	}

	@RequestMapping(value = "/projects/{username}/{project_id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ProjectDTO getProjectById(@PathVariable String username, @PathVariable int project_id) {
		return projectService.getProjectDetail(project_id);
	}
}
