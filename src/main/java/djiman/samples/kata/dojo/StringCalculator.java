package djiman.samples.kata.dojo;

import java.util.StringTokenizer;

import org.springframework.stereotype.Service;

/**
 * @author gorguindong
 *
 */
@Service
public class StringCalculator 
{
    /**
     * Somme la liste de string en parametre
     * @param pNumbers liste de string
     * @return somme de la liste de string
     * @throws Exception 
     */
    public int add(String pNumbers) throws Exception {
    	if(pNumbers.isEmpty()){
    		return 0;
    	}
    	int sum = 0;
    	try {
    	sum = compute(pNumbers);
    	} catch(Exception e) {
    		throw e;
    	}
		return sum;
    }

	private int compute(String pNumbers) throws Exception {
		StringTokenizer stringTokenizer = new StringTokenizer(pNumbers, "*,\n");
    	int sum = 0;
    	while (stringTokenizer.hasMoreElements()) {
			 int value = Integer.parseInt(stringTokenizer.nextToken());
			 if(value < 0){
				 throw new Exception();
			 }
			 if(value > 1000){
				 continue;
			 }
			sum = sum +  value;
		}
		return sum;
	}
}
