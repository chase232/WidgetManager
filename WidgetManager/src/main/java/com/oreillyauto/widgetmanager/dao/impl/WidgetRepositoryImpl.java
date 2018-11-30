package com.oreillyauto.widgetmanager.dao.impl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.oreillyauto.widgetmanager.dao.custom.WidgetRepositoryCustom;
import com.oreillyauto.widgetmanager.domain.Widget;

@Repository
public class WidgetRepositoryImpl extends QuerydslRepositorySupport implements WidgetRepositoryCustom {
    
    public WidgetRepositoryImpl() {
        super(Widget.class);
    }

    @Override
    public Widget getWidgetById(Integer id) {
        // TODO: Implement method
        return null;
    }
    
}
