package com.dyx.lib.model;

import java.util.List;

/**
 * project name：IoniChinaAndroidClient
 * class describe：
 * create person：dayongxin
 * create time：16/9/11 下午4:04
 * alter person：dayongxin
 * alter time：16/9/11 下午4:04
 * alter remark：
 */
public class PostMessageMarkAllModel {

    /**
     * success : true
     * marked_msgs : [{"id":"544ce385aeaeb5931556c6f9"}]
     */

    private boolean success;
    /**
     * id : 544ce385aeaeb5931556c6f9
     */

    private List<MarkedMsgsEntity> marked_msgs;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<MarkedMsgsEntity> getMarked_msgs() {
        return marked_msgs;
    }

    public void setMarked_msgs(List<MarkedMsgsEntity> marked_msgs) {
        this.marked_msgs = marked_msgs;
    }

    public static class MarkedMsgsEntity {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
