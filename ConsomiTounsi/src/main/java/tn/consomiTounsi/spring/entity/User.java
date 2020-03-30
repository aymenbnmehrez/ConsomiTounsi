package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long id; // Clé primaire
	
	@Column(name = "USER_USERNAME" , nullable=false,unique=true)
	private String username;
	
	@Column(name = "USER_PASSWORD" , nullable=false)
	private String password;
	
	@Column(name = "USER_FN")
	private String firstName;
	
	@Column(name = "USER_LN")
	private String lastName;
	
	@Column(name = "USER_EMAIL")
	private String email;
	
	@Column(name = "USER_IMAGE")
	private String image;
	
	@Column(name = "USER_PHONE")
	private int phoneNbr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPhoneNbr() {
		return phoneNbr;
	}

	public void setPhoneNbr(int phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", image=" + image + ", phoneNbr=" + phoneNbr + "]";
	}
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="users")
	private Set<Post> posts;

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	@OneToMany(cascade = CascadeType.ALL,mappedBy="users")
	private Set<Comment> comments;

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}



	
}
