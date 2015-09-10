package com.francis.framework.bean;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public interface IEntity<TEntity> extends Serializable {
    TEntity parseJson(JSONObject jsonObject) throws JSONException;
}
