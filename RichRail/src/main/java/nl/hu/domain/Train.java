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
	private int trainID;
	
    @Column(name="name")
	private String name;


    @OneToMany(mappedBy = "train")
    private List<Wagon> wagons;
   
    public Train( String name) {
    	this.name= name;
    }
    
    public Train() {
    }
    	
    	
    public int getTrainID() {
		return trainID;
	}


	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Wagon> getWagons() {
		return wagons;
	}


	public void setWagons(List<Wagon> wagons) {
		this.wagons = wagons;
	}
 
	@Override
	public String toString() {
		return " "+ trainID +" " + name + " \n";
	}
}
