package com.chz.design.pattern.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("name:" + i+"");
            mailTemp.setEmailAddress("address:" + "123@qq.com");
            mailTemp.setContent("Congrats");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
