package com.brevitaz.dao.impl;

import com.brevitaz.config.Config;
import com.brevitaz.dao.Dao;
import com.brevitaz.model.Model;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import sun.misc.ObjectInputFilter;

import java.io.IOException;

@Repository
public class DaoImpl implements Dao
{
    //private final String INDEX_NAME = "expirements";
    private final String TYPE_NAME = "doc";

    @Autowired
    Config config;

    @Value("${Model-Index-Name}")
    String indexName;

    public boolean create(Model model)
    {
        IndexRequest request = new IndexRequest(
                indexName,
                TYPE_NAME,model.getId()
        );

        try {
           String json = config.getObjectMapper().writeValueAsString(model);
            request.source(json, XContentType.JSON);
            IndexResponse indexResponse= config.getClient().index(request);
            System.out.println(indexResponse);
            System.out.println("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}
