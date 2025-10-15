class Runs{
public static void main(String args []){
Animal.eats();
Animal.sleep();
Dogs d=new Dogs();
d.walks();
d.sound();
Vehicles.start();
Vehicles.stops();
Cars c=new Cars();
c.accelerates();
c.breaks();
Calculator.add();
Calculator.subtract();
ScientificCalculator s1=new ScientificCalculator();
s1.multiply();
s1.divide();
Banks.deposit();
Banks.withdraw();
Sbi s = new Sbi();
s.checkBalance();
s.loan();
Hospital.admitPatient();
 Hospital.dischargePatient();
CityHospital h = new CityHospital();
h.treatPatient();
h.billPatient();
}
}
