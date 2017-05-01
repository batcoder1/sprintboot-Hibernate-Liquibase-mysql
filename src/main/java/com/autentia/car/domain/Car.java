package com.autentia.car.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.autentia.car.enums.BoxType;
import com.autentia.car.enums.MotorType;
 
@Entity
@Table(name="car")
public class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Column(name="CAR_CODE")
	private String carCode;
	
	@Column(name="BRAND")
	private String brand;
	
	@Column(name="MODEL")
	private String model;
		
	@Column(name="PRODUCTION_DATE")
	private Date productionDate;
	
	@Column(name="MOTOR")
	private double motor;
	
	@Column(name="MOTOR_TYPE")
	private MotorType motorType;
	
	@Column(name="BOX_TYPE")
	private BoxType boxType;
	
	@Column(name="POWER")
	private Integer power;
	
	@Column(name="KILOMETRES")
	private BigInteger kilometres;
	
	
	public Car(String carCode, String brand, String model, Date productionDate, double motor, MotorType motorType,
			BoxType boxType, Integer power, BigInteger kilometres) {
		super();
		this.carCode = carCode;
		this.brand = brand;
		this.model = model;
		this.productionDate = productionDate;
		this.motor = motor;
		this.motorType = motorType;
		this.boxType = boxType;
		this.power = power;
		this.kilometres = kilometres;
	}


	public String getCarCode() {
		return carCode;
	}

	
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Date getProductionDate() {
		return productionDate;
	}
	
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	
	public double getMotor() {
		return motor;
	}
	
	public void setMotor(double motor) {
		this.motor = motor;
	}
	
	public MotorType getMotorType() {
		return motorType;
	}
	
	public void setMotorType(MotorType motorType) {
		this.motorType = motorType;
	}
	
	public BoxType getBoxType() {
		return boxType;
	}
	
	public void setBoxType(BoxType boxType) {
		this.boxType = boxType;
	}
	
	public Integer getPower() {
		return power;
	}
	
	public void setPower(Integer power) {
		this.power = power;
	}
	
	public BigInteger getKilometres() {
		return kilometres;
	}
	
	public void setKilometres(BigInteger kilometres) {
		this.kilometres = kilometres;
	}
	
	
}
