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
        ChannelSheetRequest(client);
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
        request.setToken("10b6277819fe86f2b3352e4aeef7134a");
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


    private static void SheetTagRequest(HifiveClient client) {
        HifiveSheetTagRequest request = new HifiveSheetTagRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");
        try {
            HifiveSheetTagResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void TagSheetRequest(HifiveClient client) {
        HifiveTagSheetRequest request = new HifiveTagSheetRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");
        request.setRecoNum(2);
        try {
            HifiveTagSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void SheetMusicRequest(HifiveClient client) {
        HifiveSheetMusicRequest request = new HifiveSheetMusicRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");
        request.setSheetId(1203L);
        try {
            HifiveSheetMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void OrderAuthorizationRequest(HifiveClient client) {
        HifiveAuthorizationRequest request = new HifiveAuthorizationRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");

        request.setCompanyName("嗨翻屋d1g");
        request.setArea("2");
        request.setBrand("HIFIVE音乐开放平台");
        request.setPeriod("3");
        request.setProjectName("小嗨nbdb");
        request.setOrderIds("hifive1598530734587");
        try {
            HifiveAuthorizationResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void ChannelRequest(HifiveClient client) {
        HifiveChannelRequest request = new HifiveChannelRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");

        try {
            HifiveChannelResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void ChannelSheetRequest(HifiveClient client) {
        HifiveChannelSheetRequest request = new HifiveChannelSheetRequest();
        request.setMethod(HifiveUserGetRequest.METHOD_GET);
        request.setClientId("1234567");
        request.setToken("394427b702825d59222c71d15ceab720");
        request.setGroupId("bpqg4oxqddj");
        request.setLanguage(1);
        request.setRecoNum(10);
        request.setPage(1L);
        request.setPageSize(10L);

        try {
            HifiveChannelSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
