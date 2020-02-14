package br.com.rsinet_hub.appium.Util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
	 public static String dataHoraParaArquivo() {
	        Timestamp ts = new Timestamp(System.currentTimeMillis());
	        return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
	 }
}
