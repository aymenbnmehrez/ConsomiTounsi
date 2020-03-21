package tn.consomiTounsi.spring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class RatingPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long user_id;
	private Long post_id;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getPost_id() {
		return post_id;
	}
	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
