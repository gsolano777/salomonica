package org.ict.salomonica.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@ToString
@Entity
public class Report5x7 {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private int devotionals;
	private boolean fasting; // Ayuno
	private boolean worship; // Alabanza
	private boolean prayingChain; // Cadena de oracion.
	private boolean vigilia;
	private boolean cf;      // CF
	private boolean leadershipCourse; // Curso de liderazgo.
	private boolean supportFamily;    // Aportaste para tu familia.
	private boolean budget; // Presupuesto.
	private boolean tith;    // Diezmo
	private boolean cellGroup; // Celula 
	private int cellGroupAttendance; // Asistencia celula.
	private int evangelism;
	private boolean pastoral;
	private boolean ministerio;
	private boolean rayces;
	private boolean leaderCell;
	
	public int getDevotionals() {
		return devotionals;
	}

	public void setDevotionals(int devotionals) {
		this.devotionals = devotionals;
	}

	public boolean isFasting() {
		return fasting;
	}

	public void setFasting(boolean fasting) {
		this.fasting = fasting;
	}

	public boolean isWorship() {
		return worship;
	}

	public void setWorship(boolean worship) {
		this.worship = worship;
	}

	public boolean isCf() {
		return cf;
	}

	public void setCf(boolean cf) {
		this.cf = cf;
	}

	public boolean isTith() {
		return tith;
	}

	public void setTith(boolean tith) {
		this.tith = tith;
	}

	public boolean isPrayingChain() {
		return prayingChain;
	}

	public void setPrayingChain(boolean prayingChain) {
		this.prayingChain = prayingChain;
	}

	public boolean isVigilia() {
		return vigilia;
	}

	public void setVigilia(boolean vigilia) {
		this.vigilia = vigilia;
	}

	public boolean isLeadershipCourse() {
		return leadershipCourse;
	}

	public void setLeadershipCourse(boolean leadershipCourse) {
		this.leadershipCourse = leadershipCourse;
	}

	public boolean isSupportFamily() {
		return supportFamily;
	}

	public void setSupportFamily(boolean supportFamily) {
		this.supportFamily = supportFamily;
	}

	public boolean isBudget() {
		return budget;
	}

	public void setBudget(boolean budget) {
		this.budget = budget;
	}

	public boolean isCellGroup() {
		return cellGroup;
	}

	public void setCellGroup(boolean cellGroup) {
		this.cellGroup = cellGroup;
	}

	public int getCellGroupAttendance() {
		return cellGroupAttendance;
	}

	public void setCellGroupAttendance(int cellGroupAttendance) {
		this.cellGroupAttendance = cellGroupAttendance;
	}

	public int getEvangelism() {
		return evangelism;
	}

	public void setEvangelism(int evangelism) {
		this.evangelism = evangelism;
	}

	public boolean isPastoral() {
		return pastoral;
	}

	public void setPastoral(boolean pastoral) {
		this.pastoral = pastoral;
	}

	public boolean isMinisterio() {
		return ministerio;
	}

	public void setMinisterio(boolean ministerio) {
		this.ministerio = ministerio;
	}

	public boolean isRayces() {
		return rayces;
	}

	public void setRayces(boolean rayces) {
		this.rayces = rayces;
	}

	public boolean isLeaderCell() {
		return leaderCell;
	}

	public void setLeaderCell(boolean leaderCell) {
		this.leaderCell = leaderCell;
	}

}
