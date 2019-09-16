package com.projects.mdfile;

public class Project {
    private int _id;
    private String _project;
    private String _title;
    private String _url;


    public Project() {  
        this.setId(1);
        this.setProject("new");
        this.setTitle("to define");
        this.setUrl("http:\\test.url");
    }
      public Project(int id, String project, String title, String url, String username) {
        this.setId(id);
        this.setProject(project);
        this.setTitle(title);
        this.setUrl(url);
    }

public int getId()
{
    return _id;
}
public String getProject()
{
    return _project;
}
public String getTitle()
{
    return _title;
}
public String getUrl()
{
    return _url;
}

public void setId(int id)
{
    _id = id;
}
public void setProject(String project)
{
    _project = project;
}
public void setTitle(String title)
{
    _title = title;
}
public void setUrl(String url)
{
    _url = url;
}


}