package com.production.Recommendation.Engine.service;

import com.production.Recommendation.Engine.model.Dimensions;
import com.production.Recommendation.Engine.repository.DimensionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DimensionsService {
final DimensionsRepository dimensionsRepository;

public List<Dimensions> findDimensions(){

    return dimensionsRepository.findAll();
}

}
