package gov.weinberg.romanNumeral

class Romanizer {
	def fullRomanDigitNumbers = [1,4,5,9,10,40,50,90,100,400,500,900,1000]
	def fullRomanDigits = ['I','IV','V','IX','X','XL','L','XC','C','CD','D','CM','M']
	def romanDigits = ['I' : 1, 'V' : 5, 'X' : 10, 'L' : 50, 'C' : 100, 'D' : 500, 'M' : 1000]
	
	String reinterpret(String number){
		try {
			numberToNumeral(number)	
		} catch(NumberFormatException e){
			numeralToNumber(number)
		}
	}
	
	String numberToNumeral(String numberString){
		def number = Integer.parseInt(numberString);
		def result = ''
		def index = fullRomanDigits.size - 1
		if(number >= 4000 || number < 1){
			throw new Exception()
		}
		while(index >= 0 && number > 0){
			if(fullRomanDigitNumbers[index] <= number){
				result += fullRomanDigits[index] 
				number -= fullRomanDigitNumbers[index]
			} else {
				index--
			}
		}
		result
	}
	
	String numeralToNumber(String numeral){
		def number = 0
		int lastNumeralIndex = 7;
		for(int i = 0; i < numeral.length() - 1; i++){
			String currentChar = numeral.getAt(i)
			if(romanDigits[currentChar] <  romanDigits[numeral.getAt(i+1)]){
				number -= romanDigits[currentChar]
			} else {
				number += romanDigits[currentChar]
			}
		}
		number += romanDigits[numeral.getAt(numeral.length() - 1)]
		number.toString()
	}
}
