package Fail;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SmartwatchImpl_fail implements IWatch{
    @Override
    public void getTime() {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        System.out.println(format.format(new Date()));
    }

    @Override
    public void getEmailNotification() {
        System.out.println("Tienes 2 correos");
    }
}
