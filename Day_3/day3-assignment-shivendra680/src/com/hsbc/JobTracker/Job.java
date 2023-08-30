package com.hsbc.JobTracker;

public class Job {
	private String jobName;
	private String owner;
	private String effortsRequired;
	private String monthofCreation;
	private String yearofCreation;
	private String status;
	private String jobID;
	
	private static int jobCount = 0;
	
	//Que 1a
	public Job(String jobName, String owner) {
		//1b
		if(jobName == null || owner == null) {
			 System.out.println("jobname and owner cannot be null");
		}
		
		this.jobName = jobName;
		this.owner = owner;
		jobCount++;
	}
	
	public static int getJobCount() {
		return jobCount;
	}

	//Que 1c
	public Job(String jobName, String owner, String effortRequired, String monthOfCreation, String yearOfCreation, String status) {
        this(jobName, owner);
        this.effortsRequired = effortRequired;
        this.monthofCreation = monthOfCreation;
        this.yearofCreation = yearOfCreation;
        this.status = status;
    }
	
	public String getJobID() {
        return jobID;
    }

    
    private String generateJobID() {
        return jobName + "_" + jobCount;
    }
    
    public String showDetails() {
        return "Job ID: " + jobID + "\n" +
               "Job Name: " + jobName + "\n" +
               "Owner: " + owner + "\n" +
               "Effort Required: " + effortsRequired + " months\n" +
               "Month of Creation: " + monthofCreation + "\n" +
               "Year of Creation: " + yearofCreation + "\n" +
               "Status: " + status + "\n";
    }

}
