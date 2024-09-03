package pl.dom;

public class Pracownik {

	int aid;
	String aname;
	
public Pracownik() {
	// TODO Auto-generated constructor stub
}



public Pracownik(int aid, String aname) {
	this.aid = aid;
	this.aname = aname;
}



@Override
public String toString() {
	return "Pracownik [aid=" + aid + ", aname=" + aname + "]";
}



public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getAname() {
	return aname;
}

public void setAname(String aname) {
	this.aname = aname;
}	

}
