package nhn.framework.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import nhn.framework.team.entity.Team;
import nhn.framework.team.service.TeamService;

@Controller
@RequestMapping(value = "/api/team")
public class TeamRestController {

	@Autowired
	TeamService teamService;
	
    @RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<Team> getTeams(){
		List<Team> teams = teamService.getTeams();
		
		return teams;
	}
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
    public String addTeam(@RequestBody Team team) {

        teamService.addTeam(team);

        return "OK"; 
    }
}
