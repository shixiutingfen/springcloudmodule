package com.jiuling.elasticsearch.service;



import com.jiuling.elasticsearch.model.Entity;

import java.util.List;

/**
 * Created by fanxiaoming on 2018/7/16.
 */
public interface CityESService {
    void saveEntity(Entity entity);

    void saveEntity(List<Entity> entityList);

    List<Entity> searchEntity(String searchContent);
}
