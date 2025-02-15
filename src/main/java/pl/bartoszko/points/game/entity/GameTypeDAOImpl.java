
package pl.bartoszko.points.game.entity;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("gameTypeDAO")
@Transactional
public class GameTypeDAOImpl extends AbstractDAO<GameType> implements GameTypeDAO {

	@Override
	public void saveGameType(GameType gameType) {
		persist(gameType);
	}
	
	@Override
	public List<GameType> getGameTypes () {
		return getClasses(GameType.class);
	}
	
	@Override
	public GameType getGameType (int id) {
		return getClass(GameType.class, id);
	}
	
	@Override
	public GameType getGameType (String gameTypeName) {
		Query<GameType> query = getSession().createQuery("from GameType where name = :gameTypeName", GameType.class);
		query.setParameter("gameTypeName", gameTypeName);
		return query.getSingleResult();
	}
	
}
