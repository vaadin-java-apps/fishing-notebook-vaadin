package com.kodilla.fishingnotebook.service;

import com.kodilla.fishingnotebook.domain.accuweather.golkowice.AccuweatherGolkowice;
import com.kodilla.fishingnotebook.domain.imgw.Imgw;
import com.kodilla.fishingnotebook.domain.accuweather.kroscienko.AccuWeatherKroscienko;
import com.kodilla.fishingnotebook.domain.accuweather.lesko.AccuWeatherLesko;
import com.kodilla.fishingnotebook.repository.weatherrepositories.AccuWeatherRepositoryGolkowice;
import com.kodilla.fishingnotebook.repository.weatherrepositories.AccuWeatherRepositoryLesko;
import com.kodilla.fishingnotebook.repository.weatherrepositories.AccuweatherRepositoryKroscienko;
import com.kodilla.fishingnotebook.repository.ImgwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DbService {

    @Autowired
    private ImgwRepository imgwRepository;

    @Autowired
    private AccuWeatherRepositoryGolkowice accuWeatherRepositoryGolkowice;

    @Autowired
    private AccuweatherRepositoryKroscienko accuweatherRepositoryKroscienko;

    @Autowired
    private AccuWeatherRepositoryLesko accuWeatherRepositoryLesko;

    public Imgw saveImgwStations(final Imgw imgw) {
        return imgwRepository.save(imgw);
    }

    public AccuweatherGolkowice saveAccuWeather(final AccuweatherGolkowice accuweatherGolkowice) {
        accuWeatherRepositoryGolkowice.deleteAllWithQuery();
        return accuWeatherRepositoryGolkowice.save(accuweatherGolkowice);
    }

    public AccuWeatherKroscienko saveAccuWeatherKroscienko(final AccuWeatherKroscienko accuWeatherKroscienko) {
        accuweatherRepositoryKroscienko.deleteAllWithQuery();
        return accuweatherRepositoryKroscienko.save(accuWeatherKroscienko);
    }

    public AccuWeatherLesko saveAccuWeatherLesko(final AccuWeatherLesko accuWeatherLesko) {
        accuWeatherRepositoryLesko.deleteAllWithQuery();
        return accuWeatherRepositoryLesko.save(accuWeatherLesko);
    }

    public String getSanLeskoWaterLevel() {
        return imgwRepository.retrieveSanLeskoWaterLevel();
    }

    public String getDunajecKroscienkoWaterLevel() {
        return imgwRepository.retrieveDunajecKroscienkoWaterLevel();
    }

    public String getDunajecGolkowiceWaterLevel() {
        return imgwRepository.retrieveDunajecGolkowiceWaterLevel();
    }

    public String getSanLeskoWeather() {
        return accuWeatherRepositoryLesko.retrieveSanLeskoWeather();
    }

    public String getDunajecKroscienkoWeather() {
        return accuweatherRepositoryKroscienko.retrieveDunajecKroscienkoWeather();
    }

    public String getDunajecGolkowiceWeather() {
        return accuWeatherRepositoryGolkowice.retrieveDunajecGolkowiceWeather();
    }
}
