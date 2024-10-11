package utils;

import com.google.gson.Gson;
import io.restassured.response.Response;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JSONUtils {

    private static Gson gson = new Gson();

    public static String convertMapToJSONString(Map <String, Object> map) {

        return gson.toJson(map);
    }

    public static void saveResponseToFile(Response response, String fileName) {

        try (FileWriter writer = new FileWriter("src/test/resources/response_JSON" + fileName)) {
            writer.write(response.asPrettyString());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
