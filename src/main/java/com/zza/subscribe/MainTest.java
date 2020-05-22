package com.zza.subscribe;

public class MainTest {
    public static void main(String[] args) {
        Service service = new MessageService();

        Observice user1 = new VipUser("1","小李");
        Observice user2 = new VipUser("2","小王");
        Observice user3 = new VipUser("3","小张");

        service.addSubscribe(user1);
        service.addSubscribe(user2);
        service.addSubscribe(user3);

        service.push("大家好，这是第一条推送");

        service.removeSubscribe(user2);
        service.removeSubscribe(user2);

        service.push("大家好，这条推送没小王");

    }
}


