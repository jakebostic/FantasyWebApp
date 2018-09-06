package com.fantasy.business.owner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ownerName;
	private String teamName;
	private String record;
	private int ranking;
	private double ppg;
	private double totalPoints;
	private double ypg;
	private int yardsTotal;
	private double pointsAllowed;
	private double pointsAllowedPG;
	private String nextOpponent;
	
	public Owner() {
		
	}

	public Owner(int id, String ownerName, String teamName, String record, int ranking, double ppg, double totalPoints,
			     double ypg, int yardsTotal, double pointsAllowed, double pointsAllowedPG, String nextOpponent) {
		this.id = id;
		this.ownerName = ownerName;
		this.teamName = teamName;
		this.record = record;
		this.ranking = ranking;
		this.ppg = ppg;
		this.totalPoints = totalPoints;
		this.ypg = ypg;
		this.yardsTotal = yardsTotal;
		this.pointsAllowed = pointsAllowed;
		this.pointsAllowedPG = pointsAllowedPG;
		this.nextOpponent = nextOpponent;
	}

	public Owner(String ownerName, String teamName, String record, int ranking, double ppg, double totalPoints, double ypg,
			     int yardsTotal, double pointsAllowed, double pointsAllowedPG, String nextOpponent) {
		this.ownerName = ownerName;
		this.teamName = teamName;
		this.record = record;
		this.ranking = ranking;
		this.ppg = ppg;
		this.totalPoints = totalPoints;
		this.ypg = ypg;
		this.yardsTotal = yardsTotal;
		this.pointsAllowed = pointsAllowed;
		this.pointsAllowedPG = pointsAllowedPG;
		this.nextOpponent = nextOpponent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public double getPpg() {
		return ppg;
	}

	public void setPpg(double ppg) {
		this.ppg = ppg;
	}

	public double getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}

	public double getYpg() {
		return ypg;
	}

	public void setYpg(double ypg) {
		this.ypg = ypg;
	}

	public int getYardsTotal() {
		return yardsTotal;
	}

	public void setYardsTotal(int yardsTotal) {
		this.yardsTotal = yardsTotal;
	}
	
	public double getPointsAllowed() {
		return pointsAllowed;
	}

	public void setPointsAllowed(double pointsAllowed) {
		this.pointsAllowed = pointsAllowed;
	}

	public double getPointsAllowedPG() {
		return pointsAllowedPG;
	}

	public void setPointsAllowedPG(double pointsAllowedPG) {
		this.pointsAllowedPG = pointsAllowedPG;
	}

	public String getNextOpponent() {
		return nextOpponent;
	}

	public void setNextOpponent(String nextOpponent) {
		this.nextOpponent = nextOpponent;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", ownerName=" + ownerName + ", teamName=" + teamName + ", winsLosses=" + record
				+ ", ppg=" + ppg + ", totalPoints=" + totalPoints + ", ypg=" + ypg
				+ ", totalYards=" + yardsTotal + "]";
	}
	

}

