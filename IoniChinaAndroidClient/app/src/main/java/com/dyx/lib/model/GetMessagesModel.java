package com.dyx.lib.model;

import java.util.List;

/**
 * project name：IoniChinaAndroidClient
 * class describe：
 * create person：dayongxin
 * create time：16/9/11 下午4:01
 * alter person：dayongxin
 * alter time：16/9/11 下午4:01
 * alter remark：
 */
public class GetMessagesModel {

    private DataEntity data;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public static class DataEntity {
        private List<?> has_read_messages;
        /**
         * id : 543fb7abae523bbc80412b26
         * type : at
         * has_read : false
         * author : {"loginname":"DongHongfei","avatar_url":"https://avatars.githubusercontent.com/u/5700428?v=3"}
         * topic : {"id":"542d6ecb9ecb3db94b2b3d0f","title":"adfadfadfasdf","last_reply_at":"2014-10-18T07:47:22.563Z"}
         * reply : {"id":"543fb7abae523bbc80412b24","content":"[@DongHongfei](/user/DongHongfei) 哼哼哈嘿","ups":[],"create_at":"2014-10-16T12:18:51.566Z"}
         */

        private List<HasnotReadMessagesEntity> hasnot_read_messages;

        public List<?> getHas_read_messages() {
            return has_read_messages;
        }

        public void setHas_read_messages(List<?> has_read_messages) {
            this.has_read_messages = has_read_messages;
        }

        public List<HasnotReadMessagesEntity> getHasnot_read_messages() {
            return hasnot_read_messages;
        }

        public void setHasnot_read_messages(List<HasnotReadMessagesEntity> hasnot_read_messages) {
            this.hasnot_read_messages = hasnot_read_messages;
        }

        public static class HasnotReadMessagesEntity {
            private String id;
            private String type;
            private boolean has_read;
            /**
             * loginname : DongHongfei
             * avatar_url : https://avatars.githubusercontent.com/u/5700428?v=3
             */

            private AuthorEntity author;
            /**
             * id : 542d6ecb9ecb3db94b2b3d0f
             * title : adfadfadfasdf
             * last_reply_at : 2014-10-18T07:47:22.563Z
             */

            private TopicEntity topic;
            /**
             * id : 543fb7abae523bbc80412b24
             * content : [@DongHongfei](/user/DongHongfei) 哼哼哈嘿
             * ups : []
             * create_at : 2014-10-16T12:18:51.566Z
             */

            private ReplyEntity reply;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isHas_read() {
                return has_read;
            }

            public void setHas_read(boolean has_read) {
                this.has_read = has_read;
            }

            public AuthorEntity getAuthor() {
                return author;
            }

            public void setAuthor(AuthorEntity author) {
                this.author = author;
            }

            public TopicEntity getTopic() {
                return topic;
            }

            public void setTopic(TopicEntity topic) {
                this.topic = topic;
            }

            public ReplyEntity getReply() {
                return reply;
            }

            public void setReply(ReplyEntity reply) {
                this.reply = reply;
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

            public static class TopicEntity {
                private String id;
                private String title;
                private String last_reply_at;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
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
            }

            public static class ReplyEntity {
                private String id;
                private String content;
                private String create_at;
                private List<?> ups;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
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
            }
        }
    }
}
