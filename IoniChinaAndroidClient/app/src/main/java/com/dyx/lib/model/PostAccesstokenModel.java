package com.dyx.lib.model;

/**
 * project name：IoniChinaAndroidClient
 * class describe：
 * create person：dayongxin
 * create time：16/9/11 下午3:57
 * alter person：dayongxin
 * alter time：16/9/11 下午3:57
 * alter remark：
 */
public class PostAccesstokenModel {

    /**
     * success : true
     * loginname : req.user.loginname
     */

    private boolean success;
    private String loginname;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
}
