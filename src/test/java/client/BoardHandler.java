package client;

import generic.RestProperties;
import model.BoardResponse;
import model.JsonParser;

import java.util.HashMap;
import java.util.Map;

import static generic.PropertyNames.*;

public class BoardHandler {

    public static final String API_KEY = RestProperties.getProperties().getProperty(REST_API_KEY);
    public static final String API_TOKEN = RestProperties.getProperties().getProperty(REST_API_TOKEN);
    public static final String BOARD_URL = RestProperties.getProperties().getProperty(REST_API_BOARD);
    public static void createBoard (String name) {
        Map<String,String> boardParams = new HashMap<>();
        boardParams.put("name", name);
        boardParams.put("key",API_KEY);
        boardParams.put("token",API_TOKEN);
        new RestRequestHandler().post(BOARD_URL,boardParams);
    }
    public static void getBoard (String id) {
        Map<String,String> boardParams = new HashMap<>();
        boardParams.put("key",API_KEY);
        boardParams.put("token",API_TOKEN);
        new RestRequestHandler().get(BOARD_URL+"/"+id,boardParams);
    }
    public static void deleteBoard (String id) {
        Map<String,String> boardParams = new HashMap<>();
        boardParams.put("key",API_KEY);
        boardParams.put("token",API_TOKEN);
        new RestRequestHandler().delete(BOARD_URL+"/"+id,boardParams);
    }
    public static void updateBoardDescription (String id, String description) {
        Map<String,String> boardParams = new HashMap<>();
        boardParams.put("desc", description);
        boardParams.put("key",API_KEY);
        boardParams.put("token",API_TOKEN);
        new RestRequestHandler().put(BOARD_URL+ "/"+id,boardParams);
    }
    public static BoardResponse getBoardResponse () {
        String jsonString = RestRequestHandler.responseOptions.body().prettyPrint();
        return JsonParser.parseJson(jsonString, BoardResponse.class);
    }

}
