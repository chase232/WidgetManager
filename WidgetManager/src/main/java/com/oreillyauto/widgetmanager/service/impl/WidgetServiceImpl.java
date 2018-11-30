package com.oreillyauto.widgetmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreillyauto.widgetmanager.dao.WidgetRepository;
import com.oreillyauto.widgetmanager.domain.Widget;
import com.oreillyauto.widgetmanager.service.WidgetService;

@Service("widgetService")
public class WidgetServiceImpl implements WidgetService {

    @Autowired
    WidgetRepository widgetRepo;

    @Override
    public Widget getWidgetById(Integer id) {
        return widgetRepo.getWidgetById(id);
    }

}
