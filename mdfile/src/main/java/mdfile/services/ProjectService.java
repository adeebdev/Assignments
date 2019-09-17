package mdfile.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;

import mdfile.dto.ProjectDTO;
import mdfile.repository.ProjectRepo;

@Service("ProjectService")
@Component
public class ProjectService {

	@Autowired
	private ProjectRepo projectRepo;
	
	@Transactional
	public ProjectDTO getProjects() {
		return projectRepo.getProjectDetail();

	}
	
	public ProjectDTO getProjectDetail(int project_id) {
		return projectRepo.getProjectDetail(project_id);
	}
}
