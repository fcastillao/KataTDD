public class Calculator {

	public int Add(String numbers) {

		if (numbers.equals("")) {
			return 0;

		} else {
			int s = 0;
			char ch;
			int x;
			for (x = 0; x < numbers.length(); x++) {

				if (Character.isDigit(numbers.charAt(x))) {
					ch = numbers.charAt(x);

					s = s + Character.getNumericValue(ch);
				}

			}
			return s;

		}

	}

}
