package com.okayokya.userService.utils;

/***
 * @ClassName: TempSession
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/29 18:51
 * @version : V1.0
 */
public class TempSession  {
    private String accountInRedis;
    private String token;
    private long expire;
    private int status;

    public TempSession(String accountInRedis, String token, long expire, int status) {
        this.accountInRedis = accountInRedis;
        this.token = token;
        this.expire = expire;
        this.status = status;
    }

    public String getAccountInRedis() {
        return accountInRedis;
    }

    public void setAccountInRedis(String accountInRedis) {
        this.accountInRedis = accountInRedis;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpire() {
        return expire;
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public TempSession() {
    }

    @Override
    public String toString() {
        return "TempSession{" +
                "account='" + accountInRedis + '\'' +
                ", token='" + token + '\'' +
                ", expire=" + expire +
                ", status=" + status +
                '}';
    }
}
