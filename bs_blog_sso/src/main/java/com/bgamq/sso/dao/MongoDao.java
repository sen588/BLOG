package com.bgamq.sso.dao;

import java.util.List;
import java.util.Map;

public interface MongoDao<T> {

    void createCollection(String name);

    String createIndex(String collectionName, String filedName);

    List<String> getAllIndexes(String collectionName);

    void insert(T info, String collectionName);

    void insertMulti(List<T> infos, String collectionName);

    void updateById(String id, String collectionName, T info);

    void deleteById(String id, Class<T> clazz, String collectionName);

    T selectById(String id, Class<T> clazz, String collectionName);

    List<T> selectList(String collectName, Class<T> clazz);

    List<T> selectList(String collectName, Class<T> clazz, Integer currentPage, Integer pageSize);

    List<T> selectByCondition(String collectName, Map<String, Object> conditions, Class<T> clazz, Integer currentPage, Integer pageSize);

}
