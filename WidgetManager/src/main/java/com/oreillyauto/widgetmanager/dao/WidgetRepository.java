package com.oreillyauto.widgetmanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.oreillyauto.widgetmanager.dao.custom.WidgetRepositoryCustom;
import com.oreillyauto.widgetmanager.domain.Widget;

public interface WidgetRepository extends CrudRepository<Widget, Integer>, WidgetRepositoryCustom {
    
}