package org.app.service.entities;

import javax.persistence.Entity;

@Entity
public class ProjectManager extends User{
	
	private String comment;
	private Bugs titleBug;
	public ProjectManager(String userName, String password, String email, String role, String comment, Bugs titleBug) {
		super(userName, password, email, role);
		this.comment = comment;
		this.titleBug = titleBug;
	}
	public ProjectManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectManager(String userName, String password, String email, String role) {
		super(userName, password, email, role);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((titleBug == null) ? 0 : titleBug.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectManager other = (ProjectManager) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (titleBug == null) {
			if (other.titleBug != null)
				return false;
		} else if (!titleBug.equals(other.titleBug))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProjectManager [comment=" + comment + ", titleBug=" + titleBug + "]";
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Bugs getTitleBug() {
		return titleBug;
	}
	public void setTitleBug(Bugs titleBug) {
		this.titleBug = titleBug;
	}
	

}
