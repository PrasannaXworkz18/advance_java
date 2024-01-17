package com.xworkz.tourism.runner;

import com.xworkz.tourism.dto.WaterFalldto;
import com.xworkz.tourism.repository.WaterFallRepository;
import com.xworkz.tourism.repository.WaterFallRepositoryImpl;
import com.xworkz.tourism.service.WaterFallService;
import com.xworkz.tourism.service.WaterFallServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class WaterFallRunner {
    public static void main(String[] args) {

//        WaterFallService waterFallService=new WaterFallServiceImpl();
//        WaterFalldto waterFalldto = new WaterFalldto("JogFall","Sagara","Sharavathi","Karnataka");
//        WaterFalldto waterFalldto1 = new WaterFalldto("KRS","Mandya","KRS","Karnataka");
//        waterFallService.validateAndSaveWater(waterFalldto);
//        waterFallService.validateAndSaveWater(waterFalldto1);
//
//
//        WaterFalldto waterFalldto2=new WaterFalldto("AbbeFalls","Coorg","Kaveri","Karnataka");
//        List<WaterFalldto> waterFalldtos = new ArrayList<>();
//        waterFalldtos.add(waterFalldto2);
//        waterFallService.validateAndSaveWater(waterFalldtos);

        WaterFallService waterFallService1=new WaterFallServiceImpl();
        waterFallService1.validateAndGetWaterFalldtoByName("KRS");
    }
}
