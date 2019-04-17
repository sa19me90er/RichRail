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

@Table(name="train")
public class Wagon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
    @Column(name="name")
	private int seate;
    
    @Column(name="type")
	private String type;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "train_id")
    private Train train;
}
