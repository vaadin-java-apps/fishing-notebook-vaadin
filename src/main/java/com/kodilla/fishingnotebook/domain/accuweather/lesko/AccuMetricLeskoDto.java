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
public class AccuMetricLeskoDto {

    @JsonProperty("Value")
    private double valueDto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccuMetricLeskoDto that = (AccuMetricLeskoDto) o;

        return Double.compare(that.getValueDto(), getValueDto()) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}