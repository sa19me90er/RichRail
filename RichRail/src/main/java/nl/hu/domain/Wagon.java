package nl.hu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="wagon")
	
public class Wagon {
	
	
	@Override
	public String toString() {
		return "Wagon [wagonID=" + wagonID + ", seats=" + seats + ", type=" + type + ", train=" + train + "]\n";
	}

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private String wagonID;
	
	@Column(name="seats")
	private int seats;
 
    @Column(name="type")
	private String type;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "train_id")
    private Train train;

	public Wagon(String wagonID, int seats, String type) {
		this.wagonID= wagonID;
		this.seats= seats;
		this.type= type;}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public void setWagonID(String wagonID) {
		this.wagonID = wagonID;
	}

	public Wagon() {}

public String getWagonID(){
	return wagonID;
}

//public void setWagonID(String wagonID){
//	this.wagoinID = wagonID;
//}
//@Override
//public String toString() {
//	return " "+ wagonID	 +" "  + " \n";
//}
}