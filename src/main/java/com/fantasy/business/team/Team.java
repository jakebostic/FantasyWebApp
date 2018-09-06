package com.fantasy.business.team;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String location;
	private String teamName;
	private String division;
	private String record;
	private double ppg;
	private double pointsAllowedPG;
	
	public Team() {
		
	}

	public Team(int id, String location, String teamName, String division, String record, double ppg, double pointsAllowedPG) {
		this.id = id;
		this.location = location;
		this.teamName = teamName;
		this.division = division;
		this.record = record;
		this.ppg = ppg;
		this.pointsAllowedPG = pointsAllowedPG;
	}

	public Team(String location, String teamName, String division, String record, double ppg, double pointsAllowedPG) {
		this.location = location;
		this.teamName = teamName;
		this.division = division;
		this.record = record;
		this.ppg = ppg;
		this.pointsAllowedPG = pointsAllowedPG;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public double getPpg() {
		return ppg;
	}

	public void setPpg(double ppg) {
		this.ppg = ppg;
	}

	public double getPointsAllowedPG() {
		return pointsAllowedPG;
	}

	public void setPointsAllowedPG(double pointsAllowedPG) {
		this.pointsAllowedPG = pointsAllowedPG;
	}
	

}
