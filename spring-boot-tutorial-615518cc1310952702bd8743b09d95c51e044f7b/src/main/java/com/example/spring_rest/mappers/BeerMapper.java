package com.example.spring_rest.mappers;

import com.example.spring_rest.entities.Beer;
import com.example.spring_rest.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}