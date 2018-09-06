package com.fantasy.business.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fantasy.business.owner.Owner;
import com.fantasy.business.team.Team;


@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name="ownerID")
	private Owner owner;
	@ManyToOne
	@JoinColumn(name="teamID")
	private Team team;
	private String firstName;
	private String lastName;
	private String position;
	private double ppg;
	private double pointsTotal;
	private int carries;
	private double carriesPG;
	private int catches;
	private double catchesPG;
	private double ypg;
	private int yardsTotal;
	private int touchdowns;
	
	public Player() {
		
	}

	public Player(int id, Owner owner, Team team, String firstName, String lastName, String position, double ppg, double pointsTotal,
			      int carries, double carriesPG, int catches, double catchesPG, double ypg, int yardsTotal, int touchdowns) {
		this.id = id;
		this.owner = owner;
		this.team = team;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.ppg = ppg;
		this.pointsTotal = pointsTotal;
		this.carries = carries;
		this.carriesPG = carriesPG;
		this.catches = catches;
		this.catchesPG = catchesPG;
		this.ypg = ypg;
		this.yardsTotal = yardsTotal;
		this.touchdowns = touchdowns;
	}

	public Player(Owner owner, Team team, String firstName, String lastName, String position, double ppg, double pointsTotal,
			      int carries, double carriesPG, int catches, double catchesPG, double ypg, int yardsTotal, int touchdowns) {
		this.owner = owner;
		this.team = team;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.ppg = ppg;
		this.pointsTotal = pointsTotal;
		this.carries = carries;
		this.carriesPG = carriesPG;
		this.catches = catches;
		this.catchesPG = catchesPG;
		this.ypg = ypg;
		this.yardsTotal = yardsTotal;
		this.touchdowns = touchdowns;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	public double getPpg() {
		return ppg;
	}

	public void setPpg(double ppg) {
		this.ppg = ppg;
	}

	public double getPointsTotal() {
		return pointsTotal;
	}

	public void setPointsTotal(double pointsTotal) {
		this.pointsTotal = pointsTotal;
	}

	public int getCarries() {
		return carries;
	}

	public void setCarries(int carries) {
		this.carries = carries;
	}

	public double getCarriesPG() {
		return carriesPG;
	}

	public void setCarriesPG(double carriesPG) {
		this.carriesPG = carriesPG;
	}

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		this.catches = catches;
	}

	public double getCatchesPG() {
		return catchesPG;
	}

	public void setCatchesPG(double catchesPG) {
		this.catchesPG = catchesPG;
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

	public int getTouchdowns() {
		return touchdowns;
	}

	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", team=" + team + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", owner=" + owner + ", position=" + position + ", ppg="
				+ ppg + ", pointsTotal=" + pointsTotal + ", ypg=" + ypg + ", yardsTotal=" + yardsTotal + ", touchdowns=" + touchdowns + "]";
	}
	
}


