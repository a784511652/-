package com.imooc.utils.serializer;





import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * @auther jiahaowei
 * @date： 2017/10/25 0025
 * @time： 23:29
 * @project_name： mc_springboot_dinner
 * @Description ：
 */

//6-12
public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeNumber(value.getTime() /1000);
    }
}
