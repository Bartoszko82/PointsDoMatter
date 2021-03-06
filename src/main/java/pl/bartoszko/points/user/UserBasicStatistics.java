package pl.bartoszko.points.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user_basic_statistics")
@Data
public class UserBasicStatistics {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="games_played")
	private int gamesPlayed;
	
	@Column(name="games_won")
	private int gamesWon; 

	@OneToOne(mappedBy="userBasicStatistics")
	private User user;	
	
	public UserBasicStatistics() {};
}

