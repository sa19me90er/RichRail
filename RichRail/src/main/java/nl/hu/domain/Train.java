package nl.hu.domain;


import lombok.Data;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Data

@Entity
@Table(name="train")

public class Train {


	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
    @Column(name="id")
	private String trainID;


    @OneToMany(mappedBy = "train")
    private List<Wagon> wagons;
   
    public Train( String trainID) {
    	this.trainID = trainID;
    }
    
    public Train() {
    }
    	
    			

	public String getTrainID() {
		return trainID;
	}


	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}

/*
	public List<Wagon> getWagons() {
		return wagons;
	}


	public void setWagons(List<Wagon> wagons) {
		this.wagons = wagons;
	}
 */
	@Override
	public String toString() {
		return " "+ trainID +" "  + " \n";
	}
}
