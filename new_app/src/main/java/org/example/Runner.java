package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+7", "00000023", null);
        Phone phone2 = new Phone("+7", "00000023", "007");
        String fullNumber = PhoneUtil.getFullNumber(phone1);
        String phoneWithCode = PhoneUtil.getPhoneWithCode(phone2);

        log.info(fullNumber);
        log.info(phoneWithCode);
    }
}
