package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기를 한다.
//마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
//입력:
//이름: 홍길동
//점수: 90
//이름: 김영희
//점수: 85
//이름: exit
//
//출력:
//현재 저장된 점수 목록:
//홍길동 : 90
//김영희 : 85
public class Exam2 {
   public static void main(String[] args) {
      FileOutputStream fos = null;
      Scanner sc = new Scanner(System.in);
      FileInputStream fis = null;
      
      try {
         fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\full_stack_hms\\scores.txt",true);
         
         while(true) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            
            if(name.equalsIgnoreCase("exit")) {
               System.out.println("출력 : ");
               System.out.println("현재 저장된 점수 목록 : ");
               break;
            }
            
            System.out.print("점수 : ");
            String score = sc.nextLine();
            
            String line = name + " : " + score + "\n";
            
            fos.write(line.getBytes());
            
            System.out.println("생성 완료");
            
            
         }
         
      } catch (Exception e) {
         // TODO: handle exception
      } 
      
      //파일 내용 읽어오기
      try {
         File f = new File("C:\\Users\\admin\\Desktop\\full_stack_hms\\scores.txt");
         fis = new FileInputStream(f);
         byte[] buffer = new byte[(int) f.length()];
         fis.read(buffer);
         String content = new String(buffer,"UTF-8");
         System.out.println(content);   
      } catch (Exception e) {
         // TODO: handle exception
      }
      finally {
         try {
            if(fos != null) {
               fos.close();
            }
         } catch (Exception e2) {
            // TODO: handle exception
         }
      }
   }
}
