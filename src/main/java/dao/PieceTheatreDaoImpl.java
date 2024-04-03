package dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import metier.theatre.PieceTheatre;
import util.JPAutil;

public class PieceTheatreDaoImpl implements IPieceTheatreDao {
	private EntityManager entityManager=JPAutil.getEntityManager("TP5_Theatre");

    @Override
    public PieceTheatre save(PieceTheatre pieceTheatre) {
    	EntityTransaction tx = entityManager.getTransaction();
    	tx.begin();
    	entityManager.persist(pieceTheatre);
    	tx.commit();
        return pieceTheatre;
    }

    @Override
    public List<PieceTheatre> piecesTheatreParMC(String mc) {
        List<PieceTheatre> piecesTheatre =entityManager.createQuery("select pt from PieceTheatre pt where pt.nomPieceTheatre like :mc")
         .setParameter("mc", "%"+mc+"%")
         .getResultList();
        
        return piecesTheatre;
    }


    @Override
    public PieceTheatre getPieceTheatre(Long id) {
    	return entityManager.find(PieceTheatre.class, id);
       
    }

    @Override
    public PieceTheatre updatePieceTheatre(PieceTheatre pieceTheatre) {
    	EntityTransaction tx = entityManager.getTransaction();
    	tx.begin();
    	entityManager.merge(pieceTheatre);
    	tx.commit();
    	return pieceTheatre;
    }

    @Override
    public void deletePieceTheatre(Long id) {
    	PieceTheatre PieceTheatre = entityManager.find(PieceTheatre.class, id);
    	entityManager.getTransaction().begin();
    	entityManager.remove(PieceTheatre);
    	entityManager.getTransaction().commit();
    }
}


