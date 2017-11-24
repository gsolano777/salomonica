package org.ict.salomonica.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.ict.salomonica.entity.Report5x7.Report5x7Key;

import lombok.ToString;

@ToString
@Entity
@IdClass(Report5x7Key.class)
public class Report5x7 {	

	public static class Report5x7Key implements Serializable {		
	    private long personId;	   
	    private int week;	    
	    private int year;
	}
	
	@Id
	private long personId;

	@Id   
    private int week;

	@Id
    private int year;
	
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
	
	public Report5x7() {
		
	}
	
	public Report5x7(long personId, int year, int week) {
		this.personId = personId;
		this.year = year;
		this.week = week;
	}
	
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

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
