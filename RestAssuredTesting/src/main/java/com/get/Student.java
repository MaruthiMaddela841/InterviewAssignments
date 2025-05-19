package com.get;

import java.util.List;
	
	 class Student {
	    public int id;
	    public String email;
	    public String first_name;
	    public String last_name;
	    public String avatar;
	}

	 class Support {
	    public String url;
	    public String text;
	}

	 class StudentResponse {
	    public Student data;
	    public Support support;
	}
	 
	  class StudentListResponse {
		    public int page;
		    public int per_page;
		    public int total;
		    public int total_pages;
		    public List<Student> data;
		    public Support support;
		}
