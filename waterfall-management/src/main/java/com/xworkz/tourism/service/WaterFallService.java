package com.xworkz.tourism.service;

import com.xworkz.tourism.dto.WaterFalldto;

import java.util.List;

public interface WaterFallService {

    public void validateAndSaveWater(WaterFalldto waterFalldto);

    public void validateAndSaveWater(List<WaterFalldto> waterFalldtos);

    public WaterFalldto validateAndGetWaterFalldtoByName(String waterfalldtoName);
}
