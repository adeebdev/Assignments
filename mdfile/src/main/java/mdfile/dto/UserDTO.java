package mdfile.dto;

public class UserDTO {
    private String _username;
    private String _name;
    private ProjectDTO[] _projects;


    public UserDTO() {
    	
    }

      public UserDTO(String username, String name, ProjectDTO[] projects) {
        this.setUsername(username);
        this.setName(name);
        this.setProjects(projects);
    }

public String getUsername()
{
    return _username;
}

public String getName()
{
    return _name;
}

public ProjectDTO[] getProjects()
{
    return _projects;
}
public void setUsername(String username)
{
    _username = username;
}

public void setName(String name)
{
    _name = name;
}

public void setProjects(ProjectDTO[]  projects)
{
    _projects = projects;
}
    
}