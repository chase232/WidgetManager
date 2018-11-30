package com.oreillyauto.widgetmanager.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWidget is a Querydsl query type for Widget
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWidget extends EntityPathBase<Widget> {

    private static final long serialVersionUID = 1441701679L;

    public static final QWidget widget = new QWidget("widget");

    public final StringPath brand = createString("brand");

    public final StringPath color = createString("color");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QWidget(String variable) {
        super(Widget.class, forVariable(variable));
    }

    public QWidget(Path<? extends Widget> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWidget(PathMetadata metadata) {
        super(Widget.class, metadata);
    }

}

