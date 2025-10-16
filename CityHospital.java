
class CityHospital extends Hospital {
	  void treatPatient() {
	System.out.println("Treat patient"); 
	}
    void billPatient() {
	System.out.println("Bill patient"); 
}
public static void main(String args []){
	Hospital.admitPatient();
 Hospital.dischargePatient();
 Hospital h1=new Hospital();
 h1.treatPatient();
 h1.billPatient();
CityHospital h = new CityHospital();
h.treatPatient();
h.billPatient();
Hospital h2=new CityHospital();
h2.treatPatient();
h2.billPatient();
}
}