package nl.hu.persistence.DaoJpaImpl;

import javax.persistence.EntityManager;

import nl.hu.domain.Train;
import nl.hu.persistence.DAO.TrainDAO;

public class TrainDaoJpaImpl extends AbstractDaoJpaImpl<Train> implements TrainDAO {

    public TrainDaoJpaImpl(EntityManager entityManager) { super(entityManager); }
}