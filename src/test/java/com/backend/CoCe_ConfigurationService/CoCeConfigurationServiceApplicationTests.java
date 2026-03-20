package com.backend.CoCe_ConfigurationService;

import com.backend.CoCe_ConfigurationService.models.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoCeConfigurationServiceApplicationTests {

	@Test
	public void testToCarEngineDTO() {
		CarEngine carEngine = new CarEngine();
		carEngine.setId(1L);
		carEngine.setName("V8");
		carEngine.setPrice(5000);

		CarEngineDTO carEngineDTO = Mapper.toCarEngineDTO(carEngine);

		assert carEngineDTO.getId().equals("1");
		assert carEngineDTO.getName().equals("V8");
		assert carEngineDTO.getPrice() == 5000;
	}

	@Test
	public void testToCarExtraDTO() {
		CarExtra carExtra = new CarExtra();
		carExtra.setId(1L);
		carExtra.setName("V8");
		carExtra.setPrice(5000);

		CarExtraDTO carExtraDTO = Mapper.toCarExtraDTO(carExtra);

		assert carExtraDTO.getId().equals("1");
		assert carExtraDTO.getName().equals("V8");
		assert carExtraDTO.getPrice() == 5000;
	}

	@Test
	public void testToCarModelDTO() {
		CarModel carModel = new CarModel();
		carModel.setId(1L);
		carModel.setName("V8");
		carModel.setPrice(5000);

		CarModelDTO carModelDTO = Mapper.toCarModelDTO(carModel);

		assert carModelDTO.getId().equals("1");
		assert carModelDTO.getName().equals("V8");
		assert carModelDTO.getPrice() == 5000;
	}

	@Test
	public void testToCarPaintDTO() {
		CarPaint carPaint = new CarPaint();
		carPaint.setId(1L);
		carPaint.setName("V8");
		carPaint.setPrice(5000);

		CarPaintDTO carPaintDTO = Mapper.toCarPaintDTO(carPaint);

		assert carPaintDTO.getId().equals("1");
		assert carPaintDTO.getName().equals("V8");
		assert carPaintDTO.getPrice() == 5000;
	}

	@Test
	public void testToCarWheelDTO() {
		CarWheel carWheel = new CarWheel();
		carWheel.setId(1L);
		carWheel.setName("V8");
		carWheel.setPrice(5000);

		CarWheelDTO carWheelDTO = Mapper.toCarWheelDTO(carWheel);

		assert carWheelDTO.getId().equals("1");
		assert carWheelDTO.getName().equals("V8");
		assert carWheelDTO.getPrice() == 5000;
	}

}
