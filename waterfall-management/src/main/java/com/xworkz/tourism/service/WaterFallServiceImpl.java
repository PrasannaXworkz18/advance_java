package com.xworkz.tourism.service;

import com.xworkz.tourism.dto.WaterFalldto;
import com.xworkz.tourism.repository.WaterFallRepository;
import com.xworkz.tourism.repository.WaterFallRepositoryImpl;

import java.util.List;

public class WaterFallServiceImpl implements WaterFallService{
    WaterFallRepository waterFallRepository = new WaterFallRepositoryImpl();
    @Override
    public void validateAndSaveWater(WaterFalldto waterFalldto) {
        //validation

        if (waterFalldto.getName()!=null&&waterFalldto.getPlace()!=null&&waterFalldto.getRiverName()!=null&&waterFalldto.getState()!=null){
            waterFallRepository.saveWater(waterFalldto);
        }else {
            //print message
            System.out.println("Invalid name or river name or place name or state please enter correct details");
        }


    }

    @Override
    public void validateAndSaveWater(List<WaterFalldto> waterFalldtos) {
        //validation
        for (WaterFalldto waterFalldto:waterFalldtos) {

            if (waterFalldto.getName() != null && waterFalldto.getPlace() != null && waterFalldto.getRiverName() != null && waterFalldto.getState() != null) {
                waterFallRepository.saveWater(waterFalldtos);
            } else {
                //print message
                System.out.println("Invalid name or river name or place name or state please enter correct details");
            }
        }
    }

    @Override
    public WaterFalldto validateAndGetWaterFalldtoByName(String waterfalldtoName) {
        //validation
        if (waterfalldtoName!=null && !waterfalldtoName.isEmpty()){
            WaterFalldto waterFalldto = waterFallRepository.getWaterFalldtoByName(waterfalldtoName);
            System.out.println( "  " +waterFalldto.getPlace()+" "+waterFalldto.getRiverName()+" "+waterFalldto.getState());
            return waterFalldto;
        }else {
            //print message
            System.out.println("please provide correct waterfall name");
        }
        return null;
    }


}
