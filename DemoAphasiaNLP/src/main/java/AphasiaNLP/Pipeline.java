package AphasiaNLP;
import edu.stanford.nlp.pipeline.*;

import java.io.File;
import java.util.Properties;

public class Pipeline {

	private static Properties properties;
	private static String propertiesName = "tokenize,ssplit,pos,lemma,ner,parse";
	private static StanfordCoreNLP stanfordCoreNLP;
	
	private Pipeline() {
		
	}
	
	static {
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
		//properties.setProperty("parse.model", "edu/stanford/nlp/models/srparser/englishSR.ser.gz");
	    properties.setProperty("parse.maxlen", "100");
	   properties.setProperty("ssplit.eolonly","true");
	   properties.setProperty("output.prettyPrint", "false");
	   properties.setProperty("-outputDirectory", "D:\\Users\\ronak\\eclipse-workspace\\AphasiaNLP\\DemoAphasiaNLP\\resources\\output\\a.txt");
	   properties.setProperty("-outputFormat", "text");

	}
	
	
	
	public static StanfordCoreNLP getPipeline() {
		if(stanfordCoreNLP == null) {
			stanfordCoreNLP = new StanfordCoreNLP(properties);
		}
		return stanfordCoreNLP;						
	}
	
	
	
	
}
