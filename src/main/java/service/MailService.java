package service;

import user.User;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("WYSŁANY EMAIL");
    }
}
