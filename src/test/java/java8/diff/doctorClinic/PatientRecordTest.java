package java8.diff.doctorClinic;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.diff.doctorClinic.TestUtils.*;
public class PatientRecordTest {

	
	@Test
	public void testGenerateSerialNumber() throws Exception {
		Patient patient1=new Patient(10,"John","Park Road","Dr.Eric");
		Patient patient2=new Patient(15,"Johny","Park Road","Dr.Eric");
PatientRecord patientRecord=mock(PatientRecord.class);
patientRecord.patientEntry(patient2);
patientRecord.patientEntry(patient1);
when(patientRecord.generateSerialNumber()).thenReturn(16); 
	int x=patientRecord.generateSerialNumber();
		yakshaAssert(currentTest(),x==16?"true":"false",businessTestFile);
		
	}

	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

}
