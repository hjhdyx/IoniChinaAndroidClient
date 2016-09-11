package com.dyx.lib.model;

import java.util.List;

/**
 * project name：IoniChinaAndroidClient
 * class describe：
 * create person：dayongxin
 * create time：16/9/11 下午2:24
 * alter person：dayongxin
 * alter time：16/9/11 下午2:24
 * alter remark：
 */
public class GetTopicsIdModel {

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
     * replies : [{"id":"57d20100923729fc0511b7b4","author":{"loginname":"kinglike","avatar_url":"https://avatars.githubusercontent.com/u/17474790?v=3&s=120"},"content":"<div class=\"markdown-text\"><p>同样关注<\/p>\n<\/div>","ups":[],"create_at":"2016-09-09T00:23:28.431Z"},{"id":"57d2663e923729fc0511b7bb","author":{"loginname":"menghanxing","avatar_url":"https://avatars.githubusercontent.com/u/21241517?v=3&s=120"},"content":"<div class=\"markdown-text\"><p><a href=\"/user/kinglike\">@kinglike<\/a> 哈哈，已经解决，查看分享，我已经发布了，你看下<\/p>\n<\/div>","ups":[],"create_at":"2016-09-09T07:35:26.498Z"},{"id":"57d4ccde923729fc0511b7c9","author":{"loginname":"shilcheng","avatar_url":"https://avatars.githubusercontent.com/u/5350546?v=3&s=120"},"content":"<div class=\"markdown-text\"><p>ff<\/p>\n<\/div>","ups":[],"create_at":"2016-09-11T03:17:50.389Z"}]
     */

    private DataEntity data;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
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
        /**
         * id : 57d20100923729fc0511b7b4
         * author : {"loginname":"kinglike","avatar_url":"https://avatars.githubusercontent.com/u/17474790?v=3&s=120"}
         * content : <div class="markdown-text"><p>同样关注</p>
         </div>
         * ups : []
         * create_at : 2016-09-09T00:23:28.431Z
         */

        private List<RepliesEntity> replies;

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

        public List<RepliesEntity> getReplies() {
            return replies;
        }

        public void setReplies(List<RepliesEntity> replies) {
            this.replies = replies;
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

        public static class RepliesEntity {
            private String id;
            /**
             * loginname : kinglike
             * avatar_url : https://avatars.githubusercontent.com/u/17474790?v=3&s=120
             */

            private AuthorEntity author;
            private String content;
            private String create_at;
            private List<?> ups;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public AuthorEntity getAuthor() {
                return author;
            }

            public void setAuthor(AuthorEntity author) {
                this.author = author;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getCreate_at() {
                return create_at;
            }

            public void setCreate_at(String create_at) {
                this.create_at = create_at;
            }

            public List<?> getUps() {
                return ups;
            }

            public void setUps(List<?> ups) {
                this.ups = ups;
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
}
