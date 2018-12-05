package com.thread.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteThread implements Runnable {
	
	private String filePath;
	
	public WriteThread(String filePath) {
		this.setFilePath(filePath);
	}

	@Override
	public void run() {
		File file = new File(getFilePath());
		FileWriter writer = null;

		try {
			writer = new FileWriter(file);
			if (file.exists()) {
				file.delete();
				file.createNewFile();
				writeData(writer);
			} else {
				file.createNewFile();
				writeData(writer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void writeData(FileWriter writer) throws IOException, InterruptedException {
		for (int i = 0; i < 2; i++) {
			writer.write("the sum \n");
			Thread.sleep(1000);
		}
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
