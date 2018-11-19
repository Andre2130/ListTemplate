package library

class Member {
	String id
	String memberName

	static hasMany=[collect:Collect]
    static constraints = {
		memberName blank:false,maxSize:100
    }
	String toString(){
		return this.memberName;
	}
}
