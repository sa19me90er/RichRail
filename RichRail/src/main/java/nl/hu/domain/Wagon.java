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
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private String wagonID;
	
	@Column(name="seats")
	private int seats;
 
    @Column(name="type")
	private String type;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "train_id")
    private Train train;

	public Wagon(int seats, String type) {
		this.seats= seats;
		this.type= type;}

	public Wagon() {}

public String getWagonID(){
	return wagonID;
}
}