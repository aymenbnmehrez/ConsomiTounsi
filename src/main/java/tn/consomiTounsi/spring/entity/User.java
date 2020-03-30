package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "T_USER")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	    name="role",
	    discriminatorType=DiscriminatorType.STRING
	    )
public  class User implements Serializable{//, UserDetails

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long id; // Clé primaire
	
	@Column(name = "USER_USERNAME" , nullable=false,unique=true)
	private String username;
	
	@Column(name = "USER_PASSWORD" , nullable=false)
	private String password;
	
	@Column(name = "USER_FN",nullable=true)
	private String firstName;
	
	@Column(name = "USER_LN",nullable=true)
	private String lastName;
	
	@Column(name = "USER_EMAIL",nullable=true)
	private String email;
	
	@Column(name = "USER_IMAGE", nullable=true)
	private String image;
	
	@Column(name = "USER_PHONE",nullable=true)
	private int phoneNbr;
	
	@Column(name="CITY")
	private City city;
	@Column(name="CP",length=4)
	private String cp;
	@Column(name="STREET")
	private String street;
	
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
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="users",fetch = FetchType.EAGER)
	private Set<Post> posts;

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	@OneToMany(cascade = CascadeType.ALL,mappedBy="users",fetch = FetchType.EAGER)
	private Set<Comment> comments;

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
/*
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
*/

	public User() {
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public User(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr) {

		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.image = image;
		this.phoneNbr = phoneNbr;
	
	}

	public User(Long id, String username, String password, String firstName, String lastName, String email,
			String image, int phoneNbr) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.image = image;
		this.phoneNbr = phoneNbr;
		
	}

	public User(Long id) {
		super();
		this.id = id;
	}

	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
}
