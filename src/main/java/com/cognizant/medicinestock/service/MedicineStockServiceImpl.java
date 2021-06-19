package com.cognizant.medicinestock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicinestock.model.MedicineStock;
import com.cognizant.medicinestock.repository.MedicineStockRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MedicineStockServiceImpl implements MedicineStockService {

	@Autowired
	private MedicineStockRepository medicineStockRepository;

//	Implementation of Service method to get all medicine information
	@Override
	public List<MedicineStock> getMedicineStockInformation() {
		log.info("Start of getMedicineStockInformation function ");
		List<MedicineStock> list = medicineStockRepository.findAll();
		log.info("END of getMedicineStockInformation function");
		return list;
	}

//	Implementation of Service method to get all medicine by target ailment
	@Override
	public List<MedicineStock> getMedicineByTargetAilment(String treatingAilment) {
		log.info("Start of getMedicineByTargetAilment function ");
		List<MedicineStock> list = medicineStockRepository.getMedicineByTargetAilment(treatingAilment);
		log.info("END of getMedicineByTargetAilment function");
		return list;
	}

//	Implementation of Service method to get the number of tablets available in stock for a specific medicine 
	@Override
	public MedicineStock getNumberOfTabletsInStockByName(String medicine) {
		log.info("Start of getNumberOfTabletsInStockByName function ");
		MedicineStock medicineStock = medicineStockRepository.getNumberOfTabletsInStockByName(medicine);
		log.info("END of getNumberOfTabletsInStockByName function");
		return medicineStock;
	}

//	Implementation of Service method to update the number of tablets available in stock for a specific medicine
	@Override
	public Boolean updateNumberOfTabletsInStockByName(String medicine, int count) {
		log.info("start of the updateNumberOfTabletsInStockByName function");
		log.info(medicine + " ----------- " + count);
		medicineStockRepository.updateNumberOfTabletsInStockByName(medicine, count);
		log.info("end of the updateNumberOfTabletsInStockByName function");
		return true;
	}

}
