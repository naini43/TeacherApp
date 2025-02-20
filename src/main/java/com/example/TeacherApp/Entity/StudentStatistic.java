package com.example.TeacherApp.Entity;

public class StudentStatistic {
	Long totalCount;
	Long femaleCount;
	Long maleCount;
	double genderPercentage;
	Long malayCount;
	Long indiaCount;
	Long cinaCount;
	double racePercentage;
	Long islamCount;
	Long hinduCount;
	Long christianCount;
	Long budhaCount;
	double religionPercentage;
		
	public StudentStatistic(Long totalCount, Long femaleCount, Long maleCount, Long malayCount, Long indiaCount, Long cinaCount,
			Long islamCount, Long hinduCount, Long christianCount, Long budhaCount) {
		super();
		this.totalCount = totalCount;
		this.femaleCount = femaleCount;
		this.maleCount = maleCount;
		this.malayCount = malayCount;
		this.indiaCount = indiaCount;
		this.cinaCount = cinaCount;
		this.islamCount = islamCount;
		this.hinduCount = hinduCount;
		this.christianCount = christianCount;
		this.budhaCount = budhaCount;
	}	
	
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public double getReligionPercentage() {
		return religionPercentage;
	}
	public void setReligionPercentage(double religionPercentage) {
		this.religionPercentage = religionPercentage;
	}
	public Long getFemaleCount() {
		return femaleCount;
	}
	public void setFemaleCount(Long femaleCount) {
		this.femaleCount = femaleCount;
	}
	public Long getMaleCount() {
		return maleCount;
	}
	public void setMaleCount(Long maleCount) {
		this.maleCount = maleCount;
	}
	public double getGenderPercentage() {
		return genderPercentage;
	}
	public void setGenderPercentage(double genderPercentage) {
		this.genderPercentage = genderPercentage;
	}
	public Long getMalayCount() {
		return malayCount;
	}
	public void setMalayCount(Long malayCount) {
		this.malayCount = malayCount;
	}
	public Long getIndiaCount() {
		return indiaCount;
	}
	public void setIndiaCount(Long indiaCount) {
		this.indiaCount = indiaCount;
	}
	public Long getCinaCount() {
		return cinaCount;
	}
	public void setCinaCount(Long cinaCount) {
		this.cinaCount = cinaCount;
	}
	public double getRacePercentage() {
		return racePercentage;
	}
	public void setRacePercentage(double racePercentage) {
		this.racePercentage = racePercentage;
	}
	public Long getIslamCount() {
		return islamCount;
	}
	public void setIslamCount(Long islamCount) {
		this.islamCount = islamCount;
	}
	public Long getHinduCount() {
		return hinduCount;
	}
	public void setHinduCount(Long hinduCount) {
		this.hinduCount = hinduCount;
	}
	public Long getChristianCount() {
		return christianCount;
	}
	public void setChristianCount(Long christianCount) {
		this.christianCount = christianCount;
	}
	public Long getBudhaCount() {
		return budhaCount;
	}
	public void setBudhaCount(Long budhaCount) {
		this.budhaCount = budhaCount;
	}
	
	
}
