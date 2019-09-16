package mdfile.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import mdfile.dto.ProjectDTO;

@Repository("ProjectRepo")
public class ProjectRepo {

	public ProjectDTO getProjectDetail() {
		return null;
	}

	public ProjectDTO getProjectDetail(int projectId) {
		ProjectDTO projectDTO=new ProjectDTO();
		List<ProjectDTO> projectList=prepareProjectData();
		for(ProjectDTO projectDTO1:projectList){
			if(projectDTO1.getId() == projectId ){
				projectDTO=projectDTO1;
				break;
			}
		}
		return projectDTO;
	}
	
	private List<ProjectDTO> prepareProjectData() {
		List<ProjectDTO> projectDTOs= new ArrayList<>();
		ProjectDTO projectDTO=new ProjectDTO();
		projectDTO.setId(1);
        projectDTO.setProject("Project 2020");
        projectDTO.setTitle("Upgrading with features for 2020 Expo");
        projectDTO.setUrl("http:\\Project2020.url");
		
		ProjectDTO projectDTO2=new ProjectDTO();
		projectDTO2.setId(2);
        projectDTO2.setProject("VAT Upgrade");
        projectDTO2.setTitle("Introduction of facility to add VAT");
        projectDTO2.setUrl("http:\\VATUpgrade.url");
		
		projectDTOs.add(projectDTO);
		projectDTOs.add(projectDTO2);
		return projectDTOs;
	}

}
