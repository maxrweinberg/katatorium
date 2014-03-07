
package gov.weinberg.romanNumeral
import groovy.json.JsonSlurper
import java.util.prefs.Base64
import javax.xml.bind.DatatypeConverter

class WayBetterRomanizer {
	def wayBetter
	WayBetterRomanizer() {wayBetter = new JsonSlurper().parseText(new String(new DatatypeConverter().parseBase64Binary((new File('src/gov/weinberg/romanNumeral/youdontwannaknow').getText('UTF-8'))),'UTF-8'))}
	String reinterpret(String number){ wayBetter[number] ?: (wayBetter[number] ?: throwException())}
	String throwException(){throw new Exception()}
}
