package com.oreillyauto.widgetmanager.dao.impl;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.oreillyauto.widgetmanager.dao.custom.WidgetRepositoryCustom;
import com.oreillyauto.widgetmanager.domain.QWidget;
import com.oreillyauto.widgetmanager.domain.Widget;

@Repository
public class WidgetRepositoryImpl extends QuerydslRepositorySupport implements WidgetRepositoryCustom {
    
    public WidgetRepositoryImpl() {
        super(Widget.class);
    }

    @Override
    public Widget getWidgetById(Integer id) {
        
        QWidget widgetTable = QWidget.widget;
        
        Widget widgetList = (Widget) getQuerydsl().createQuery()
                /*.select(carpartTable.partNumber, carpartTable.title, carpartTable.line, carpartTable.description)*/
                .from(widgetTable)
                .where(widgetTable.id.eq(id))
                .fetchOne();
        
        return widgetList;
    }
    
    public Widget getWidgetByName(String name) {
        QWidget widgetTable = QWidget.widget;
        
        Widget widgetList = (Widget) getQuerydsl().createQuery()
                /*.select(carpartTable.partNumber, carpartTable.title, carpartTable.line, carpartTable.description)*/
                .from(widgetTable)
                .where(widgetTable.name.eq(name))
                .fetchOne();
        
        return widgetList;
    }
    
    @SuppressWarnings("unchecked")
    public List<Widget> getAllSoda(){
        QWidget widgetTable = QWidget.widget;
        
        List<Widget> widgetList = (List<Widget>)(Object)getQuerydsl().createQuery().from(widgetTable).fetch();
        return widgetList;
    }
}











