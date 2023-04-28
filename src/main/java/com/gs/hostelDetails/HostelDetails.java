package com.gs.hostelDetails;

public class HostelDetails 
{
     private int sno;
	private String roomno;
    private String name;
    private String mblno;
    private String occupation;
    private String id;
    private String fee;
    private String doj;
    
    
    public HostelDetails()
	{
		super();
	
	}
	
	public HostelDetails(String roomno, String name, String mblno, String occupation, String id, String fee,
			String doj) 
	{
		super();
		this.roomno = roomno;
		this.name = name;
		this.mblno = mblno;
		this.occupation = occupation;
		this.id = id;
		this.fee = fee;
		this.doj = doj;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMblno() {
		return mblno;
	}
	public void setMblno(String mblno) {
		this.mblno = mblno;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "HostelDetails [roomno=" + roomno + ", name=" + name + ", mblno=" + mblno + ", occupation=" + occupation
				+ ", id=" + id + ", fee=" + fee + ", doj=" + doj + "]";
	}
	
	
}
