package model;

import java.io.Serializable;

public class BirthFlower implements Serializable {
	private String flowerName;
	private String flowerLangage;
	private String flowerImgPath;
	private String month;
	BirthFlower(){}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getFlowerLangage() {
		return flowerLangage;
	}
	public void setFlowerLangage(String flowerLangage) {
		this.flowerLangage = flowerLangage;
	}
	public String getFlowerImgPath() {
		return flowerImgPath;
	}
	public void setFlowerImgPath(String flowerImgPath) {
		this.flowerImgPath = flowerImgPath;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

}
