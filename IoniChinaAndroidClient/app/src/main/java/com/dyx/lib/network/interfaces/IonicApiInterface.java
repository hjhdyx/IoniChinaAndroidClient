package com.dyx.lib.network.interfaces;

import com.dyx.lib.model.GetMessageCountModel;
import com.dyx.lib.model.GetMessagesModel;
import com.dyx.lib.model.GetTopicsIdModel;
import com.dyx.lib.model.GetTopicsModel;
import com.dyx.lib.model.GetUserLoginnameModel;
import com.dyx.lib.model.PostAccesstokenModel;
import com.dyx.lib.model.PostMessageMarkAllModel;
import com.dyx.lib.model.PostReplyReplyIdUpsModel;
import com.dyx.lib.model.PostTopicCollectModel;
import com.dyx.lib.model.PostTopicDeCollectModel;
import com.dyx.lib.model.PostTopicTopicIdRepliesModel;
import com.dyx.lib.model.PostTopicsModel;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * project name：IoniChinaAndroidClient
 * class describe：
 * create person：dayongxin
 * create time：16/9/11 下午1:56
 * alter person：dayongxin
 * alter time：16/9/11 下午1:56
 * alter remark：
 */
public interface IonicApiInterface {
    /**
     * 主题首页
     */
    @GET("api/v1/topics")
    Call<GetTopicsModel> getTopics(@Path("page") int page, @Path("tab") String tab,
                                   @Path("limit") int limit, @Path("mdrender") String mdrender);

    /**
     * 主题详情
     */
    @GET("api/v1/topics/{id}")
    Call<GetTopicsIdModel> getTopicsById(@Path("id") String id, @Path("mdrender") String mdrender);

    /**
     * TODO 新建主题
     */
    @POST("api/v1/topics")
    Call<PostTopicsModel> postTopics();

    /**
     * TODO 收藏主题
     */
    @POST("api/v1/topic/collect")
    Call<PostTopicCollectModel> postTopicCollect();

    /**
     * TODO 取消收藏
     */
    @POST("api/v1/topic/de_collect")
    Call<PostTopicDeCollectModel> postTopicDeCollect();

    /**
     * TODO 新建评论
     */
    @POST("api/v1/topic/{topic_id}/replies")
    Call<PostTopicTopicIdRepliesModel> postTopicTopicIdReplies(@Path("topic_id") String topic_id);

    /**
     * TODO 为评论点赞
     */
    @POST("api/v1/reply/{reply_id}/ups")
    Call<PostReplyReplyIdUpsModel> postReplyReplyIdUps(@Path("reply_id") String reply_id);

    /**
     * TODO 用户详情
     */
    @GET("api/v1/user/{loginname}")
    Call<GetUserLoginnameModel> getUserLoginname(@Path("loginname") String loginname);

    /**
     * TODO 验证 accessToken 的正确性
     */
    @POST("api/v1/accesstoken")
    Call<PostAccesstokenModel> PostAccesstoken();

    /**
     * TODO 获取未读消息数
     */
    @GET("api/v1/message/count")
    Call<GetMessageCountModel> getMessageCount();

    /**
     * TODO 获取已读和未读消息
     */
    @GET("api/v1/messages")
    Call<GetMessagesModel> getMessages();

    /**
     * TODO 标记全部已读
     */
    @POST("api/v1/message/mark_all")
    Call<PostMessageMarkAllModel> postMessageMarkAll();
}
