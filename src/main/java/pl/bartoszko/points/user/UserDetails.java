package pl.bartoszko.points.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Setter;

@Entity
@Table(name="user_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="email")
	@Setter
	private String email;
	
	@Column(name="active")
	private boolean active;
	
	@OneToOne(mappedBy="userDetails")
	private User user;
	
	public UserDetails () {
		this.active = true;
	};
}
