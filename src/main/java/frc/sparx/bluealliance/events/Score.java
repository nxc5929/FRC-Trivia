package frc.sparx.bluealliance.events;

public class Score {

	private int totalPoints;
	
	//Ranking Points
	private int rp;
	private boolean shieldEnergizedRankingPoint;
    private boolean shieldOperationalRankingPoint;
	
    //Auto Detailed
    private int autoPoints;
    private int autoCellPoints;
    private int autoCellsBottom;
	private int autoCellsOuter;
	private int autoCellsInner;
	private int autoInitLinePoints;
	private String initLineRobot1;
	private String initLineRobot2;
    private String initLineRobot3;
	
    //Teleop Detailed
    private int teleopPoints;
    private int teleopCellPoints;
    private int teleopCellsBottom;
    private int teleopCellsOuter;
    private int teleopCellsInner;
    
    //Stages
    private int controlPanelPoints;
    private boolean stage1Activated;
    private boolean stage2Activated;
    private boolean stage3Activated;
    private String stage3TargetColor;
    
    //Endgame
    private int endgamePoints;
    private String endgameRobot1;
    private String endgameRobot2;
    private String endgameRobot3;
    private int tba_numRobotsHanging;
    private String endgameRungIsLevel;
    
    //Fouls
    private int foulPoints;
	private int adjustPoints;
    private int foulCount;
    private int techFoulCount;
    private boolean tba_shieldEnergizedRankingPointFromFoul;
	
    //--------------------------------------------------------------------------------------
    public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public int getRp() {
		return rp;
	}
	public void setRp(int rp) {
		this.rp = rp;
	}
	public boolean isShieldEnergizedRankingPoint() {
		return shieldEnergizedRankingPoint;
	}
	public void setShieldEnergizedRankingPoint(boolean shieldEnergizedRankingPoint) {
		this.shieldEnergizedRankingPoint = shieldEnergizedRankingPoint;
	}
	public boolean isShieldOperationalRankingPoint() {
		return shieldOperationalRankingPoint;
	}
	public void setShieldOperationalRankingPoint(boolean shieldOperationalRankingPoint) {
		this.shieldOperationalRankingPoint = shieldOperationalRankingPoint;
	}
	public int getAutoPoints() {
		return autoPoints;
	}
	public void setAutoPoints(int autoPoints) {
		this.autoPoints = autoPoints;
	}
	public int getAutoCellPoints() {
		return autoCellPoints;
	}
	public void setAutoCellPoints(int autoCellPoints) {
		this.autoCellPoints = autoCellPoints;
	}
	public int getAutoCellsBottom() {
		return autoCellsBottom;
	}
	public void setAutoCellsBottom(int autoCellsBottom) {
		this.autoCellsBottom = autoCellsBottom;
	}
	public int getAutoCellsOuter() {
		return autoCellsOuter;
	}
	public void setAutoCellsOuter(int autoCellsOuter) {
		this.autoCellsOuter = autoCellsOuter;
	}
	public int getAutoCellsInner() {
		return autoCellsInner;
	}
	public void setAutoCellsInner(int autoCellsInner) {
		this.autoCellsInner = autoCellsInner;
	}
	public int getAutoInitLinePoints() {
		return autoInitLinePoints;
	}
	public void setAutoInitLinePoints(int autoInitLinePoints) {
		this.autoInitLinePoints = autoInitLinePoints;
	}
	public String getInitLineRobot1() {
		return initLineRobot1;
	}
	public void setInitLineRobot1(String initLineRobot1) {
		this.initLineRobot1 = initLineRobot1;
	}
	public String getInitLineRobot2() {
		return initLineRobot2;
	}
	public void setInitLineRobot2(String initLineRobot2) {
		this.initLineRobot2 = initLineRobot2;
	}
	public String getInitLineRobot3() {
		return initLineRobot3;
	}
	public void setInitLineRobot3(String initLineRobot3) {
		this.initLineRobot3 = initLineRobot3;
	}
	public int getTeleopPoints() {
		return teleopPoints;
	}
	public void setTeleopPoints(int teleopPoints) {
		this.teleopPoints = teleopPoints;
	}
	public int getTeleopCellPoints() {
		return teleopCellPoints;
	}
	public void setTeleopCellPoints(int teleopCellPoints) {
		this.teleopCellPoints = teleopCellPoints;
	}
	public int getTeleopCellsBottom() {
		return teleopCellsBottom;
	}
	public void setTeleopCellsBottom(int teleopCellsBottom) {
		this.teleopCellsBottom = teleopCellsBottom;
	}
	public int getTeleopCellsOuter() {
		return teleopCellsOuter;
	}
	public void setTeleopCellsOuter(int teleopCellsOuter) {
		this.teleopCellsOuter = teleopCellsOuter;
	}
	public int getTeleopCellsInner() {
		return teleopCellsInner;
	}
	public void setTeleopCellsInner(int teleopCellsInner) {
		this.teleopCellsInner = teleopCellsInner;
	}
	public int getControlPanelPoints() {
		return controlPanelPoints;
	}
	public void setControlPanelPoints(int controlPanelPoints) {
		this.controlPanelPoints = controlPanelPoints;
	}
	public boolean isStage1Activated() {
		return stage1Activated;
	}
	public void setStage1Activated(boolean stage1Activated) {
		this.stage1Activated = stage1Activated;
	}
	public boolean isStage2Activated() {
		return stage2Activated;
	}
	public void setStage2Activated(boolean stage2Activated) {
		this.stage2Activated = stage2Activated;
	}
	public boolean isStage3Activated() {
		return stage3Activated;
	}
	public void setStage3Activated(boolean stage3Activated) {
		this.stage3Activated = stage3Activated;
	}
	public String getStage3TargetColor() {
		return stage3TargetColor;
	}
	public void setStage3TargetColor(String stage3TargetColor) {
		this.stage3TargetColor = stage3TargetColor;
	}
	public int getEndgamePoints() {
		return endgamePoints;
	}
	public void setEndgamePoints(int endgamePoints) {
		this.endgamePoints = endgamePoints;
	}
	public String getEndgameRobot1() {
		return endgameRobot1;
	}
	public void setEndgameRobot1(String endgameRobot1) {
		this.endgameRobot1 = endgameRobot1;
	}
	public String getEndgameRobot2() {
		return endgameRobot2;
	}
	public void setEndgameRobot2(String endgameRobot2) {
		this.endgameRobot2 = endgameRobot2;
	}
	public String getEndgameRobot3() {
		return endgameRobot3;
	}
	public void setEndgameRobot3(String endgameRobot3) {
		this.endgameRobot3 = endgameRobot3;
	}
	public int getTba_numRobotsHanging() {
		return tba_numRobotsHanging;
	}
	public void setTba_numRobotsHanging(int tba_numRobotsHanging) {
		this.tba_numRobotsHanging = tba_numRobotsHanging;
	}
	public String getEndgameRungIsLevel() {
		return endgameRungIsLevel;
	}
	public void setEndgameRungIsLevel(String endgameRungIsLevel) {
		this.endgameRungIsLevel = endgameRungIsLevel;
	}
	public int getFoulPoints() {
		return foulPoints;
	}
	public void setFoulPoints(int foulPoints) {
		this.foulPoints = foulPoints;
	}
	public int getAdjustPoints() {
		return adjustPoints;
	}
	public void setAdjustPoints(int adjustPoints) {
		this.adjustPoints = adjustPoints;
	}
	public int getFoulCount() {
		return foulCount;
	}
	public void setFoulCount(int foulCount) {
		this.foulCount = foulCount;
	}
	public int getTechFoulCount() {
		return techFoulCount;
	}
	public void setTechFoulCount(int techFoulCount) {
		this.techFoulCount = techFoulCount;
	}
	public boolean isTba_shieldEnergizedRankingPointFromFoul() {
		return tba_shieldEnergizedRankingPointFromFoul;
	}
	public void setTba_shieldEnergizedRankingPointFromFoul(boolean tba_shieldEnergizedRankingPointFromFoul) {
		this.tba_shieldEnergizedRankingPointFromFoul = tba_shieldEnergizedRankingPointFromFoul;
	}
}
