public class PracticeProblem {

	public static void main(String args[]) {}

	public static void selectionSortName(String[] names, int[] ages) {
		
		for (int i = 0; i < names.length - 1; i++) {
			
			int smallestIndex = i;

			for (int j = i+1; j < names.length; j++) {
				if (names[j].compareToIgnoreCase(names[smallestIndex]) < 0) {
					smallestIndex = j;
				}
			}

			String nameTemp = names[smallestIndex];
			names[smallestIndex] = names[i];
			names[i] = nameTemp;
			
			int ageTemp = ages[smallestIndex];
			ages[smallestIndex] = ages[i];
			ages[i] = ageTemp;
		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		
		for (int i = 0; i < ages.length - 1; i++) {
			
			int smallestIndex = i;
			
			for (int j = i+1; j < ages.length; j++) {
				if (ages[j] < ages[smallestIndex]) {
					smallestIndex = j;
				}
			}

			int ageTemp = ages[smallestIndex];
			ages[smallestIndex] = ages[i];
			ages[i] = ageTemp;

			String nameTemp = names[smallestIndex];
			names[smallestIndex] = names[i];
			names[i] = nameTemp;
		}
	}

}
