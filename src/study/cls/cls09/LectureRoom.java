package study.cls.cls09;

import java.util.ArrayList;

public class LectureRoom {

	int floor;
	int roomNumber;
	double pyeong;
	
	boolean hasWhiteBoard;
	
	WhiteBoard board;
	AirCon airCon;
	
	//Desk desk;
	//Desk[] deskArr;
	private ArrayList<Desk> deskList;
	
	public LectureRoom() {
		floor = 0;
		roomNumber = 0;
		pyeong = 0;
		hasWhiteBoard = false;
		board = null;
		airCon = null;
		//deskList = null;
		deskList = new ArrayList<Desk>(); 	
	}
	
	public LectureRoom(WhiteBoard board, AirCon airCon) {
		this.board = board;
		this.airCon = airCon;
	}
	
	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void setFloow(int floor) {
		this.floor = floor;
	}
	
	public void addDesk(Desk desk) {
		
		if(this.deskList == null) {
			this.deskList = new ArrayList<Desk>();
		}
		
		this.deskList.add(desk);
	}
} 
