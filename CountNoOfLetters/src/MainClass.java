import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {

		countLetters("mississippi is the best");
	}

	//Counts the number of letter in a statement
	//Using String, HashMap
	public static void countLetters(String inputString) {
		System.out.println("\n################ START ################");
		String sampleString = inputString;
		int lengthOfSampleString = sampleString.length();
		char a[] = new char[lengthOfSampleString];
		Map<String, Integer> countMap = new HashMap<>();

		for (int i = 0; i < lengthOfSampleString; i++) {
			a[i] = sampleString.charAt(i);
		}
		System.out.print("Letters are: ");
		for (char j : a) {
			System.out.print(" " + j);
		}

		for (char letter : a) {
			String t;
			Integer count;
			if (letter !=' ') {
				if (!countMap.containsKey(t = Character.toString(letter))) {
					countMap.put(t, 1);
				} else {
					count = countMap.get(t);
					int countIntVal = count.intValue();
					count = Integer.valueOf(++countIntVal);
					countMap.replace(t, count);
				}
			}
		}
		System.out.println("\n---- Letter Count Map -----\n" + countMap.toString());
		System.out.println("\n################ END ################");
	}

}
