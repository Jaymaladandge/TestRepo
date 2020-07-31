package com.csvRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

public class CSVFileRead {

	public static void main(String[] args) {

		File[] files = new File("resource\\csv").listFiles();

		List<String[]> allLines = new ArrayList<>();
		allLines.add(new String[] { "Symbol", "Range", "Timestamp" });

		for (File file : files) {
			List<Stock> list = CSVFileRead.readStockFromCSV(file.getAbsolutePath());

			for (Stock stock : list) {
				double range = stock.getHigh() - stock.getLow();
				allLines.add(new String[] { stock.getSymbol(), String.valueOf(range), stock.getTimestamp() });
			}
		}

		writeDataOnce("resource\\destination\\new.csv", allLines);
	}

	private static List<Stock> readStockFromCSV(String filePath) {

		List<Stock> stocks = new ArrayList<>();

		try (FileReader reader = new FileReader(filePath);
				CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();) {
			// read data at once
			List<String[]> list = csvReader.readAll();

			for (String[] nextRecord : list) {
				Stock stock = createStock(nextRecord);
				stocks.add(stock);
			}
//			Read data line by line
//			String[] nextRecord;
//			while ((nextRecord = csvReader.readNext()) != null) {
//				Stock stock = createStock(nextRecord);
//				stocks.add(stock);
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stocks;
	}

	private static Stock createStock(String[] data) {
		String symbol = data[0];
		String series = data[1];
		double open = Double.valueOf(data[2]);
		double high = Double.valueOf(data[3]);
		double low = Double.valueOf(data[4]);
		double close = Double.valueOf(data[5]);
		double last = Double.valueOf(data[6]);
		double prevClose = Double.valueOf(data[7]);
		double tottrdqty = Double.valueOf(data[8]);
		double tottrdval = Double.valueOf(data[9]);
		String timestamp = data[10];
		long totalRades = Long.valueOf(data[11]);
		String isin = data[12];

		return new Stock(symbol, series, open, high, low, close, last, prevClose, tottrdqty, tottrdval, timestamp,
				totalRades, isin);
	}

	private static void writeDataOnce(String filePath, List<String[]> allLines) {

		try (FileWriter writer = new FileWriter(filePath); CSVWriter csvWriter = new CSVWriter(writer);) {
			csvWriter.writeAll(allLines);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
