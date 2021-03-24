package entitiesE120;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
      
	   private Date moment;
	   private String title;
	   private String content;
	   private Integer likes;
	   
	   private List<Comment> list = new ArrayList<>();
	   
	   public Post() {
		   
       }

	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
    
	public void addComment(Comment comment) {
		   list.add(comment);
	}
	   
	public void removeComment(Comment comment) {
		   list.remove(comment);
	}

   







}