package com.just.agentwebx5_sample;

/**
 * Created by cenxiaozhong on 2017/5/22.
 */

public class WebActivity extends BaseWebActivity {

    @Override
    public String getUrl() {

        return super.getUrl();
    }

    @Override
    protected void onStart() {




        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        //测试Cookies
        /*try {

            String targetUrl="";
            Log.i("Info","cookies:"+ AgentWebX5Config.getCookiesByUrl(targetUrl="http://www.jd.com"));
            AgentWebX5Config.removeAllCookies(new ValueCallback<Boolean>() {
                @Override
                public void onReceiveValue(Boolean value) {
                    Log.i("Info","onResume():"+value);
                }
            });

            String tagInfo=AgentWebX5Config.getCookiesByUrl(targetUrl);
            Log.i("Info","tag:"+tagInfo);
            AgentWebX5Config.syncCookies("http://www.jd.com","ID=IDHl3NVU0N3ltZm9OWHhubHVQZW1BRThLdGhLaFc5TnVtQWd1S2g1REcwNVhTS3RXQVFBQEBFDA984906B62C444931EA0");
            String tag=AgentWebX5Config.getCookiesByUrl(targetUrl);
            Log.i("Info","tag:"+tag);
            AgentWebX5Config.removeSessionCookies();
            Log.i("Info","removeSessionCookies:"+AgentWebX5Config.getCookiesByUrl(targetUrl));
        }catch (Exception e){
            e.printStackTrace();
        }*/

    }
}
