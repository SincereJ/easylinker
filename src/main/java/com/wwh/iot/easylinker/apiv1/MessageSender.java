package com.wwh.iot.easylinker.apiv1;

import com.alibaba.fastjson.JSONObject;
import com.wwh.iot.easylinker.configure.activemq.ActiveMQMessageProducer;
import com.wwh.iot.easylinker.constants.DeviceType;
import com.wwh.iot.easylinker.constants.SystemMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wwhai on 2017/8/28.
 */
public class MessageSender {
    @Autowired
    public  static  ActiveMQMessageProducer activeMQMessageProducer;

    public static JSONObject pushMessage(@RequestParam String deviceId, @RequestParam DeviceType deviceType, @RequestParam(defaultValue = "default") String message) {
        activeMQMessageProducer.pushMessage(deviceId,deviceType,message);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("state",1);
        jsonObject.put("message", SystemMessage.OPERATE_SUCCESS.toString());
        return  jsonObject;
    }
}
