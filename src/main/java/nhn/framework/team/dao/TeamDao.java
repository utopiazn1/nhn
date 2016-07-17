package nhn.framework.team.dao;

import java.util.List;

import nhn.framework.team.entity.Team;

public interface TeamDao {

    public void addTeam(Team team);

    public void updateTeam(Team team);

    public Team getTeam(int id);

    public void deleteTeam(int id);

    public List<Team> getTeams();
}
