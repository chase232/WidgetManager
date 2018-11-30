package com.oreillyauto.widgetmanager.service;

import java.util.List;

import com.oreillyauto.widgetmanager.domain.Widget;

public interface WidgetService {
    public Widget getWidgetById(Integer id);

    public List<Widget> getAllSoda();

    public void saveSoda(Widget widget);
}