package com.company.task2810;

import com.company.task2810.model.HHStrategy;
import com.company.task2810.model.Model;
import com.company.task2810.model.HabrCareerStrategy;
import com.company.task2810.model.Provider;
import com.company.task2810.view.HtmlView;

public class Aggregator {

    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new HabrCareerStrategy()));
        Controller controller = new Controller(model);

        view.setController(controller);

        view.userCitySelectEmulationMethod();
    }
}
