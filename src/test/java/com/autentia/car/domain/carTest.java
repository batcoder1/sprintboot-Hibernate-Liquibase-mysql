package com.autentia.car.domain;

import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Test;

import com.autentia.car.enums.BoxType;
import com.autentia.car.enums.MotorType;
 

public class carTest {

	@Test
	public void noEqualsCarCodeShouldBeNotEqualsCars() throws DatatypeConfigurationException {
		final Car car = dataEntry();
		final Car car2 = dataEntry();
		car2.setCarCode("unCodigoDistinto");
		
		assertNotEquals(car,car2); 
	}

	private Car dataEntry() throws DatatypeConfigurationException {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, 0);
		Date fechaHoy = calendar.getTime();

		String carCode = "Bmw320d18150";
		String brand = "BMW";
		String model = "serie3";
		Date productionDate = fechaHoy;
		double motor = 2.0;
		MotorType motorType = MotorType.DIESEL;
		BoxType boxType = BoxType.AUTOMATIC;
		Integer power = 144;
		BigInteger kilometres = new BigInteger("45000");

		Car car = new Car(carCode,brand,model,productionDate,motor,motorType,boxType,power, kilometres);
		return car;
	}
}
