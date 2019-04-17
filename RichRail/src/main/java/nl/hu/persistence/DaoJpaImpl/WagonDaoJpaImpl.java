package nl.hu.persistence.DaoJpaImpl;

import javax.persistence.EntityManager;

import nl.hu.domain.Wagon;
import nl.hu.persistence.DAO.WagonDAO;

public class WagonDaoJpaImpl extends AbstractDaoJpaImpl<Wagon> implements WagonDAO {

    public WagonDaoJpaImpl(EntityManager entityManager) {
		super(entityManager);
		
	}

	


}
