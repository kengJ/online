package com.model;
/**
 * �Ա���
 * @author heyanzhu
 *
 */
public class Sex {

	private int SexId;
	private String SexType;//�Ա�����
	public int getSexId() {
		return SexId;
	}
	public void setSexId(int sexId) {
		SexId = sexId;
	}
	public String getSexType() {
		return SexType;
	}
	public void setSexType(String sexType) {
		SexType = sexType;
	}
	@Override
	public String toString() {
		return "Sex [SexId=" + SexId + ", SexType=" + SexType + "]";
	}
	
	
}
