package com.kodilla.fishingnotebook;

import com.kodilla.fishingnotebook.domain.accuweather.golkowice.AccuweatherGolkowice;
import com.kodilla.fishingnotebook.domain.accuweather.lesko.AccuWeatherLesko;
import com.kodilla.fishingnotebook.repository.weatherrepositories.AccuWeatherRepositoryGolkowice;
import com.kodilla.fishingnotebook.repository.weatherrepositories.AccuWeatherRepositoryLesko;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    private final AccuWeatherRepositoryLesko accuWeatherRepositoryLesko;
    private final AccuWeatherRepositoryGolkowice accuWeatherRepositoryGolkowice;
    final Grid <AccuWeatherLesko> accuWeatherLeskoGrid;
    final Grid <AccuweatherGolkowice> accuweatherGolkowiceGrid;

    public MainView(AccuWeatherRepositoryLesko accuWeatherRepositoryLesko, AccuWeatherRepositoryGolkowice accuWeatherRepositoryGolkowice) {
        this.accuWeatherRepositoryLesko = accuWeatherRepositoryLesko;
        this.accuWeatherRepositoryGolkowice = accuWeatherRepositoryGolkowice;
        this.accuWeatherLeskoGrid = new Grid <>(AccuWeatherLesko.class);
        this.accuweatherGolkowiceGrid = new Grid <>(AccuweatherGolkowice.class);
        add(accuWeatherLeskoGrid);
        showLeskoWeather();
        add(accuweatherGolkowiceGrid);
        showGolkowiceWeather();
    }

    private void showLeskoWeather() {
        accuWeatherLeskoGrid.setItems(accuWeatherRepositoryLesko.findAll());
    }

    private void showGolkowiceWeather(){
        accuweatherGolkowiceGrid.setItems(accuWeatherRepositoryGolkowice.findAll());
    }
}
