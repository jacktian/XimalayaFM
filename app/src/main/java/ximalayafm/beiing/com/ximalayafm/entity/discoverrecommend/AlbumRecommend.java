package ximalayafm.beiing.com.ximalayafm.entity.discoverrecommend;

import org.json.JSONException;
import org.json.JSONObject;

import ximalayafm.beiing.com.ximalayafm.entity.AlbumBasic;

/**
 * Created by Administrator on 2015/10/21.
 */
public class AlbumRecommend extends AlbumBasic {
    /**
     * "albumId": 344497,
     "coverLarge": "http://fdfs.xmcdn.com/group6/M02/35/45/wKgDhFTg4w_SDkc9AAT-fXngGBY184_mobile_large.jpg",
     "title": "黑先生在麦田咖啡馆",
     "tags": "民谣,80后,文艺",
     "tracks": 117,


     "playsCounts": 917714,
     "isFinished": 0,
     "trackId": 7898099,
     "trackTitle": "几米：音乐与绘本的美好邂逅"
     */
    private long playsCounts;
    private int isFinished;
    private long trackId;
    private String trackTitle;

    public void parseJson(JSONObject json) throws JSONException {
        super.parseJson(json);
        if(json != null){
            playsCounts = json.optLong("playsCounts", 0);
            isFinished = json.optInt("isFinished", 0);
            trackId = json.getLong("trackId");
            trackTitle = json.getString("trackTitle");
        }
    }




}
