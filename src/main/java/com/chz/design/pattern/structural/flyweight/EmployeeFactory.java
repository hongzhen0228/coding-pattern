package com.chz.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String, Empolyee> EMPOLYEE_MAP = new HashMap<>();

    public static Empolyee getManager(String department){
        Manager manager = (Manager) EMPOLYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理：" + department);
            String reportContent = "部门汇报：此次报告的主要内容是。。。。。";
            manager.setReportContent(department + reportContent);
            System.out.println("创建报告： " + department);
            EMPOLYEE_MAP.put(department,manager);
        }
        return manager;
    }
}
