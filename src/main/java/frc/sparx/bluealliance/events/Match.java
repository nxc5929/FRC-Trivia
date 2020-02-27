package frc.sparx.bluealliance.events;

public class Match {

	private String comp_level;
	private int match_number;
	private long time;
	private ScoreBreakdown score_breakdown;
	
	
	public String getComp_level() {
		return comp_level;
	}
	public void setComp_level(String comp_level) {
		this.comp_level = comp_level;
	}
	public int getMatch_number() {
		return match_number;
	}
	public void setMatch_number(int match_number) {
		this.match_number = match_number;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public ScoreBreakdown getScore_breakdown() {
		return score_breakdown;
	}
	public void setScore_breakdown(ScoreBreakdown score_breakdown) {
		this.score_breakdown = score_breakdown;
	}
	
}
