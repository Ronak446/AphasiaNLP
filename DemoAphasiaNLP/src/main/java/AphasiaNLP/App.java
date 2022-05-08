package AphasiaNLP;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ){
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "Cinderella's dad was a widow.\r\n"
				+ "and he met the evil stepmother .\r\n"
				+ "and they got married.\r\n"
				+ "and the evil stepmother had two daughters.\r\n"
				+ "and then Cinderella's dad died.\r\n"
				+ "and she was forced to be a servant to a her stepmother and stepsisters.\r\n"
				+ "and they were not nice.\r\n"
				+ "and Cinderella was a a kind soul.\r\n"
				+ "and she, but, befriended the animals.\r\n"
				+ "and she looked longingly out the window at for a new life.\r\n"
				+ "the prince of the city, or kingdom it was time for him to marry.\r\n"
				+ "and they invited all the young women of the kingdom to a ball.\r\n"
				+ "and the the the Cinderella's stepsisters were excited about it.\r\n"
				+ "and Cinderella was too.\r\n"
				+ "and she looked in her mother's old chest and found a dress that she, to sew and do some alterations.\r\n"
				+ "and when they were going to the ball her stepsisters said that she could not go.\r\n"
				+ "and they ripped the dress off of Cinderella.\r\n"
				+ "and Cinderella was so upset.\r\n"
				+ "and then she was sitting there.\r\n"
				+ "and her fairy godmother came and said I will do, I will take you to the ball.\r\n"
				+ "she made her a dress with glass slippers and turned her pumpkin and her animal friends into a stagecoach.\r\n"
				+ "and she said but this will only last until midnight.\r\n"
				+ "and so Cinderella went to the ball.\r\n"
				+ "they had, she had fabulous time.\r\n"
				+ "she danced with the prince\r\n"
				+ "and when it was almost midnight she hurried down to her stagecoach.\r\n"
				+ "and but she lost one of her slippers.\r\n"
				+ "and she made it out on time.\r\n"
				+ "the the the next day, or couple of days later they were saying who left this slipper.\r\n"
				+ "and the the prince and his father came to see who who would it fit.\r\n"
				+ "and they came to the Cinderella's house.\r\n"
				+ "and the stepmother let, put Cinderella in the attic so she could not participate.\r\n"
				+ "and then when the stepsisters tried to, the slipper on the stepmother tripped. the guy that was carrying it, the slipper.\r\n"
				+ "and it broke.\r\n"
				+ "and then her, oh Cinderella''s animals friends unlocked the door.\r\n"
				+ "and Cinderella came down and said I have the other glass slipper.\r\n"
				+ "and then the prince married Cinderella.\r\n"
				+ "and they lived happily ever after. He is good. They are good. He was good. He gets caught. He got cought. They were good.";

		//     text = "On 20 July 1969, Apollo 11 was the first manned mission to land on the Moon. Six manned US missions successfully landed on the Moon between 1969 and 1972. There were also numerous unmanned landings.";
		CoreDocument coreDoc = new CoreDocument(text);
		Annotation anno = new Annotation(text);

		stanfordCoreNLP.annotate(coreDoc);
		stanfordCoreNLP.annotate(anno);



		List<CoreLabel> coreLabelList = coreDoc.tokens(); 
		List<CoreSentence>coreSentence = coreDoc.sentences(); 
		ArrayList<String> corePos = new ArrayList<String>();


		//  for(CoreSentence b:coreSentence) 
		//  { System.out.println(b.text()); }

		for(CoreLabel b : coreLabelList ) {
			
		

				if(!b.value().toLowerCase().equals((b.lemma()+"").toLowerCase())) {
					System.out.println(b.value() +"," + b.lemma());
				}
			}
	


		/*
		 * List<CoreMap> something =
		 * anno.get(CoreAnnotations.SentencesAnnotation.class); for(CoreMap
		 * map:something) { Tree tree =
		 * map.get(TreeCoreAnnotations.TreeAnnotation.class);
		 * 
		 * System.out.println(tree.pennString());
		 * System.out.println("055555555555555555550000"); tree.printLocalTree();
		 * System.out.println("00000000000000000000000000000000000");
		 * 
		 * }
		 */
		try {
			//FileOutputStream os = new FileOutputStream(new File("D:\\Users\\ronak\\eclipse-workspace\\AphasiaNLP\\DemoAphasiaNLP\\resources\\output\\", "nlp.conll"));
			//CoNLLUOutputter.conllUPrint(anno, os);
			//	stanfordCoreNLP.xmlPrint(anno, os);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
