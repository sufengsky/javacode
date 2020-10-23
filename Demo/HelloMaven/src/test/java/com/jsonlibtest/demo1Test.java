package com.jsonlibtest;

import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class demo1Test {
    public demo1Test() {

    }

    @Test
    public void t() {
        List list = new ArrayList();
        list.add("first");
        list.add("second");
        assertEquals(list.size(), 2);
    }

    @Test
    public void t2() {
        Map map = new HashMap();
        map.put("name", "json");
        map.put("bool", Boolean.TRUE);
        map.put("int", new Integer(1));
        map.put("arr", new String[]{"a", "b"});
        map.put("func", "function(i){ return this.arr[i]; }");

        JSONObject jsonObject = JSONObject.fromObject(map);
        System.out.println(jsonObject);
    }
}