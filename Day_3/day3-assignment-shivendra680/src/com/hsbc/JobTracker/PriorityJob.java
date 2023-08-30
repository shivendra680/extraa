package com.hsbc.JobTracker;

public class PriorityJob extends Job{
	private String priority;
    private String monitoredBy;

    public PriorityJob(String jobName, String owner, String effortRequired, String monthOfCreation, String yearOfCreation,
                       String status, String priority, String monitoredBy) {
        super(jobName, owner, effortRequired, monthOfCreation, yearOfCreation, status);
        this.priority = priority;
        this.monitoredBy = monitoredBy;
    }
    
    public String getPriority() {
        return priority;
    }

    public String getMonitoredBy() {
        return monitoredBy;
    }

}
