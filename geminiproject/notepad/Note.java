package geminiproject.notepad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String content;
    private LocalDateTime createdAt;

    public Note(String content) {
        this.content = content;
        this.createdAt = LocalDateTime.now(); // 현재 시간으로 설정
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // 날짜 포맷을 예쁘게 출력하기 위한 메서드 (선택 사항)
    public String getFormattedCreatedAt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return createdAt.format(formatter);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", getFormattedCreatedAt(), content);
    }
}
