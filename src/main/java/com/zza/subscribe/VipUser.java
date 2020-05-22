package com.zza.subscribe;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VipUser implements Observice {

    private String id;
    private String username;

    @Override
    public void gotIt(Object s) {
        System.out.print("收到了推送:\t");
        System.out.println(s);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.username;
    }

}
