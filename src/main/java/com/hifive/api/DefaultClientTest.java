package com.hifive.api;

import com.alibaba.fastjson.JSON;
import com.hifive.api.domain.constants.*;
import com.hifive.api.request.*;
import com.hifive.api.response.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DefaultClientTest {


    public static void main(String[] args) throws InterruptedException, ApiException {

        String url = "https://hifive-gateway-test.hifiveai.com";
        String appkey = "ee45ca73bf1746428b2a942e017056df";
        String secret = "cd231e0c8d314074b2";
        System.out.println("------------------------------------hifiveHQListenRequestTest");
        HFClient client = new DefaultHFClient(url, appkey, secret);

//        String url = "https://hifive-openapi-qa.hifiveai.com";
//        String appkey = "6bea19aa99a14d6d866dbb8c46c32819";
//        String secret = "a9dc8d2219e54833ad";
//        System.out.println("------------------------------------hifiveHQListenRequestTest");
//        HFClient client = new DefaultHFClient(url, appkey, secret);
//        HifiveBaseLoginRequest(client);
//        String url = "https://gateway.open.hifiveai.com";
//        String appkey = "955342864fc74400b3a53952b00ca9d2";
//        String secret = "1d6e5f81aeb84871aa";
//        System.out.println("------------------------------------hifiveHQListenRequestTest");
//        HFClient client = new DefaultHFClient(url, appkey, secret);

        hifiveOpenMemberLoginRequest(client);

        //OpenApi C端
        hifiveOpenMemberSheetRequestRequest(client);


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
      /*  System.out.println("------------------------------------hifiveHQListenRequestTest");
        for (int i = 0;i<10; i++) {

          //  long time = System.currentTimeMillis();
            hifiveHQListenRequestTest(client);
            //long time2 = System.currentTimeMillis();
            //System.out.println("hifiveHQListenRequestTest-----------------" + (time2 - time));
            Thread.sleep(1000);
        }
        System.out.println("------------------------------------hifiveHQListenRequestTest");


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
        //HifiveBaseLoginRequest(client);
        //  HifiveBaseLoginRequest(client);
        /*hifiveSearchMusicRequestTest(client);*/
//        hifiveBaseFavoriteRequestTest(client);
//        hifiveBaseVisualRequestTest(client);
//        hifiveBaseWeatherRequestTest(client);
//
//        hifiveMusicConfigRequestTest(client);
//        hifiveSearchMusicRequestTest(client);
//        hifiveSheetTagRequestTest(client);
//        hifiveTagSheetRequestTest(client);
//        hifiveSheetMusicRequestTest(client);
//        HifiveOrderAuthorizationRequestTest(client);
//
//
//        hifiveChannelRequestTest(client);
//        hifiveChannelSheetRequestTest(client);
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
//        hifiveTrafficListenRequestTest(client);
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

    private static void HifiveBaseLoginRequest(HFClient client) {
        HFBaseLoginRequest request = new HFBaseLoginRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setBirthday(1594639058);
        request.setCountry("乐山");
        request.setEducation(EducationEnum.MIDDLE_SCHOOLE.ordinal());
        request.setGender(GenderEnum.MAN.ordinal());
        request.setNickname("谎言");
        request.setClientId("1223234343");
        request.setProfession(8);
        request.setIsOrganization(true);
        request.setFavoriteSinger("周杰伦");
        request.setFavoriteGenre("1");
        try {
            HFBaseLoginResponse response = client.execute(request);
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
        request.setPageSize(20);
        request.setStartTime(1594639058L);
        request.setDuration(183);
        request.setClientId("1223234343");
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
        request.setToken("b227395ef5037e6f16bce9d0e5e29b90");
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
//        request.setTagIds("1000");
        request.setSearchFiled(SearchFiledEnum.MUSIC.getValue());
//        request.setSearchFiled("aa");
//        request.setSearchSmart(SearchSmartEnum.NO.getValue());
        request.setKeyword("情");
//        request.setNonce("fee23fwy9cef16fsw6387wg7m61uw676");
        request.setClientId("jisuapi55667788");
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
        request.setSheetId(1203L);
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

        request.setCompanyName("嗨翻屋d1g");
        request.setArea(AreaEnum.GLOBLE.getValue());
        request.setBrand("HIFIVE音乐开放平台");
        request.setPeriod(PeriodEnum.THREE_YEAR.getValue());
        request.setProjectName("小嗨nbdb");
        request.setOrderIds("hifivecd79222bdf214390813221a7e0c0e42d");
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
//        request.setGroupId("yIhufTMANVCBBB");
        request.setLanguage(LangageEnum.CN.getValue());
        request.setRecoNum(10);
        request.setPage(1);
        request.setPageSize(10);

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
        request.setMusicId("2F087F2A41");
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
        request.setMusicId("2F084494DE");
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
        request.setMusicId("2F084494DE");
        /*request.setAudioFormat(AudioFormatEnum.MP3_128.format);
        request.setAudioRate(AudioFormatEnum.MP3_128.rate);*/
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
        request.setMusicId("7867AEFA");
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
        request.setMusicId("CFE6475822DF");
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
        request.setOrderId("sfsdfs");
        request.setSubject("nYyple");
        request.setClientId("DXQOY");
        request.setWorkId("uEC00xeWbExGNilHpSN7MoM3AalWqwUp");
        request.setMusic("[{\"versionId\":\"2F084494DE\",\"price\":20,\"num\":1}]");
        request.setTotalFee(1556);
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

        request.setMusicId("B7B810AABADF");
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
        HFOpenMemberLoginRequest request = new HFOpenMemberLoginRequest();
        request.setMethod(HFRequest.METHOD_POST);
        request.setNickname("meiyang");
        request.setDeviceId("dfkjdkf");
        request.setAppId("ee45ca73bf1746428b2a942e017056df");
        request.setTimestamp(System.currentTimeMillis());
        request.setBirthday(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
        request.setGender(GenderEnum.MAN.ordinal());
        request.setClientId("meiyang");
//        request.setFavoriteSinger("周杰伦");
        HFOpenMemberLoginResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }


    private static void hifiveOpenMemberSheetRequestRequest(HFClient client) throws ApiException {
        HFOpenMemberSheetRequest request = new HFOpenMemberSheetRequest();
        request.setMethod(HFRequest.METHOD_GET);
        request.setClientId("meiyang");
        request.setTimestamp(System.currentTimeMillis());
        request.setPage(1);
        request.setPageSize(10);
        request.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzZWNyZXRLZXkiOiI2ZGJhMTg2ZjBiMDY0MzM0YmYiLCJpc3MiOiJoaWZpdmUiLCJleHAiOjE2MjUxNTgzNDcsImlhdCI6MTYyMDY2NTU0N30.LIdOXGpUXgXrNDbJHhMGsPY-LV6SwSWqH52eayND-K8");
        request.setTimestamp(System.currentTimeMillis());
        HFOpenMemberSheetResponse response = client.execute(request);
        System.out.println(JSON.toJSON(response));
    }
}
