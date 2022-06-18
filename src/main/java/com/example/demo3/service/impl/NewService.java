package com.example.demo3.service.impl;

import com.example.demo3.converter.NewConverter;
import com.example.demo3.model.Category;
import com.example.demo3.model.New;
import com.example.demo3.model.newDTO;
import com.example.demo3.repository.CategoryRepository;
import com.example.demo3.repository.NewRepository;
import com.example.demo3.service.iNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewService implements iNewService {

    @Autowired
    private NewRepository newRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private NewConverter newConverter;
    @Override
    public newDTO save(newDTO newDTO) {
        Category category = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        New newEntity = newConverter.toEntity(newDTO);
        newEntity.setCategory(category);
        newEntity = newRepository.save(newEntity);
        return newConverter.toDTO(newEntity);
    }
}
