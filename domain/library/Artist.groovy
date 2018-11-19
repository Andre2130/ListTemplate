package library

class Artist {

	String id
	String artistName
	
	static hasMany=[album:Album]
    static constraints = {
		artistName blank:false,maxSize:100
    }
	String toString(){
		return this.artistName;
	}
}
