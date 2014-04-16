package br.com.easycook.log4j;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;

public class DateFileAppender extends FileAppender{
	@Override
	public void setFile(String file) {
		super.setFile(file + new SimpleDateFormat("ddMMyyyy-HHmmss").format(new Date()) + ".log" );
	}
}
