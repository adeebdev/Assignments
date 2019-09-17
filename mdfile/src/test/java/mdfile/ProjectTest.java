package mdfile.controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import mdfile.services.UserService;
import mdfile.services.ProjectService;
import mdfile.dto.UserDTO;
import mdfile.dto.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import mdfile.config.TestApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestApplication.class)
public class ProjectTest {
	
	@Autowired
	private ProjectService projectService; 
	
	@Autowired
	private UserService userService;
	
	@Test
	public void getUserProjects_1() {
		String username="bill";
		userService.getUserDetail(username);
	}

	@Test
	public void getUserProjects_2() {
		String username="elon";
		userService.getUserDetail(username);
	}

	@Test
	public void getProjectById_1() {
		int project_id=1;
		projectService.getProjectDetail(project_id);
	}
	
	@Test
	public void getProjectById_2() {
		int project_id=2;
		projectService.getProjectDetail(project_id);
	}
}
