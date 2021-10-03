/**
 * 
 */
package as.learning.ibmWatsonChat;

/**
 * @author aryan
 *
 */
public class NaturalLanguageClassifierTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authenticator authenticator = new IamAuthenticator("QxJWP7MEYY97pacSQpNPnDt26SkIynSA352iNSKVSiCt");
NaturalLanguageClassifier service = new NaturalLanguageClassifier(authenticator);

ClassifyOptions classifyOptions = new ClassifyOptions.Builder()
  .classifierId("<classifier-id>")
  .text("How are you doing?")
  .build();

Classification classification = service.classify(classifyOptions).execute().getResult();
System.out.println(classification);


	}

}
