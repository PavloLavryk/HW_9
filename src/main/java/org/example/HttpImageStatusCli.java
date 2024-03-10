package org.example;


import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP status code: ");
        try {
            int code = scanner.nextInt();
            HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
            try {
                downloader.downloadStatusImage(code);
                System.out.println("Image downloaded successfully!");
            } catch (Exception e) {
                System.out.println("There is no image for HTTP status " + code);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}