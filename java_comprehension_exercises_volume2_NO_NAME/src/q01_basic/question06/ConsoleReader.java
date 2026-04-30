package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {
	/**
	 * 文字列の標準入力。
	 * 
	 * @return 入力文字列
	 * @throws IOException
	 */
	public String inputString() throws IOException {
		System.out.print("input password>>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = br.readLine();

		return password;
	}

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		System.out.print("input id>>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String idString = br.readLine();
		int id = Integer.parseInt(idString);

		return id;

	}

}
