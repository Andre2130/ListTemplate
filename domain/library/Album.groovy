package library

class Album {
	
	long id
	String albumTitle
	
	static belongsTo = [artist:Artist]
	static hasMany = [collect:Collect]
    static constraints = {
		albumTitle blank:false,unique:true
    }
	
	String toString(){
		return this.albumTitle;
	}
}
