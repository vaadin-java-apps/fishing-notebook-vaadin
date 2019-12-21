package com.kodilla.fishingnotebook.domain.accuweather.lesko;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccuTemperatureLeskoDto {

    @JsonProperty("Metric")
    private AccuMetricLeskoDto accuMetricDto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccuTemperatureLeskoDto that = (AccuTemperatureLeskoDto) o;

        return getAccuMetricDto().equals(that.getAccuMetricDto());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}