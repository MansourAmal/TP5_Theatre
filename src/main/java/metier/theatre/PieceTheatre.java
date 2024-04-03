package metier.theatre;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pieceth")
public class PieceTheatre implements Serializable {
	@Id
	@Column (name="ID_PIECETH")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long idPieceTheatre;
	@Column (name="NOM_PIECETH")
    private String nomPieceTheatre;
    private String auteur;

    public PieceTheatre() {
        super();
    }

    public PieceTheatre(String nomPieceTheatre, String auteur) {
        super();
        this.nomPieceTheatre = nomPieceTheatre;
        this.auteur = auteur;
    }

    public Long getIdPieceTheatre() {
        return idPieceTheatre;
    }

    public void setIdPieceTheatre(Long idPieceTheatre) {
        this.idPieceTheatre = idPieceTheatre;
    }

    public String getNomPieceTheatre() {
        return nomPieceTheatre;
    }

    public void setNomPieceTheatre(String nomPieceTheatre) {
        this.nomPieceTheatre = nomPieceTheatre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "PieceTheatre [idPieceTheatre=" + idPieceTheatre + ", nomPieceTheatre=" + nomPieceTheatre + ", auteur=" + auteur + "]";
    }
}
