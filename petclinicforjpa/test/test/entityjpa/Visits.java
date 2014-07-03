package test.entityjpa;

// Generated 2008-5-10 12:53:16 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Visits generated by hbm2java
 */
@Entity
@Table(name = "VISITS")
public class Visits implements java.io.Serializable {

	private int id;
	private Pets pets;
	private Date visitDate;
	private String description;

	public Visits() {
	}

	public Visits(int id, Pets pets) {
		this.id = id;
		this.pets = pets;
	}

	public Visits(int id, Pets pets, Date visitDate, String description) {
		this.id = id;
		this.pets = pets;
		this.visitDate = visitDate;
		this.description = description;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PET_ID", nullable = false)
	public Pets getPets() {
		return this.pets;
	}

	public void setPets(Pets pets) {
		this.pets = pets;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VISIT_DATE", length = 0)
	public Date getVisitDate() {
		return this.visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
