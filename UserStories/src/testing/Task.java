package testing;

public class Task {
  private String id;
  private String title;
  private String details;

  //constrction method 
  public Task(String id, String title, String details) {
      this.id = id;
      this.title = title;
      this.details = details;
  }

  public String getId() { return id; }

  public String getTitle() { return title; }

  public String getDetails() { return details; }
  
  

}
