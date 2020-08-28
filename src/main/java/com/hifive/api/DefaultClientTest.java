package com.hifive.api;

import com.alibaba.fastjson.JSON;
import com.hifive.api.request.*;
import com.hifive.api.response.*;

public class DefaultClientTest {


    public static void main(String[] args) {
        String url = "https://hifive-openapi-qa.hifiveai.com";
        String appkey = "5216d02806d5464b943492838b7e4390";
        String secret = "2d241e8f934d47d5";
        System.out.println(System.currentTimeMillis());
        HifiveClient client = new DefaultHifiveClient(url, appkey, secret);
        SearchMusicRequest(client);
    }

    private static void UserGetRequest(HifiveClient client) {
        HifiveUserGetRequest request = new HifiveUserGetRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_POST);
        request.setBirthday(202012121);
        request.setCountry("乐山");
        request.setEducation(2);
        request.setGender(1);
        request.setNickname("谎言");
        request.setClientId("1234567");
        request.setProfession(8);
        request.setOrganization(true);
        request.setFavoriteSinger("周杰伦");
        request.setFavoriteGenre("1");
        try {
            HifiveUserGetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void behaviorRequest(HifiveClient client) {
        HifiveBehaviorRequest request = new HifiveBehaviorRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_POST);
        request.setAction(1009);
        request.setTargetId("B75C80A41E3A");
        request.setClientId("1234567");
        request.setToken("466e3cb5fc45231eb7f39de739e0d228");
        try {
            HifiveBehaviorResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hotRequest(HifiveClient client) {
        HifiveHotRequest request = new HifiveHotRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setPage(1L);
        request.setPageSize(20L);
        request.setStartTime(1594639058L);
        request.setDuration(183);
        request.setClientId("12345678");
        request.setToken("466e3cb5fc45231eb7f39de739e0d228");
        try {
            HifiveHotResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void favoriteRequest(HifiveClient client) {
        HifiveRecommendRequest request = new HifiveRecommendRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setPage(1L);
        request.setPageSize(20L);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");
        try {
            HifiveRecommendResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void BaseVisualRequest(HifiveClient client) {
        HifiveBaseVisualRequest request = new HifiveBaseVisualRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setLocation("30.779164,103.94547");
        request.setToken("394427b702825d59222c71d15ceab720");
        try {
            HifiveBaseVisualResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void BaseWeatherRequest(HifiveClient client) {
        HifiveBaseWeatherRequest request = new HifiveBaseWeatherRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setLocation("30.779164,103.94547");
        request.setToken("394427b702825d59222c71d15ceab720");
        try {
            HifiveBaseWeatherResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void MusicConfigRequest(HifiveClient client) {
        HifiveMusicConfigRequest request = new HifiveMusicConfigRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");
        try {
            HifiveMusicConfigResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void SearchMusicRequest(HifiveClient client) {
        HifiveSearchMusicRequest request = new HifiveSearchMusicRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setPage(1L);
        request.setPageSize(20L);
        request.setPrice("1-100000");
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");
        try {
            HifiveSearchMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

}
