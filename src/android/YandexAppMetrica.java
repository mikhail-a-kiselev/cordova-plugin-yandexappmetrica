package com.codemech.yandexappmetrica;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class YandexAppMetrica extends CordovaPlugin {
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		YandexMetricaConfig config = YandexMetricaConfig.newConfigBuilder("4c973fbf-0ee7-4401-a0f0-157cd0817a10").build();
        // ������������� AppMetrica SDK.
        YandexMetrica.activate(cordova.getActivity().getApplicationContext(), config);
        // ������������ ���������� �������������.
        
       YandexMetrica.enableActivityAutoTracking(cordova.getActivity().getApplication());
	}
}