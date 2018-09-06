package com.fantasy.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fantasy.business.team.Team;
import com.fantasy.business.team.TeamRepository;
import com.fantasy.util.FantasyMaintenanceReturn;

@CrossOrigin
@Controller
@RequestMapping(path="/Teams")
public class TeamController extends BaseController {
	@Autowired
	private TeamRepository teamRepository;
	

	@GetMapping(path="/List")
	public @ResponseBody Iterable<Team> getAllTeams() {
		return teamRepository.findAll();
	}
	
	@GetMapping(path="/Get")
	public @ResponseBody List<Team> getTeam(@RequestParam int id) {
		Optional<Team> t = teamRepository.findById(id);
		return getReturnArray(t);
	}
	
	@PostMapping(path="/Add")
	public @ResponseBody FantasyMaintenanceReturn addNewTeam(@RequestBody Team team) {
		try {
			teamRepository.save(team);
			return FantasyMaintenanceReturn.getMaintReturn(team);
		}
		catch (DataIntegrityViolationException dive) {
			return FantasyMaintenanceReturn.getMaintReturnError(team, dive.getRootCause().toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			return FantasyMaintenanceReturn.getMaintReturnError(team, e.getMessage());
		}
	}
	
	@GetMapping(path="/Remove")
	public @ResponseBody FantasyMaintenanceReturn deleteTeam(@RequestParam int id) {
		Optional<Team> team = teamRepository.findById(id);
		try {
			teamRepository.delete(team.get());
			return FantasyMaintenanceReturn.getMaintReturn(team.get());
		}
		catch (DataIntegrityViolationException dive) {
			return FantasyMaintenanceReturn.getMaintReturnError(team, dive.getRootCause().toString());
		}
		catch (Exception e) {
			return FantasyMaintenanceReturn.getMaintReturnError(team, e.toString());
		}
	
	}
	
	@PostMapping(path="/Change")
	public @ResponseBody FantasyMaintenanceReturn updateTeam(@RequestBody Team team) {
		try {
			teamRepository.save(team);
			return FantasyMaintenanceReturn.getMaintReturn(team);
		}
		catch (DataIntegrityViolationException dive) {
			return FantasyMaintenanceReturn.getMaintReturnError(team, dive.getRootCause().toString());
		}
		catch (Exception e) {
			return FantasyMaintenanceReturn.getMaintReturnError(team, e.toString());
		}
	}

}
