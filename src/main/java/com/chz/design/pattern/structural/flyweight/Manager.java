package com.chz.design.pattern.structural.flyweight;

public class Manager implements Empolyee{
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String department;

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
