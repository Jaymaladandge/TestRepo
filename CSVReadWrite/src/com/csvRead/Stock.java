package com.csvRead;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Stock {

	private String symbol;
	private String series;
	private double open, high, low, close, last, prevClose, tottrdqty, tottrdval;
	private String timestamp;
	private long totalRades;
	private String isin;

	public Stock() {
		super();
	}

	public Stock(String symbol, String series, double open, double high, double low, double close, double last,
			double prevClose, double tottrdqty, double tottrdval, String timestamp, long totalRades, String isin) {
		super();
		this.symbol = symbol;
		this.series = series;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.last = last;
		this.prevClose = prevClose;
		this.tottrdqty = tottrdqty;
		this.tottrdval = tottrdval;
		this.timestamp = timestamp;
		this.totalRades = totalRades;
		this.isin = isin;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getLast() {
		return last;
	}

	public void setLast(double last) {
		this.last = last;
	}

	public double getPrevClose() {
		return prevClose;
	}

	public void setPrevClose(double prevClose) {
		this.prevClose = prevClose;
	}

	public double getTottrdqty() {
		return tottrdqty;
	}

	public void setTottrdqty(double tottrdqty) {
		this.tottrdqty = tottrdqty;
	}

	public double getTottrdval() {
		return tottrdval;
	}

	public void setTottrdval(double tottrdval) {
		this.tottrdval = tottrdval;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public long getTotalRades() {
		return totalRades;
	}

	public void setTotalRades(long totalRades) {
		this.totalRades = totalRades;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", series=" + series + ", open=" + open + ", high=" + high + ", low=" + low
				+ ", close=" + close + ", last=" + last + ", prevClose=" + prevClose + ", tottrdqty=" + tottrdqty
				+ ", tottrdval=" + tottrdval + ", timestamp=" + timestamp + ", totalRades=" + totalRades + ", isin="
				+ isin + "]";
	}

}







//Comparator<String[]> comp = new Comparator<String[]>() {
//
//	@Override
//	public int compare(String[] o1, String[] o2) {
//		Date date1 = null, date2 = null;
//		try {
//			date1 = new SimpleDateFormat("dd-mmm-yyyy").parse(o1[2]);
//			date2 = new SimpleDateFormat("dd-mmm-yyyy").parse(o2[2]);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return date1.compareTo(date2);
//	}
//};
//Collections.sort(allLines, comp);