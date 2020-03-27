package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_POST")
public class Post implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "POST_ID")
	private Long id; // Clé primaire
	
	@Column(name = "POST_TITLE")
	private String title;
	

	

	public Post(Long id, String title, String picture, Date datePost) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.datePost = datePost;
	}

	public Post(String title, String picture, Date datePost) {
		super();
		this.title = title;
		this.picture = picture;
		this.datePost = datePost;
	}

	public Post() {
		super();
	}

	@Column(name = "POST_PICTURE", nullable = true)
	private String picture;

	@Temporal(TemporalType.DATE)
	private Date datePost;
	
	@ManyToOne
	User users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="posts")
	private Set<Comment> comments;

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public String getPicture() {
		return picture;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", picture=" + picture + ", datePost=" + datePost
				+ ", users=" + users + "]";
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	
	

}
