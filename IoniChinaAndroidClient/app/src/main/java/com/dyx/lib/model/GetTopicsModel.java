package com.dyx.lib.model;

import java.util.List;

/**
 * project name：IoniChinaAndroidClient
 * class describe：
 * create person：dayongxin
 * create time：16/9/11 下午1:58
 * alter person：dayongxin
 * alter time：16/9/11 下午1:58
 * alter remark：
 */
public class GetTopicsModel {

    /**
     * id : 57d12e2f923729fc0511b7b0
     * author_id : 57d12c63923729fc0511b7af
     * tab : ask
     * content : <div class="markdown-text"><p>大家有没有人用ionic2做实时通讯功能的，类似聊天室或聊天界面这样的效果，怎样引入socket.io与后台进行交互啊？？求大神指点</p>
     </div>
     * title : ionic2关于socket.io
     * last_reply_at : 2016-09-11T03:17:50.392Z
     * good : false
     * top : false
     * reply_count : 3
     * visit_count : 86
     * create_at : 2016-09-08T09:23:59.572Z
     * author : {"loginname":"menghanxing","avatar_url":"https://avatars.githubusercontent.com/u/21241517?v=3&s=120"}
     */

    private List<DataEntity> data;

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class DataEntity {
        private String id;
        private String author_id;
        private String tab;
        private String content;
        private String title;
        private String last_reply_at;
        private boolean good;
        private boolean top;
        private int reply_count;
        private int visit_count;
        private String create_at;
        /**
         * loginname : menghanxing
         * avatar_url : https://avatars.githubusercontent.com/u/21241517?v=3&s=120
         */

        private AuthorEntity author;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(String author_id) {
            this.author_id = author_id;
        }

        public String getTab() {
            return tab;
        }

        public void setTab(String tab) {
            this.tab = tab;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLast_reply_at() {
            return last_reply_at;
        }

        public void setLast_reply_at(String last_reply_at) {
            this.last_reply_at = last_reply_at;
        }

        public boolean isGood() {
            return good;
        }

        public void setGood(boolean good) {
            this.good = good;
        }

        public boolean isTop() {
            return top;
        }

        public void setTop(boolean top) {
            this.top = top;
        }

        public int getReply_count() {
            return reply_count;
        }

        public void setReply_count(int reply_count) {
            this.reply_count = reply_count;
        }

        public int getVisit_count() {
            return visit_count;
        }

        public void setVisit_count(int visit_count) {
            this.visit_count = visit_count;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public AuthorEntity getAuthor() {
            return author;
        }

        public void setAuthor(AuthorEntity author) {
            this.author = author;
        }

        public static class AuthorEntity {
            private String loginname;
            private String avatar_url;

            public String getLoginname() {
                return loginname;
            }

            public void setLoginname(String loginname) {
                this.loginname = loginname;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }
        }
    }
}
