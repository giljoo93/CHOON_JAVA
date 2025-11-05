/*  회사에서 운영 중인 웹 서비스의 로그 시스템에 
사용자 활동 로그를 남기는 기능을 추가하라는 업무가 
주어졌다고 가정해볼게. */


package Copilot_Example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _01ActivityLogger {

    public static void log(String username, String action) {
        LocalDateTime now = LocalDateTime.now();
        String timestamp = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("[" + timestamp + "] User: " + username + " Action: " + action);
    }
}