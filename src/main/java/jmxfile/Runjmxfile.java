package jmxfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

public class Runjmxfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String slash = System.getProperty("file.separator");
		System.out.println(slash);
		File jmeterHomePath;
		jmeterHomePath = new File(System.getProperty("jmeter.home", System.getenv("JMETER_HOME")));
		if (jmeterHomePath.exists()) {

		}
		StandardJMeterEngine jmeter = new StandardJMeterEngine();

		// JMeterUtils.loadJMeterProperties("C:\\D\\apache-jmeter-5.4.3\\apache-jmeter-5.4.3\\bin\\jmeter.properties");

		JMeterUtils.loadJMeterProperties(jmeterHomePath.getPath() + "\\bin\\jmeter.properties");

		JMeterUtils.setJMeterHome(jmeterHomePath.getPath());

		JMeterUtils.initLogging();
		JMeterUtils.initLocale();

		try {
			SaveService.loadProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		// "C:\\D\\loadtesting\\Users.jmx"
		String filenmame = "C:\\D\\loadtesting\\Users.jmx";
		File in = new File(filenmame);
		HashTree testPlanTree = SaveService.loadTree(in);

		Summariser summer = null;
		String summariserName = JMeterUtils.getPropDefault("summariser.name", "summary");
		if (summariserName.length() > 0) {
			summer = new Summariser(summariserName);
		}

		// Store execution results into a .jtl file
		String logFile = "C:\\D\\loadtesting\\" + "example.jtl";
		ResultCollector logger = new ResultCollector(summer);
		logger.setFilename(logFile);
		testPlanTree.add(testPlanTree.getArray()[0], logger);

		jmeter.configure(testPlanTree);
		jmeter.run();

	}

}
