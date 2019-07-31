package com.zza.beanTest;

public class Task<DA> {
    private String taskPerson;
    private String taskName;
    private Integer taskId;
    private String taskTopic;
    private DA i;

    public String doExe(Integer num){
        return "method1"+num;
    }

    public String doExe(String num){
        return "method2"+num;
    }

    public void doExe(){

    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Task task = (Task) Class.forName("com.zza.beanTest.Task").newInstance();
        Object[] sig=Task.class.getSigners();
        System.out.println("");
    }
}
