package com.ming.web.ibook.push;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import java.util.EnumSet;

/**
 * @author Hortons
 * on 2020/3/13
 */
public class Main {

    public static void main(String[] args) {
//        Configuration conf = new Configuration().configure();//1、读取配置文件
//        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
//        Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();
//        SchemaExport schemaExport = new SchemaExport();
//        schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
    }
}
