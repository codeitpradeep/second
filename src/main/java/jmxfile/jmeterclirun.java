package jmxfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class jmeterclirun {
	public static void main(String[] args) throws Exception {
		File jmeterHomePath;
		jmeterHomePath = new File(System.getProperty("jmeter.home", System.getenv("JMETER_HOME")));
		ProcessBuilder build_test = new ProcessBuilder("cmd.exe", "/c",
				"jmeter -n -t \"C:\\D\\apache-jmeter-5.4.3\\apache-jmeter-5.4.3\\bin\\examples\\CSVSample.jmx\" -l \"C:\\D\\resultsjmeter\\MyPlansesult.jtl\" -e -o \"C:\\D\\resultsjmeter\\html\"");
		build_test.directory(new File(jmeterHomePath.getPath()+"\\bin"));
		build_test.redirectErrorStream(true);
		Process p = build_test.start();
		Show_Results(p);
	}

	public static void Show_Results(Process p) throws IOException {
		BufferedReader output_reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String output = "";
		while ((output = output_reader.readLine()) != null) {
			System.out.println(output);
		}
	}
}
