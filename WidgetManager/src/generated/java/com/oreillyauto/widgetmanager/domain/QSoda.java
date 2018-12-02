package com.oreillyauto.widgetmanager.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSoda is a Querydsl query type for Soda
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSoda extends EntityPathBase<Soda> {

    private static final long serialVersionUID = -311462012L;

    public static final QSoda soda = new QSoda("soda");

    public final StringPath brand = createString("brand");

    public final StringPath color = createString("color");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QSoda(String variable) {
        super(Soda.class, forVariable(variable));
    }

    public QSoda(Path<? extends Soda> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSoda(PathMetadata metadata) {
        super(Soda.class, metadata);
    }

}

