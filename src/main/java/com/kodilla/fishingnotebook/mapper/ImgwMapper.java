package com.kodilla.fishingnotebook.mapper;

import com.kodilla.fishingnotebook.domain.imgw.Imgw;
import com.kodilla.fishingnotebook.domain.imgw.ImgwDto;
import org.springframework.stereotype.Component;

@Component
public class ImgwMapper {
    public Imgw mapToImgw(final ImgwDto imgwDto) {
        return new Imgw(
                imgwDto.getIdStacji(),
                imgwDto.getStacja(),
                imgwDto.getRzeka(),
                imgwDto.getStanWody(),
                imgwDto.getStanWodyDataPomiaru());
    }
}
