package com.project.resume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView viewResume()
	{
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("firstName", "Najiya");
		model.put("lastName", "P");
		model.put("email", "najiya.shajifrq@gmail.com");
		model.put("contact", "9745008632");
		model.put("houseName", "ABC House");
		model.put("district", "Malappuram");
		model.put("street", "PMNA");
		model.put("state", "Kerala");
		model.put("pin", "679322");
		model.put("internShip", "Pursuing Internship in Java, Spring Framework from Baabtra.com, Calicut");
		model.put("objective", "Seeking a suitable position in a challenging environment that offers long term opportunities and stability where my skills and knowledge can be utilized for the growth of the organization and myself.");
		model.put("declaration", "I hereby declare tht the above stated information is true to the bet of my knowledge and belief");
		
		List<String> technicalSkills=new ArrayList<String>();
		technicalSkills.add("Java with Springboot Framework and MySQL");
		technicalSkills.add("Python with Django Framework and MySQL");
		technicalSkills.add("PHP with Codeigniter Framework and MySQL");
		technicalSkills.add("Android app development in Eclipse IDE and MySQL");
		technicalSkills.add("HTML, CSS, Javascript, Jquery, Ajax");
		technicalSkills.add("Basic Knowledge in C,C++,C#.net");
		model.put("tech", technicalSkills);
		
		List<String> academicProfile=new ArrayList<String>();
		academicProfile.add("Post-Graduation : MCA (2016-2019) from UOC with 83% score");
		academicProfile.add("Graduation: BCA (2009-2012) from UOC with 94% score");
		academicProfile.add("Higher Secondary: (2007-2009) from CBSE with 87% score");
		academicProfile.add("SSLC: (2007) from CBSE with 91% score");
		academicProfile.add("Post-Graduation : MCA (2016-2019)");
		model.put("academic", academicProfile);
		return new ModelAndView("resume","model",model);
	}
}
