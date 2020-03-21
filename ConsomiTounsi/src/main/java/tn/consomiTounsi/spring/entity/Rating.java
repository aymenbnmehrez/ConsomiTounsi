package tn.consomiTounsi.spring.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_RATING")
public class Rating implements Serializable {

	private static final long serialVersionUID = 1L;
	private RatingPk ratingPk;
	private User user;
	private Post post;

	@EmbeddedId
	public RatingPk getRatingPk() {
		return ratingPk;
	}

	public void setRatingPk(RatingPk ratingPk) {
		this.ratingPk = ratingPk;
	}

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false, name = "user_id", referencedColumnName = "user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false, name = "post_id", referencedColumnName = "post_id")
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
