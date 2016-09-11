package com.dyx.lib.model;

import java.util.List;

/**
 * project name：IoniChinaAndroidClient
 * class describe：
 * create person：dayongxin
 * create time：16/9/11 下午3:50
 * alter person：dayongxin
 * alter time：16/9/11 下午3:50
 * alter remark：
 */
public class GetUserLoginnameModel {

    /**
     * loginname : DongHongfei
     * avatar_url : https://avatars.githubusercontent.com/u/5700428?v=3&s=120
     * githubUsername : DongHongfei
     * create_at : 2015-02-16T04:44:05.468Z
     * score : 855
     * recent_topics : [{"id":"56fa9d8ecd63e4247a7cfc58","author":{"loginname":"DongHongfei","avatar_url":"https://avatars.githubusercontent.com/u/5700428?v=3&s=120"},"title":"Ionichina 社区管理员招募","last_reply_at":"2016-06-30T02:17:54.200Z"},{"id":"567e54f058c6c76d17fde088","author":{"loginname":"DongHongfei","avatar_url":"https://avatars.githubusercontent.com/u/5700428?v=3&s=120"},"title":"至ionichina社区成员的一封信","last_reply_at":"2016-03-28T02:31:32.881Z"},{"id":"5659dcedb903cba630e2600d","author":{"loginname":"DongHongfei","avatar_url":"https://avatars.githubusercontent.com/u/5700428?v=3&s=120"},"title":"【12.12北京】DevOps｜探索硅谷技术元素","last_reply_at":"2015-11-28T16:57:17.740Z"},{"id":"55954802a2b61ca05f2f3dd2","author":{"loginname":"DongHongfei","avatar_url":"https://avatars.githubusercontent.com/u/5700428?v=3&s=120"},"title":"【公告】社区设置了 ShowCase 栏目， 那么我自己的应用该如何出现在 ShowCase 里？","last_reply_at":"2016-04-21T07:59:51.062Z"},{"id":"555f205aef16811c3ea0a79a","author":{"loginname":"DongHongfei","avatar_url":"https://avatars.githubusercontent.com/u/5700428?v=3&s=120"},"title":"【公告】Ioniclub -- ionichina社区移动客户端来了，求拍砖、求吐槽","last_reply_at":"2016-08-16T08:45:21.185Z"}]
     * recent_replies : [{"id":"57c92e17923729fc0511b78d","author":{"loginname":"istrwei","avatar_url":"https://avatars.githubusercontent.com/u/10282484?v=3&s=120"},"title":"加个友链呗","last_reply_at":"2016-09-04T10:45:18.172Z"},{"id":"571d76d39422986b7d12733f","author":{"loginname":"dujuanxian","avatar_url":"https://avatars.githubusercontent.com/u/1219249?v=3&s=120"},"title":"Ionichina iOS app不能下载？","last_reply_at":"2016-05-04T11:13:55.440Z"},{"id":"570e0fdacd63e4247a7cfd14","author":{"loginname":"lhw5123","avatar_url":"https://avatars.githubusercontent.com/u/6531354?v=3&s=120"},"title":"极光推送 cordova / PhoneGap 插件更新啦 ^ ^","last_reply_at":"2016-04-15T01:40:55.430Z"},{"id":"57053c4ccd63e4247a7cfcc7","author":{"loginname":"laoyipay","avatar_url":"https://avatars.githubusercontent.com/u/4304711?v=3&s=120"},"title":"Ionic 2支持Windows平台, 包括Surface, Window 10, Windows Phones!","last_reply_at":"2016-04-07T04:42:31.092Z"},{"id":"570314e8cd63e4247a7cfcba","author":{"loginname":"yuanhkp","avatar_url":"https://avatars.githubusercontent.com/u/12334690?v=3&s=120"},"title":"社区软件那个分享功能是用什么做的呢","last_reply_at":"2016-04-06T01:13:17.694Z"}]
     * collect_topics : [{"id":"555e920def2216e11f556c4e","author":{"loginname":"chapgaga","avatar_url":"https://avatars.githubusercontent.com/u/9590859?v=3&s=120"},"title":"这里有多少人是因为ionic上angular贼船的?","last_reply_at":"2015-05-24T03:10:29.582Z"},{"id":"5530a7b37288e1f23047ede0","author":{"loginname":"zxj963577494","avatar_url":"https://avatars.githubusercontent.com/u/6766515?v=3&s=120"},"title":"友盟统计Cordova插件分享","last_reply_at":"2016-05-25T03:30:52.492Z"}]
     */

    private DataEntity data;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public static class DataEntity {
        private String loginname;
        private String avatar_url;
        private String githubUsername;
        private String create_at;
        private int score;
        /**
         * id : 56fa9d8ecd63e4247a7cfc58
         * author : {"loginname":"DongHongfei","avatar_url":"https://avatars.githubusercontent.com/u/5700428?v=3&s=120"}
         * title : Ionichina 社区管理员招募
         * last_reply_at : 2016-06-30T02:17:54.200Z
         */

        private List<RecentTopicsEntity> recent_topics;
        /**
         * id : 57c92e17923729fc0511b78d
         * author : {"loginname":"istrwei","avatar_url":"https://avatars.githubusercontent.com/u/10282484?v=3&s=120"}
         * title : 加个友链呗
         * last_reply_at : 2016-09-04T10:45:18.172Z
         */

        private List<RecentRepliesEntity> recent_replies;
        /**
         * id : 555e920def2216e11f556c4e
         * author : {"loginname":"chapgaga","avatar_url":"https://avatars.githubusercontent.com/u/9590859?v=3&s=120"}
         * title : 这里有多少人是因为ionic上angular贼船的?
         * last_reply_at : 2015-05-24T03:10:29.582Z
         */

        private List<CollectTopicsEntity> collect_topics;

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

        public String getGithubUsername() {
            return githubUsername;
        }

        public void setGithubUsername(String githubUsername) {
            this.githubUsername = githubUsername;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public List<RecentTopicsEntity> getRecent_topics() {
            return recent_topics;
        }

        public void setRecent_topics(List<RecentTopicsEntity> recent_topics) {
            this.recent_topics = recent_topics;
        }

        public List<RecentRepliesEntity> getRecent_replies() {
            return recent_replies;
        }

        public void setRecent_replies(List<RecentRepliesEntity> recent_replies) {
            this.recent_replies = recent_replies;
        }

        public List<CollectTopicsEntity> getCollect_topics() {
            return collect_topics;
        }

        public void setCollect_topics(List<CollectTopicsEntity> collect_topics) {
            this.collect_topics = collect_topics;
        }

        public static class RecentTopicsEntity {
            private String id;
            /**
             * loginname : DongHongfei
             * avatar_url : https://avatars.githubusercontent.com/u/5700428?v=3&s=120
             */

            private AuthorEntity author;
            private String title;
            private String last_reply_at;

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

        public static class RecentRepliesEntity {
            private String id;
            /**
             * loginname : istrwei
             * avatar_url : https://avatars.githubusercontent.com/u/10282484?v=3&s=120
             */

            private AuthorEntity author;
            private String title;
            private String last_reply_at;

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

        public static class CollectTopicsEntity {
            private String id;
            /**
             * loginname : chapgaga
             * avatar_url : https://avatars.githubusercontent.com/u/9590859?v=3&s=120
             */

            private AuthorEntity author;
            private String title;
            private String last_reply_at;

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
