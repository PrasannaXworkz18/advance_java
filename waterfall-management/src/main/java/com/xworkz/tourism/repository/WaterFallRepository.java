package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFalldto;

import java.sql.SQLException;
import java.util.List;

public interface WaterFallRepository {

    public void saveWater(WaterFalldto waterFall);

    public void saveWater(List<WaterFalldto>waterFalldtos);

    public WaterFalldto getWaterFalldtoByName(String waterfalldtoName);
}
