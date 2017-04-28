package udemy.rest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

//import java.util.Arrays;
//import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import udemy.json.domain.UdemyStudent;

@Path("/")
public class RestController {

	//rest/jsonUdemyStudent
	
	@GET
	@Produces("application/json")
	@Path("/jsonUdemyStudent")
	public Response getUdemyStudentJson() {
		
		UdemyStudent udemyStudent = new UdemyStudent();
		udemyStudent.setId(1);
		udemyStudent.setduration(5);
		udemyStudent.setadcontent("Chevrolet Camaro Amore 2019 Lease at $270/month");
		
		return Response.ok(udemyStudent).build();
	}
	
	
	//rest/jsonUdemyStudentList
	
	@GET
	@Produces("application/json")
	@Path("/jsonUdemyStudentList")
	public Response getUdemyStudentJsonList() {
		
		UdemyStudent udemyStudent = new UdemyStudent();
		udemyStudent.setId(2);
		udemyStudent.setduration(7);
		udemyStudent.setadcontent("Chevrolet Camaro Amore 2019 Lease at $280/month");
		
		UdemyStudent udemyStudent2 = new UdemyStudent();
		udemyStudent2.setId(3);
		udemyStudent2.setduration(9);
		udemyStudent2.setadcontent("Chevrolet Camaro Amore 2019 Lease at $290/month");
		
		List<UdemyStudent> udemyStudentList  = Arrays.asList(udemyStudent,udemyStudent2);
		
		return Response.ok(udemyStudentList).build();
		
	}

	
	@POST
	@Consumes("application/json")
	@Path("/jsonPost")
	public Response post(String json) {
		System.out.println("post: " + json);
		return Response.ok().build();
	}
	
}
