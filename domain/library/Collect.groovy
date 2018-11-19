package library
import java.util.Date;

class Collect {

	Date issueDate
	Date dueDate
	Date reciveDate
	
	static belongsTo=[album:Album]
	static hasOne=[member:Member]
    static constraints = {
		issueDate nullable:false
		dueDate nullable:false
		reciveDate nullable:false
    }
}
