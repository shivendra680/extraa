package com.hsbc.JobTracker;

public class MultiOwnerJob extends Job {
	
	 private String secondOwner;

	    public MultiOwnerJob(String jobName, String owner, String secondOwner, String effortRequired, String monthOfCreation,
	                         String yearOfCreation, String status) {
	        super(jobName, owner, effortRequired, monthOfCreation, yearOfCreation, status);
	        this.secondOwner = secondOwner;
	    }

	    public String getSecondOwner() {
	        return secondOwner;
	    }

}
