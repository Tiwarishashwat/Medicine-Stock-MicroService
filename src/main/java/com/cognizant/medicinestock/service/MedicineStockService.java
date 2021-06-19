package com.cognizant.medicinestock.service;

import java.util.List;

import com.cognizant.medicinestock.model.MedicineStock;

public interface MedicineStockService {
//	Service method to get all medicine information
	public List<MedicineStock> getMedicineStockInformation();

//	Service method to get Medicine by target Ailment
	public List<MedicineStock> getMedicineByTargetAilment(String treatingAilment);

//	Service method to get number of tablets in stock by using the name of the medicine
	public MedicineStock getNumberOfTabletsInStockByName(String medicine);

//	Service method to update number of tablets in stock by using the name of the medicine and new count value
	public Boolean updateNumberOfTabletsInStockByName(String medicine, int count);
}
