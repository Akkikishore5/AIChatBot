package com.production.Recommendation.Engine.controller;

import com.production.Recommendation.Engine.model.Dimensions;
import com.production.Recommendation.Engine.service.DimensionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dimensions")
public class DimensionsController {
    final DimensionsService dimensionsService;

    @GetMapping("/all")
    public List<Dimensions> findAllDimensions(){

        return dimensionsService.findDimensions();
    }
}
