package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class HighScoreApp {

	public static void main(String[] args) {
		final String FILE = "score.csv";
		final int MAX = 100000;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		boolean isHighScore = false;
		System.out.println("****乱数ゲーム****");
		HighScore hs = readFile(FILE);
		int highScore;
		if (hs == null) {
			System.out.println("HighScore 0");
			highScore = 0;
		} else {
			System.out.println("HighScore" + hs);
			highScore = hs.getScore();
		}
		while (true) {
			System.out.print("やりますかyes…y no…n>");
			String select = sc.next();
			if (select.equals("n")) {
				System.out.println("アプリを終了します");
				if (isHighScore) {
					Date today = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
					String date = sdf.format(today);
					hs = new HighScore(highScore, date);
					writeRecord(FILE, hs);
				}
				sc.close();
				break;
			}
			int no = rnd.nextInt(MAX) + 1;
			System.out.println(no);
			if (no > highScore) {
				highScore = no;
				isHighScore = true;
				System.out.println("new Record");
			}
		}
	}

	public static HighScore readFile(String file) {
		HighScore hs = null;
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			String line = br.readLine();
			if (line != null && !line.equals("")) {
				String[] data = line.split(",");
				hs = new HighScore(Integer.parseInt(data[0]), data[1]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hs;

	}

	public static void writeRecord(String fileName, HighScore hs) {
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			bw = new BufferedWriter(osw);
			bw.append(hs.toCSV());
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class HighScore {
	private int score;
	private String date;

	public HighScore(int score, String date) {
		this.score = score;
		this.date = date;
	}

	@Override
	public String toString() {
		return this.score + " " + this.date;
	}

	public String toCSV() {
		return this.score + "," + this.date;
	}

	public int getScore() {
		return this.score;
	}
}