package com.hifive.api;

import com.alibaba.fastjson.JSON;
import com.hifive.api.domain.common.HFAuthorizeMusicDetail;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.constants.*;
import com.hifive.api.request.*;
import com.hifive.api.response.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultClientTest {


    public static void main(String[] args) throws InterruptedException, ApiException {

//        String url = "https://hifive-gateway-test.hifiveai.com";
//        String url = "http://127.0.0.1:8011";
//        String appkey = "999f66435afc4021aececd41814fd587";
//        String secret = "779365cd5f2b4286ae";
//        System.out.println("------------------------------------hifiveHQListenRequestTest");
//        HFClient client = new DefaultHFClient(url, appkey, secret);

//        String url = "https://hifive-openapi-qa.hifiveai.com";
//        String appkey = "6bea19aa99a14d6d866dbb8c46c32819";
//        String secret = "a9dc8d2219e54833ad";
//        System.out.println("------------------------------------hifiveHQListenRequestTest");
//        HFClient client = new DefaultHFClient(url, appkey, secret);
//        HifiveBaseLoginRequest(client);
//        String url = "https://gateway.open.hifiveai.com";
//        String appkey = "300a44d050c942eebeae8765a878b0ee";
//        String secret = "0e31fe11b31247fca8";
//        System.out.println("------------------------------------hifiveHQListenRequestTest");
//        HFClient client = new DefaultHFClient(url, appkey, secret);

//          String url = "https://hifive-gateway-pre.hifiveai.com";
//        String url = "https://gateway.open.hifiveai.com";
////        String url = "http://127.0.0.1:8011";
//        String appkey = "99e617f2476c49e5b00642ebd6869537";
//        String secret = "3df871d008bf4eadb4";
//        System.out.println("------------------------------------hifiveHQListenRequestTest");
//        HFClient client = new DefaultHFClient(url, appkey, secret);

        String url = "https://gateway.open.hifiveai.com";
//        String url = "https://hifive-gateway-pre.hifiveai.com";
//        String url = "http://127.0.0.1:8011";
//        String appkey = "3faeec81030444e98acf6af9ba32752a";
//        String secret = "59b1aff189b3474398";
        String appkey = "dcc0fb10e5224dcfaa5be76664464647";
        String secret = "5c9d2329bce1484ead";
        System.out.println("------------------------------------hifiveHQListenRequestTest");
        HFClient client = new DefaultHFClient(url, appkey, secret);


//        hifiveHFAuthorizeMusicDetailRequest(client);

        //OpenApi C端
//        hifiveOpenMemberLoginRequest(client);
//        hifiveOpenMemberSheetRequestRequest(client);
//        hifiveOpenMemberSheetMusicRequestRequest(client);
//        hifiveOpenMemberSheetMusicAddRequestRequest(client);
//        hFOpenMemberSheetMusicDeleteRequest(client);
//        hFClearMemberSheetMusicRequest(client);
//        hFCreateMemberSheetRequest(client);
//        hFClearSearchHistoryRequest(client);
//        hFDeleteMemberSheetRequest(client);
//        hifiveSearchMusicRequestTest(client);
//        hFSearchHistoryRequest(client);

//        Long start = System.currentTimeMillis();
//        hifiveBaseHotRequestTest(client);
//        Long end = System.currentTimeMillis();
//        System.out.println(end - start);

//        for (int i = 0;i< 20 ;i++) {
//            hifiveOpenMemberSheetMusicAddRequestRequest(client);
//        }
//        hifiveAuthorizeMusic(client);
        //hifiveOpenMemberSheetMusicAddRequestRequest(client);
//         HifiveBaseLoginRequest(client);
        //hifiveBaseFavoriteRequestTest(client);
        //OpenApi C端


//        HFTrailListen(client);
//        HFTrafficTrialTest(client);
//        HFUGCTrialTest(client);
//        HFKTrialTest(client);
//        HFOrderTrialTest(client);
//
//        hifiveUGCListenRequestTest(client);
//        hifiveKListenRequestTest(client);
//
//        hifiveTrafficReportListenRequestTest(client);
//        hifiveUGCReportListenRequestTest(client);
//        hifiveKReportListenRequestTest(client);
/*        for (int i = 0;i<10; i++) {

            //  long time = System.currentTimeMillis();
            hifiveHQListenRequestTest(client);
            //long time2 = System.currentTimeMillis();
            Thread.sleep(1000);
        }*/
//       System.out.println("------------------------------------hifiveHQListenRequestTest");
//        for (int i = 0;i<10; i++) {
//
//            long time = System.currentTimeMillis();
//            hifiveHQListenRequestTest(client);
//            long time2 = System.currentTimeMillis();
//            System.out.println("hifiveHQListenRequestTest-----------------" + (time2 - time));
//            Thread.sleep(1000);
//        }
//        System.out.println("------------------------------------hifiveHQListenRequestTest");
//
/*
        System.out.println("------------------------------------hifiveTrafficGroupRequestTest");
        for (int i = 0;i<10; i++) {
         //   long time = System.currentTimeMillis();
            hifiveTrafficGroupRequestTest(client);
           // long time2 = System.currentTimeMillis();
            //System.out.println("hifiveTrafficGroupRequestTest-----------------" + (time2 - time));
            Thread.sleep(1000);
        }
        System.out.println("------------------------------------hifiveTrafficGroupRequestTest");

       System.out.println("------------------------------------hifiveTrafficGroupSheetRequestTest");
        for (int i = 0;i<10; i++) {
           // long time = System.currentTimeMillis();
            hifiveTrafficGroupSheetRequestTest(client);
            //long time2 = System.currentTimeMillis();
            //System.out.println("hifiveTrafficGroupSheetRequestTest-----------------" + (time2 - time));
            Thread.sleep(1000);
        }
        System.out.println("------------------------------------hifiveTrafficGroupSheetRequestTest");

        System.out.println("------------------------------------hifiveTrafficSheetMusicRequestTest");
        for (int i = 0;i<10; i++) {
           // long time = System.currentTimeMillis();
            hifiveTrafficSheetMusicRequestTest(client);
           // long time2 = System.currentTimeMillis();
            //System.out.println("hifiveTrafficSheetMusicRequestTest-----------------" + (time2 - time));
            Thread.sleep(1000);
        }
        System.out.println("------------------------------------hifiveTrafficSheetMusicRequestTest");
*/
        //hifiveTagSheetRequestTest(client);
//        HifiveBaseLoginRequest(client);
        //  HifiveBaseLoginRequest(client);
//        hifiveSearchMusicRequestTest(client);
//        hifiveBaseFavoriteRequestTest(client);
//        hifiveBaseVisualRequestTest(client);
//        hifiveBaseWeatherRequestTest(client);
//        hifiveBaseWeatherRequestTest(client);
//
//        hifiveMusicConfigRequestTest(client);
//        hifiveSearchMusicRequestTest(client);
//        hifiveSheetTagRequestTest(client);
//        hifiveTagSheetRequestTest(client);

//        HifiveOrderAuthorizationRequestTest(client);
//
//
//        hifiveChannelRequestTest(client);
//        hifiveChannelSheetRequestTest(client);
//        hifiveSheetMusicRequestTest(client);

//        hifiveHQListenSliceRequestTest(client);
//
//        hifiveHQListenRequestTest(client);
//        hifiveUGCListenRequestTest(client);
//        hifiveKListenRequestTest(client);
//
//        hifiveOrderMusicRequestTest(client);
//        hifiveOrderDetailRequestTest(client);
//        hifiveOrderPublishRequestTest(client);
//
//
//        hifiveOrderRefundRequestTest(client);
//        hifiveOrderTagRequestTest(client);
//        hifiveTrafficTagRequestTest(client);
//        hifiveTrafficGroupRequestTest(client);
//        hifiveOrderGroupRequestTest(client);
//
//
//        hifiveTrafficTagSheetRequestTest(client);
//        hifiveOrderTagSheetRequestTest(client);
//        hifiveTrafficGroupSheetRequestTest(client);
//        hifiveOrderGroupSheetRequestTest(client);
//        hifiveTrafficSheetMusicRequestTest(client);
//        hifiveOrderSheetMusicRequestTest(client);
//
//
//        hifiveOrderListenRequestTest(client);
        hifiveTrafficListenRequestTest(client);
//        hifiveOrderListenSliceRequestTest(client);
//        hifiveTrafficListenSliceRequestTest(client);
//        hifiveOrderListenMixedRequestTest(client);
//        hifiveTrafficListenMixedRequestTest(client);
//
//
//        hifiveOrderSearchMusicRequestTest(client);
//        hifiveTrafficSearchMusicRequestTest(client);
//        hifiveTrafficTagMusicRequestTest(client);
//        hifiveOrderTagMusicRequestTest(client);
//        hifiveTrafficDownloadRequestTest(client);
    }

//    private static void HifiveBaseLoginRequest(HFClient client) {
//        HFBaseLoginRequest1 request = new HFBaseLoginRequest1();
//        request.setMethod(HFRequest.METHOD_POST);
//        request.setBirthday(1594639058);
//        request.setCountry("乐山");
//        request.setEducation(EducationEnum.MIDDLE_SCHOOLE.ordinal());
//        request.setGender(GenderEnum.MAN.ordinal());
//        request.setNickname("谎言");
//        request.setClientId("1223234343");
//        request.setProfession(8);
//        request.setIsOrganization(true);
//        request.setFavoriteSinger("周杰伦");
//        request.setFavoriteGenre("1");
//        try {
//            HFBaseLoginResponse response = client.execute(request);
//            System.out.println(JSON.toJSON(response));
//        } catch (ApiException e) {
//            e.printStackTrace();
//        }
//    }

    private static void hifiveHFAuthorizeMusicDetailRequest(HFClient client){
        HFAuthorizeMusicDetailRequest request = new HFAuthorizeMusicDetailRequest();
        request.setMethod(HFRequest.METHOD_POST);
        List<String> musicId = new ArrayList<>();
        musicId.add("1D653D0C377");
        musicId.add("C3B9C96F668F");
        request.setMusicIds(String.join(",",musicId));
        request.setClientId("1223234343");
        try {
            HFAuthorizeMusicDetailResponse response =  client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveBaseReportRequest(HFClient client) {
        HFBaseReportRequest request = new HFBaseReportRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setAction(1009);
        request.setTargetId("B75C80A41E3A");
        request.setClientId("1223234343");
        request.setToken("22a772b569c714daa9d4d5a8a05e299f");
        try {
            HFBaseReportResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveBaseHotRequestTest(HFClient client) {
        HFBaseHotRequest request = new HFBaseHotRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setPage(1);
        request.setPageSize(10);
        request.setStartTime(System.currentTimeMillis() / 1000);
        request.setDuration(180);
        request.setClientId("1223234343b");
        request.setVersion("V4.1.2");
        request.setToken("a0ef39d567c08eadb3da1f1b60728e67");
        try {
            HFBaseHotResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveBaseFavoriteRequestTest(HFClient client) {
        HFBaseFavoriteRequest request = new HFBaseFavoriteRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setPage(1);
        request.setPageSize(20);
        request.setClientId("1223234343");
        request.setToken("697f43bae01073cf7925027615c9661b");
        try {
            HFBaseFavoriteResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveBaseVisualRequestTest(HFClient client) {
        HFBaseVisualRequest request = new HFBaseVisualRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setLocation("30.779164,103.94547");
        request.setToken("4f6d6841972afd2ea9ccebad56143ac8");
        try {
            HFBaseVisualResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveBaseWeatherRequestTest(HFClient client) {
        HFBaseWeatherRequest request = new HFBaseWeatherRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setLocation("30.779164,103.94547");
        request.setToken("hifiveBaseWeatherRequestTest");
        try {
            HFBaseWeatherResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveMusicConfigRequestTest(HFClient client) {
        HFMusicConfigRequest request = new HFMusicConfigRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        try {
            HFMusicConfigResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveSearchMusicRequestTest(HFClient client) {
        HFSearchMusicRequest request = new HFSearchMusicRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setPage(1);
        request.setPageSize(10);
        request.setVersion("V4.1.2");
//        request.setTagIds("1000");
//        request.setSearchFiled(SearchFiledEnum.MUSIC.getValue());
//        request.setSearchFiled("aa");
        request.setSearchSmart(SearchSmartEnum.YES.getValue());
        request.setKeyword("古典");
//        request.setNonce("fee23fwy9cef16fsw6387wg7m61uw676");
        request.setClientId("test_hifive_123");
        try {
            HFSearchMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveSheetTagRequestTest(HFClient client) {
        HFSheetTagRequest request = new HFSheetTagRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        try {
            HFSheetTagResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTagSheetRequestTest(HFClient client) {
        HFTagSheetRequest request = new HFTagSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setRecoNum(2);
        try {
            HFTagSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveSheetMusicRequestTest(HFClient client) {
        HFSheetMusicRequest request = new HFSheetMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setSheetId(3818L);
        request.setLanguage(1);
        request.setPage(1);
        request.setPageSize(5);
        try {
            HFSheetMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void HifiveOrderAuthorizationRequestTest(HFClient client) {
        HFOrderAuthorizationRequest request = new HFOrderAuthorizationRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setCompanyName("meiyang4");
        request.setArea(AreaEnum.GLOBLE.getValue());
        request.setBrand("meiyang4");
        request.setPeriod(PeriodEnum.THREE_YEAR.getValue());
        request.setProjectName("meiyang4");
        request.setOrderIds("101");
        request.setVersion("V4.1.1");
        try {
            HFOrderAuthorizationResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveChannelRequestTest(HFClient client) {
        HFChannelRequest request = new HFChannelRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        try {
            HFChannelResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveChannelSheetRequestTest(HFClient client) {
        HFChannelSheetRequest request = new HFChannelSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setGroupId("6ShwOxc02Z4");
        request.setLanguage(LangageEnum.CN.getValue());
        request.setRecoNum(10);
        request.setPage(1);
        request.setPageSize(10);
        request.setVersion("V4.1.2");

        try {
            HFChannelSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveHQListenRequestTest(HFClient client) {
        HFTrafficHQListenRequest request = new HFTrafficHQListenRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("InstaOpen202012010000360001");
        request.setMusicId("QDD3197B55B87");
        request.setVersion("V4.1.2");
        /*request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);*/
        try {
            HFTrafficHQListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveUGCListenRequestTest(HFClient client) {
        HFUGCHQListenRequest request = new HFUGCHQListenRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("InstaOpen202012010000360001");
        request.setMusicId("4B40A048E");
        request.setVersion("V4.0.1");
        /*request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);*/
        try {
            HFUGCHQListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveKListenRequestTest(HFClient client) {
        HFKHQListenRequest request = new HFKHQListenRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("InstaOpen202012010000360001");
        request.setMusicId("CE8ACF1D7057");
//        request.setMusicId("125F34E4045A");
//        request.setVersion("V4.1.2");
        request.setVersion("V4.1.2");
        request.setAudioFormat(AudioFormatEnum.AAC_320.format);
        request.setAudioRate(AudioFormatEnum.AAC_320.rate);
        try {
            HFKHQListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveTrafficReportListenRequestTest(HFClient client) {
        HFTrafficReportListenRequest request = new HFTrafficReportListenRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("InstaOpen202012010000360001");
        request.setMusicId("125F34CDDDF6");
        request.setTimestamp(System.currentTimeMillis());
        request.setDuration(10L);
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);
        try {
            HFTrafficReportListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveUGCReportListenRequestTest(HFClient client) {
        HFUGCReportListenRequest request = new HFUGCReportListenRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("InstaOpen202012010000360001");
        request.setMusicId("125F34CDDDF6");
        request.setTimestamp(System.currentTimeMillis());
        request.setDuration(10L);
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);
        try {
            HFUGCReportListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveKReportListenRequestTest(HFClient client) {
        HFKReportListenRequest request = new HFKReportListenRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("InstaOpen202012010000360001");
        request.setMusicId("125F34CDDDF6");
        request.setTimestamp(System.currentTimeMillis());
        request.setDuration(10L);
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);
        try {
            HFKReportListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HFTrailListen(HFClient client) {
        HFTrialRequest request = new HFTrialRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("HOomxI+g0HvxGKofmUVsnw==");
        request.setMusicId("2F0863F818");
        try {
            HFTrialResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void HFTrafficTrialTest(HFClient client) {
        HFTrafficTrialRequest request = new HFTrafficTrialRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("HOomxI+g0HvxGKofmUVsnw==");
        request.setMusicId("CFE6475822DF");
        try {
            HFTrafficTrialResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void HFUGCTrialTest(HFClient client) {
        HFUGCTrialRequest request = new HFUGCTrialRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("HOomxI+g0HvxGKofmUVsnw==");
        request.setMusicId("1D652176A6E");
        try {
            HFUGCTrialResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HFKTrialTest(HFClient client) {
        HFKTrialRequest request = new HFKTrialRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("HOomxI+g0HvxGKofmUVsnw==");
        request.setMusicId("CFE6475822DF");
        try {
            HFKTrialResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void HFOrderTrialTest(HFClient client) {
        HFOrderTrialRequest request = new HFOrderTrialRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("HOomxI+g0HvxGKofmUVsnw==");
        request.setMusicId("CFE6475822DF");
        try {
            HFOrderTrialResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveHQListenSliceRequestTest(HFClient client) {
        HFHQListenSliceRequest request = new HFHQListenSliceRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("InstaOpen202012010000360001");

        request.setMusicId("125F34CDDDF6");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);
        request.setIsMixed(true);
        request.setAuditionBegin(2);
        request.setAuditionEnd(100);
        try {
            HFHQListenSliceResponse response = client.execute(request);
            //System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderMusicRequestTest(HFClient client) {
        HFOrderMusicRequest request = new HFOrderMusicRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("1223234343");
        request.setOrderId("11111112312327");
        request.setSubject("nYyple");
        request.setClientId("meiyang");
        request.setWorkId("uEC00xeWbExGNilHpSN7MoM3AalWqwUps");
        request.setVersion("V4.1.2");
        request.setMusic("[{\"versionId\":\"2F0881B569\",\"price\":20,\"num\":1}]");
        request.setTotalFee(10);
        request.setDeadline(50);
        request.setLanguage(LangageEnum.CN.getValue());
        request.setAudioFormat(AudioFormatEnum.AAC_320.format);
        request.setAudioRate(AudioFormatEnum.AAC_320.rate);
        try {
            HFOrderMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderPublishRequestTest(HFClient client) {
        HFOrderPublishRequest request = new HFOrderPublishRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("1223234343");
        request.setOrderId("1434556569145");
        request.setClientId("DXQOY");
        request.setWorkId("uEC00xeWbExGNilHpSN7MoM3AalWqwUp1");
        try {
            HFOrderPublishResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderDetailRequestTest(HFClient client) {
        HFOrderDetailRequest request = new HFOrderDetailRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setOrderId("aaaaaaaaaaaaaaaaaa1");
        try {
            HFOrderDetailResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveOrderRefundRequestTest(HFClient client) {
        HFOrderRefundRequest request = new HFOrderRefundRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("1223234343");
        request.setOrderId("1434556569145");
        try {
            HFOrderRefundResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderTagRequestTest(HFClient client) {
        HFOrderTagRequest request = new HFOrderTagRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        try {
            HFOrderTagResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficTagRequestTest(HFClient client) {
        HFTrafficTagRequest request = new HFTrafficTagRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        try {
            HFTrafficTagResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficGroupRequestTest(HFClient client) {
        HFTrafficGroupRequest request = new HFTrafficGroupRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("InstaOpen202012010000360001");

        try {
            HFTrafficGroupResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveOrderGroupRequestTest(HFClient client) {
        HFOrderGroupRequest request = new HFOrderGroupRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        try {
            HFOrderGroupResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficTagSheetRequestTest(HFClient client) {
        HFTrafficTagSheetRequest request = new HFTrafficTagSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setRecoNum(2);
        try {
            HFTrafficTagSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderTagSheetRequestTest(HFClient client) {
        HFOrderTagSheetRequest request = new HFOrderTagSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setRecoNum(2);
        try {
            HFOrderTagSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficGroupSheetRequestTest(HFClient client) {
        HFTrafficGroupSheetRequest request = new HFTrafficGroupSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("InstaOpen202012010000360001");
        request.setGroupId("fGGIsKue5VT");
        request.setLanguage(LangageEnum.CN.getValue());
        request.setRecoNum(10);
        request.setPage(1);
        request.setPageSize(10);

        try {
            HFTrafficGroupSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveOrderGroupSheetRequestTest(HFClient client) {
        HFOrderGroupSheetRequest request = new HFOrderGroupSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setGroupId("csa0t86qv24");
        request.setLanguage(LangageEnum.CN.getValue());
        request.setRecoNum(10);
        request.setPage(2);
        request.setPageSize(10);

        try {
            HFOrderGroupSheetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficSheetMusicRequestTest(HFClient client) {
        HFTrafficSheetMusicRequest request = new HFTrafficSheetMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("InstaOpen202012010000360001");
        request.setSheetId(1935L);
        try {
            HFTrafficSheetMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveOrderSheetMusicRequestTest(HFClient client) {
        HFOrderSheetMusicRequest request = new HFOrderSheetMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");
        request.setSheetId(1203L);
        try {
            HFOrderSheetMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderListenRequestTest(HFClient client) {
        HFOrderListenRequest request = new HFOrderListenRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setMusicId("B7B810AABADF");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);

        try {
            HFOrderListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficListenRequestTest(HFClient client) {
        HFTrafficListenRequest request = new HFTrafficListenRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setMusicId("C11B8AC160B5");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);

        try {
            HFTrafficListenResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderListenSliceRequestTest(HFClient client) {
        HFOrderListenSliceRequest request = new HFOrderListenSliceRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setMusicId("B7B810AABADF");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);
        request.setMixed(true);
        request.setAuditionBegin(2);
        request.setAuditionEnd(100);
        try {
            HFOrderListenSliceResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficListenSliceRequestTest(HFClient client) {
        HFTrafficListenSliceRequest request = new HFTrafficListenSliceRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setMusicId("B7B810AABADF");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);
        request.setMixed(true);
        request.setAuditionBegin(2);
        request.setAuditionEnd(100);
        try {
            HFTrafficListenSliceResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderListenMixedRequestTest(HFClient client) {
        HFOrderListenMixedRequest request = new HFOrderListenMixedRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setMusicId("B7B810AABADF");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);

        try {
            HFOrderListenMixedResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficListenMixedRequestTest(HFClient client) {
        HFTrafficListenMixedRequest request = new HFTrafficListenMixedRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setMusicId("B7B810AABADF");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);
        try {
            HFTrafficListenMixedResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderSearchMusicRequestTest(HFClient client) {
        HFOrderSearchMusicRequest request = new HFOrderSearchMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setKeyword("a");


        try {
            HFOrderSearchMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficSearchMusicRequestTest(HFClient client) {
        HFTrafficSearchMusicRequest request = new HFTrafficSearchMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setKeyword("a");


        try {
            HFTrafficSearchMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void hifiveTrafficTagMusicRequestTest(HFClient client) {
        HFTrafficTagMusicRequest request = new HFTrafficTagMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setTagId("5440");


        try {
            HFTrafficTagMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOrderTagMusicRequestTest(HFClient client) {
        HFOrderTagMusicRequest request = new HFOrderTagMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setTagId("5440");


        try {
            HFOrderTagMusicResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveTrafficDownloadRequestTest(HFClient client) {
        HFTrafficDownloadRequest request = new HFTrafficDownloadRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("1223234343");

        request.setMusicId("B7B810AABADF");
        request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);


        try {
            HFTrafficDownloadResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void hifiveOpenMemberLoginRequest(HFClient client) throws ApiException {
        HFBaseLoginRequest request = new HFBaseLoginRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setVersion("V4.1.2");
        request.setCountry("乐山");
//        request.setAppId("300a44d050c942eebeae8765a878b0ee");
        request.setEducation(EducationEnum.MIDDLE_SCHOOLE.ordinal());
        request.setGender(GenderEnum.MAN.ordinal());
        request.setNickname("谎言");
        request.setClientId("test_hifive_123");
        request.setProfession(8);
        request.setIsOrganization(true);
        request.setFavoriteSinger("周杰伦");
        request.setFavoriteGenre("1");
        request.setFavoriteSinger("周杰伦");
        request.setTimestamp(System.currentTimeMillis());
        HFBaseLoginResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hifiveOpenMemberSheetRequestRequest(HFClient client) throws ApiException {
        HFMemberSheetRequest request = new HFMemberSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setVersion("V4.1.2");
        request.setClientId("test_hifive_123");
        request.setTimestamp(System.currentTimeMillis());
        request.setPage(1);
        request.setPageSize(10);
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MzAwNjEwMTcsImlhdCI6MTYyNTU2ODIxN30.1DY9C20OseJHDgUquSBN_6raYdhK7mIwnZKM5PtY4nw");
        request.setTimestamp(System.currentTimeMillis());
        HFMemberSheetResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hifiveOpenMemberSheetMusicRequestRequest(HFClient client) throws ApiException {
        HFMemberSheetMusicRequest request = new HFMemberSheetMusicRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("test_hifive_123");
        request.setVersion("V4.1.2");
//        request.setMusicId("B7B810A5B4B7");
        request.setSheetId(27988L);
        request.setTimestamp(System.currentTimeMillis());
        request.setPage(1);
        request.setPageSize(10);
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MzAwNjEwMTcsImlhdCI6MTYyNTU2ODIxN30.1DY9C20OseJHDgUquSBN_6raYdhK7mIwnZKM5PtY4nw");
        request.setTimestamp(System.currentTimeMillis());
        HFMemberSheetMusicResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hifiveOpenMemberSheetMusicAddRequestRequest(HFClient client) throws ApiException {
        HFAddMemberSheetMusicRequest request = new HFAddMemberSheetMusicRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setVersion("V4.1.2");
        request.setClientId("test_hifive_123");
        request.setMusicId("C3AC0F17E56B");
        request.setSheetId(26781L);
        request.setTimestamp(System.currentTimeMillis());
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjY2MTExOTUsImlhdCI6MTYyMjExODM5NX0.8uIw2UTyZA9wNNUrQD1QXgw3dbUeGCzCejvcEkGNRIo");
        request.setTimestamp(System.currentTimeMillis());
        HFAddMemberSheetMusicResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hFOpenMemberSheetMusicDeleteRequest(HFClient client) throws ApiException {
        HFRemoveMemberSheetMusicRequest request = new HFRemoveMemberSheetMusicRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("test_hifive_123");
        request.setVersion("V4.1.2");
        List<String> musicId = new ArrayList<>();
        musicId.add("C3AC0F17E56B");
        request.setMusicId(musicId);
        request.setSheetId(26781L);
        request.setTimestamp(System.currentTimeMillis());
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjY5MzY1NTEsImlhdCI6MTYyMjQ0Mzc1MX0.h10wt28v9E4Fsh3dvtet3GeC9lIjYbEr2OpRDXw-bqg");
        request.setTimestamp(System.currentTimeMillis());
        HFRemoveMemberSheetMusicResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hFCreateMemberSheetRequest(HFClient client) throws ApiException {
        HFCreateMemberSheetRequest request = new HFCreateMemberSheetRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("test_hifive_123");
        request.setVersion("V4.1.2");
        request.setSheetName("中国风3");
        request.setTimestamp(System.currentTimeMillis());
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjY2MTExOTUsImlhdCI6MTYyMjExODM5NX0.8uIw2UTyZA9wNNUrQD1QXgw3dbUeGCzCejvcEkGNRIo");
        request.setTimestamp(System.currentTimeMillis());
        HFCreateMemberSheetResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hFClearSearchHistoryRequest(HFClient client) throws ApiException {
        HFClearSearchHistoryRequest request = new HFClearSearchHistoryRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("test_hifive_123");
        request.setVersion("V4.1.2");
        request.setTimestamp(System.currentTimeMillis());
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjY1ODczMTQsImlhdCI6MTYyMjA5NDUxNH0.r_PeM-EMiUYV-SXr7IT2gZR9VHgPZPnI2T2Fc3N4yfw");
        request.setTimestamp(System.currentTimeMillis());
        HFClearSearchHistoryResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
}


    private static void hFClearMemberSheetMusicRequest(HFClient client) throws ApiException {
        HFClearMemberSheetMusicRequest request = new HFClearMemberSheetMusicRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("test_hifive_123");
        request.setVersion("V4.1.2");
        request.setSheetId(26781L);
        request.setTimestamp(System.currentTimeMillis());
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjY1ODczMTQsImlhdCI6MTYyMjA5NDUxNH0.r_PeM-EMiUYV-SXr7IT2gZR9VHgPZPnI2T2Fc3N4yfw");
        request.setTimestamp(System.currentTimeMillis());
        HFClearMemberSheetMusicResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hFDeleteMemberSheetRequest(HFClient client) throws ApiException {
        HFDeleteMemberSheetRequest request = new HFDeleteMemberSheetRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setClientId("test_hifive_123");
        request.setVersion("V4.1.2");
        request.setSheetId(27162L);
        request.setTimestamp(System.currentTimeMillis());
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjY1ODczMTQsImlhdCI6MTYyMjA5NDUxNH0.r_PeM-EMiUYV-SXr7IT2gZR9VHgPZPnI2T2Fc3N4yfw");
        request.setTimestamp(System.currentTimeMillis());
        HFDeleteMemberSheetResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }



    private static void hFSearchHistoryRequest(HFClient client) throws ApiException {
        HFSearchHistoryRequest request = new HFSearchHistoryRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("test_hifive_123");
        request.setVersion("V4.1.2");
        request.setPage(1);
        request.setPageSize(20);
        request.setTimestamp(System.currentTimeMillis());
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiIyMTg0ZDJhYTY4NzA0ZmI1YTkiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjY1ODczMTQsImlhdCI6MTYyMjA5NDUxNH0.r_PeM-EMiUYV-SXr7IT2gZR9VHgPZPnI2T2Fc3N4yfw");
        HFSearchHistoryResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


}
