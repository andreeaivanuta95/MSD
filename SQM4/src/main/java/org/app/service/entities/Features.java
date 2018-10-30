package org.app.service.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Features {
	
	@Id
	@GeneratedValue
	private Integer idFeature;
	private String title;
	private ProjectManager featureOwner;
	@ManyToOne
	private Projects fromProject;
	public Features(Integer idFeature, String title, ProjectManager featureOwner, Projects fromProject) {
		super();
		this.idFeature = idFeature;
		this.title = title;
		this.featureOwner = featureOwner;
		this.fromProject = fromProject;
	}
	public Features() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdFeature() {
		return idFeature;
	}
	public void setIdFeature(Integer idFeature) {
		this.idFeature = idFeature;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ProjectManager getFeatureOwner() {
		return featureOwner;
	}
	public void setFeatureOwner(ProjectManager featureOwner) {
		this.featureOwner = featureOwner;
	}
	public Projects getFromProject() {
		return fromProject;
	}
	public void setFromProject(Projects fromProject) {
		this.fromProject = fromProject;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((featureOwner == null) ? 0 : featureOwner.hashCode());
		result = prime * result + ((fromProject == null) ? 0 : fromProject.hashCode());
		result = prime * result + ((idFeature == null) ? 0 : idFeature.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Features other = (Features) obj;
		if (featureOwner == null) {
			if (other.featureOwner != null)
				return false;
		} else if (!featureOwner.equals(other.featureOwner))
			return false;
		if (fromProject == null) {
			if (other.fromProject != null)
				return false;
		} else if (!fromProject.equals(other.fromProject))
			return false;
		if (idFeature == null) {
			if (other.idFeature != null)
				return false;
		} else if (!idFeature.equals(other.idFeature))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Features [idFeature=" + idFeature + ", title=" + title + ", featureOwner=" + featureOwner
				+ ", fromProject=" + fromProject + "]";
	}
	
	
	
}
