package com.azay.mobile;

/**
 * Created by kong_mono on 7/28/2016 AD.
 */

public class DataEntity {

    /**
     * access_token : 652b9726f915da201915a97d192c4fb5
     * client_id : AZAYDNA2014UX
     * client_secret : a3f63ee0f0fc44848eeef91109396295
     * code : 43000
     * expires : 27/08/2016 15:11
     * oauth_flag : Y
     * platform : ios
     * version_no : 2.2.3
     */

    private String access_token;
    private String client_id;
    private String client_secret;
    private String code;
    private String expires;
    private String oauth_flag;
    private String platform;
    private String version_no;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getOauth_flag() {
        return oauth_flag;
    }

    public void setOauth_flag(String oauth_flag) {
        this.oauth_flag = oauth_flag;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getVersion_no() {
        return version_no;
    }

    public void setVersion_no(String version_no) {
        this.version_no = version_no;
    }
}
