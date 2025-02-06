package org.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class HeadMaster implements School{
    private String job;
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "HeadMaster{" +
                "job='" + job + '\'' +
                '}';
    }
    @Override
    public void hierarchy() {
        System.out.println("I am the head of the school");
    }
}
