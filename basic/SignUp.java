package basic;

import java.io.*;
import java.util.*;

public class SignUp {
    private static final String USER_DATA_PATH = "database/userdata.txt";

    public static void register(Scanner scanner) {
        System.out.print("ID: ");
        String id = scanner.nextLine().trim();

        System.out.print("PW: ");
        String pw = scanner.nextLine().trim();

        System.out.print("Date of Birth(8 digits): ");
        String birth = scanner.nextLine().trim();

        System.out.print("E-mail: ");
        String email = scanner.nextLine().trim();

        // 중복 검사
        if (isDuplicate(id, birth, email)) {
            System.out.println("This account is already registered.");
            return;
        }

        // 저장
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_DATA_PATH, true))) {
            writer.write(id + "," + pw + "," + birth + "," + email);
            writer.newLine();
            System.out.println("Congratulations on signing up!");
        } catch (IOException e) {
            System.err.println("회원정보 저장 중 오류 발생: " + e.getMessage());
        }
    }

    private static boolean isDuplicate(String id, String birth, String email) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_DATA_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 4) continue;

                String existingId = parts[0];
                String existingBirth = parts[2];
                String existingEmail = parts[3];

                if (existingId.equals(id) || existingBirth.equals(birth) || existingEmail.equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("중복 검사 중 오류 발생: " + e.getMessage());
        }
        return false;
    }
}