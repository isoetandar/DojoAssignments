package com.irwan.firstproject;


//Below is putting in comment because class for Query Parameters  and Annotation
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController  	//convenience annotation that does nothing more than adding the @Controller and
					//@ResponseBody annotations


//public class HomeController {
//	
//	@RequestMapping("/") //Allow to Response to root request
//	public String hello() { //How to response to root route request
//		return "Hello World!. THIS IS HomeController";
//	}
//}

// Below is Search Querry
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HomeController {
//    @RequestMapping("/")
//    public String index(@RequestParam(value="q", required=false) String searchQuery) {
//    	if (searchQuery == null) {
//    		return "You searched for: nothing";
//    	} else {
//        return "You searched for: " + searchQuery;}
//    }
//}

//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class HomeController {
//    @RequestMapping("/m/{track}/{module}/{lesson}")
//    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
//    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
//    }
//}