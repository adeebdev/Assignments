package com.projects.mdfile;

public class User {
    private String _username;
    private String _name;
    private Project[] _projects;


    public User() {  this.setUsername("adeebh");
        this.setName("Adeeb Hussain"); }

      public User(String username, String name, Project[] projects) {
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

public Project[] getProjects()
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

public void setProjects(Project[]  projects)
{
    _projects = projects;
}
    
}