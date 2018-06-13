package com.java.sar.mains;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

import static com.java.sar.util.Common.alert;

public class JsonInstance {
    public static void main(String[] args) {
        String jsonMessage = "[{'num':'成绩', '外语':88, '历史':65, '地理':99, 'object':{'aaa':'1111','bbb':'2222','cccc':'3333'}}," +
                "{'num':'兴趣', '外语':28, '历史':45, '地理':19, 'object':{'aaa':'11a11','bbb':'2222','cccc':'3333'}}," +
                "{'num':'爱好', '外语':48, '历史':62, '地理':39, 'object':{'aaa':'11c11','bbb':'2222','cccc':'3333'}}]";
        alert("==========================取==================================");
        alert("String:" + jsonMessage);
        JSONArray arr = JSONArray.parseArray(jsonMessage);
        alert("arr:" + arr.get(0));
        JSONObject obj = JSONObject.parseObject(arr.get(0).toString());
        alert("obj_rs:" + obj.get("object"));
        JSONObject obj2 = JSONObject.parseObject(obj.get("object").toString());
        alert("obj2_rs:" + obj2.get("cccc"));
        alert("==========================存==================================");

        String mystr = "[{obj:{'ceshi':'sssssssssssssssssssssssss',ceshi1:111111111}},{'ceshi2':'sssssssssssssssssssssssss'},{'ceshi3':'sssssssssssssssssssssssss'}]";

        JSONArray arr2 = JSONArray.parseArray(mystr);
        alert(arr2);
        alert("==========================map==================================");
        String jsonMessage1 = "{\"语文\":\"88\",\"数学\":\"78\",\"计算机\":\"99\"}";

        JSONObject myJson = JSONObject.parseObject(jsonMessage1);
        myJson.put("Java", 100);
        myJson.put("语文", 120);
        alert(myJson.get("语文"));
        Map m = myJson;
        m.put("英语", 99);

        alert(m);

    }
}
