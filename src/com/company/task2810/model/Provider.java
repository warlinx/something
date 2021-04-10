package com.company.task2810.model;
import com.company.task2810.vo.Vacancy;

import java.util.List;

public class Provider {

    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString) {
        return strategy.getVacancies(searchString);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
