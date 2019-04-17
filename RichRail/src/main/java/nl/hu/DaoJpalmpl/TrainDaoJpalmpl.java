package nl.hu.DaoJpalmpl;

import javax.persistence.EntityManager;

import nl.hu.DAO.TrainDAO;
import nl.hu.domain.Train;

public class TrainDaoJpalmpl extends AbstractDaoJpaImpl<Train> implements TrainDAO {

    public TrainDaoJpalmpl(EntityManager entityManager) { super(entityManager); }
}
